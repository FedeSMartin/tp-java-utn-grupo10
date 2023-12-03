package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import model.InfoBDPronostico;
import model.ResultadoEnum;
import view.Ventana;
import view.VisorConsola;
import model.InfoBDPartido;
import model.InfoBDPronostico;

public class Logica {

	private List<Pronostico> pronosticos;
	private List<Partido> partidos;
	private static List<Participante> participantes;
	
	// se setablece el valor de cada acierto
	private int puntos = 2; 
	
	public Logica() {

		// inicializacion y carga de datos desde 
		// las clases DatosBDPronosticos y DatosBDPartidos
		InfoBDPronostico datosBDPronostico = new InfoBDPronostico();
		InfoBDPartido datosBDPartido = new InfoBDPartido();

		this.pronosticos = datosBDPronostico.obtenerDatosPronosticos();
		this.partidos = datosBDPartido.obtenerDatosPartidos();

		iniciarLogica();
	}
	
	public static List<Participante> getParticipantes() {
		return participantes;
	}

	public void iniciarLogica() {
		
		// Inicializamos la lista de participantes
		participantes = new ArrayList<>(); 

		int longitudPronostico = pronosticos.size();

		// se cicla la lectura de partidos y se comparan con los pronosticos
		for (int i = 0; i < longitudPronostico; i++) {
			procesarPronostico(i);
		}

		// ordenamos la lista de participantes de mayor 
			// a menor segun la cantidad de puntos
		participantes.sort(Collections.reverseOrder());
		
		// comparador personalizado
		participantes.sort(Comparator.comparingInt(Participante::getPuntos).reversed());

		// mostramos los resultados por consola/ventana
		mostrarResultados();
	}

	private void procesarPronostico(int indice) {

		Pronostico pronostico = pronosticos.get(indice);

		String[] datosPronostico = pronostico.toString().split(",");

		ResultadoEnum resultadoPronostico = obtenerResultadoPronostico(datosPronostico);
		ResultadoEnum resultadoPartido = obtenerResultadoPartido(indice);

		compararResultados(datosPronostico[2], resultadoPronostico, resultadoPartido);
	}

	private ResultadoEnum obtenerResultadoPronostico(String[] datosPronostico) {

		if (datosPronostico[4].equalsIgnoreCase("X")) {

			return ResultadoEnum.GANA_EQUIPO1;

		} else if (datosPronostico[5].equalsIgnoreCase("X")) {

			return ResultadoEnum.EMPATE;

		} else if (datosPronostico[6].equalsIgnoreCase("X")) {

			return ResultadoEnum.GANA_EQUIPO2;

		}
		
		// en el caso donde ninguno de los resultados es valido
		return null; 
	}

	private ResultadoEnum obtenerResultadoPartido(int indice) {

		Partido partido = partidos.get(indice % partidos.size());
		
		int golesEq1 = Integer.parseInt(partido.toString().split(",")[3]);
		int golesEq2 = Integer.parseInt(partido.toString().split(",")[4]);

		if (golesEq1 > golesEq2) {

			return ResultadoEnum.GANA_EQUIPO1;

		} else if (golesEq1 < golesEq2) {

			return ResultadoEnum.GANA_EQUIPO2;

		} else {

			return ResultadoEnum.EMPATE;

		}
	}
	
	// se determina, por medio de la X en una tabla
		// el estado del pronostico
	private void compararResultados(
			String nombreParticipante, 
			ResultadoEnum resultadoPronostico,
			ResultadoEnum resultadoPartido) {

		// busca el participante en la lista existente
		Optional<Participante> participanteExistente = 
				participantes.stream().filter(p -> 
				p.getNombre().equals(nombreParticipante)).findFirst();

		// si el participante no existe, crea uno nuevo
		Participante participante;
		
		if (participanteExistente.isPresent()) {
			
			participante = participanteExistente.get();
			
		} else {
			
			participante = new Participante(nombreParticipante);
			
			// agrega el nuevo participante a la lista
			participantes.add(participante); 
			
		}

		// actualiza los puntos solo si hay acierto
		if (resultadoPronostico == resultadoPartido) {
			participante.sumarPuntos(puntos);
		}
	}
	
	/////////////////////////////////////////////////////////
	
	// envia los datos para ser visualizados
	private void mostrarResultados() {
		
		porConsola(); // muestra informacion por consola
		//porVentana(); // muestra informacion por ventana
	}
	
	/////////////////////////////////////////////////////////
	
	// muestra informacion por consola
	private void porConsola() {
		
		VisorConsola.mostrarResultados(participantes);
	}
	
	// muestra informacion por ventana
	private void porVentana() {
		
		Ventana ventana = new Ventana();
	    ventana.setVisible(true);
	     
	}
}