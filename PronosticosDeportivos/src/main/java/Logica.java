import java.util.*;

public class Logica {

	private List<Pronostico> pronosticos;
	private List<Partido> partidos;
	private List<Participante> participantes;
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

	public void iniciarLogica() {

		participantes = new ArrayList<>(); // Inicializamos la lista de participantes

		int longitudPronostico = pronosticos.size();

		// se cicla la lectura de partidos y se comparan con los pronosticos
		for (int i = 0; i < longitudPronostico; i++) {
			procesarPronostico(i);
		}

		// Ordenamos la lista de participantes de mayor a menor según la cantidad de
		// puntos
		participantes.sort(Collections.reverseOrder());
		
		//comparador personalizado		
		participantes.sort(Comparator.comparingInt(Participante::getPuntos).reversed());

		// Mostramos los resultados por consola
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

		return null; // Manejar el caso donde ninguno de los resultados es válido
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

	private void compararResultados(String nombreParticipante, ResultadoEnum resultadoPronostico,
			ResultadoEnum resultadoPartido) {

		// buscar el participante en la lista existente
		Optional<Participante> participanteExistente = participantes.stream()
				.filter(p -> p.getNombre().equals(nombreParticipante)).findFirst();

		// si el participante no existe, crear uno nuevo
		Participante participante;
		if (participanteExistente.isPresent()) {
			participante = participanteExistente.get();
		} else {
			participante = new Participante(nombreParticipante);
			participantes.add(participante); // agregar el nuevo participante a la lista
		}

		// actualizar los puntos solo si hay acierto
		if (resultadoPronostico == resultadoPartido) {
			participante.sumarPuntos(puntos);
		}
	}

	private void mostrarResultados() {

		VisorConsola.mostrarResultados(participantes);
		//Ventana.mostrarResultados(participantes);
	}
}