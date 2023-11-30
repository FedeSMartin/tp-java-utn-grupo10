import java.util.*;

public class Logica {

	private List<Pronostico> pronosticos;
	private List<Partido> partidos;

	public Logica() {

		// Inicialización y carga de datos desde las clases DatosBDA y DatosBDB
		InfoBDPronostico datosBDPronostico = new InfoBDPronostico();
		InfoBDPartido datosBDPartido = new InfoBDPartido();

		this.pronosticos = datosBDPronostico.obtenerDatosPronosticos();
		this.partidos = datosBDPartido.obtenerDatosPartidos();

		iniciarLogica();

	}

	public void iniciarLogica() {

		int logitudPronostico = pronosticos.size();
		int logitudPartidos = partidos.size();

		ResultadoEnum resultadoPronostico = null;

		ResultadoEnum resultadoPartido = null;

		for (int i = 0; i < logitudPronostico; i++) {
			
///////////////////////PRONOSTICOS ///////////////

			Pronostico pronostik = pronosticos.get(i);

			String[] datosPronostico = pronostik.toString().split(",");

			if (datosPronostico[4].equalsIgnoreCase("X")) {

				resultadoPronostico = ResultadoEnum.GANA_EQUIPO1;
				//System.out.println("pronostico " + resultadoPronostico);

			} else if (datosPronostico[5].equalsIgnoreCase("X")) {

				resultadoPronostico = ResultadoEnum.EMPATE;
				//System.out.println("pronostico " + resultadoPronostico);
			} else if (datosPronostico[6].equalsIgnoreCase("X")) {

				resultadoPronostico = ResultadoEnum.GANA_EQUIPO2;
				//System.out.println("pronostico " + resultadoPronostico);

			}

////////////////////////   PARTRIDOS   ////////////////////////////

			Partido partido = partidos.get(i % logitudPartidos);

			String[] datosPartido = partido.toString().split(", |");

			// se convierte las columnas de los golas a numeros 
			
			String datosGolesEq1 = partido.toString().split(",")[3];
			String datosGolesEq2 = partido.toString().split(",")[4];

			int golesEq1 = Integer.parseInt(datosGolesEq1);
			int golesEq2 = Integer.parseInt(datosGolesEq2);

			// resultado de los partidos

			if (golesEq1 > golesEq2) {

				resultadoPartido = ResultadoEnum.GANA_EQUIPO1;
				// System.out.println("Partido " + resultadoPartido);

			} else if (golesEq1 < golesEq2) {

				resultadoPartido = ResultadoEnum.GANA_EQUIPO2;
				// System.out.println("Partido " + resultadoPartido);

			} else if (golesEq1 == golesEq2) {

				resultadoPartido = ResultadoEnum.EMPATE;
				// System.out.println("Partido " + resultadoPartido);

			}
			
/////////////////////////////////////////////////////////////////////////////////
			
			// comparacion de pronosticos contra resultados del partido
			
			Participante participante = new Participante(datosPronostico[2]);
			
			if (resultadoPronostico == resultadoPartido) {

				System.out.println("se suma un puntos a: " + datosPronostico[2]);
				
				participante.sumarPuntos(1); // Suma 1 punto (hay que hacerlo seteable)

			} else {

				System.out.println("no se suma nada a: " + datosPronostico[2]);
			}
			

			
		}// fin del bucle for
		
		
		

	}// llave de "iniciarLogica()"
	
	
	
}// llave de la clase

//		Pronostico pron = pronosticos.get(0);
//		Partido par = partidos.get(0);
//		
//		System.out.println(pron);
//		System.out.println(par);

//        System.out.println("Datos de la Clase Logica:");
//        System.out.println("Datos de la Clase Pronosticos:");
//        for (Pronostico dato : pronosticos) {
//            System.out.println(dato);
//        }
//
//        System.out.println("\nDatos de la Clase Partidos:");
//        
//        for (Partido dato : partidos) {
//            System.out.println(dato);
//        }

//

///////////////// INSTANCIANDO PARTIDO(S) ///////////////////////////////////////
//		
//		// lista partido
//		List<Partido> partido = new ArrayList<>();
//						
////-----------------------------------------------------------------------------
//		// Lectura y parseado de datos de Resultados
//		LectorDeResultados lecturaResultados = new LectorDeResultados("src/main/resources/resultados.csv");
//		lecturaResultados.parsearArchivo();
//				
//		List<ArchivoResultados> resultados = lecturaResultados.lineasArchivoResultados;
//		
////-----------------------------------------------------------------------------
//		
//		if (resultados != null && !resultados.isEmpty()) {
//		
//			for(ArchivoResultados datosDePartido : resultados) {
//				
////				Partido partido1 = new Partido(datosDePartido.getRonda(), datosDePartido.getEquipo1(), datosDePartido.getEquipo2(), datosDePartido.getCantidadGoles1(),datosDePartido.getCantidadGoles2());
//				
//				// Agregar partido a lista partido
//				Partido unPartido = new Partido(datosDePartido.getRonda(), datosDePartido.getEquipo1(), datosDePartido.getEquipo2(), datosDePartido.getCantidadGoles1(),datosDePartido.getCantidadGoles2());
//                partido.add(unPartido);
//				
//			}
//		    
//		} else {
//			
//		    System.out.println("La lista de resultados está vacía.");
//		    
//		}
//		
/////////////////////// INSTANCIANDO PRONOSTICO(S) //////////////////////////////	
//		
//		// Lista pronostico(pronostico/partido)
//		List<Pronostico> pronostico = new ArrayList<>();
//		
//		// Lectura de archivo y parseado
//		
//		LectorDePronosticos lecturaPronosticos = new LectorDePronosticos("src/main/resources/pronostico.csv");
//		lecturaPronosticos.parsearArchivo();
//		
//		List<ArchivoPronosticos> pronosticos = lecturaPronosticos.lineasArchivoPronosticos;
//		
////-----------------------------------------------------------------------------
//		
//		if (pronosticos != null && !pronosticos.isEmpty()) {
//			
//			for(ArchivoPronosticos datosDePronostico : pronosticos) {
//				
//				// Instanciar un partido con datos de pronostico
//				
//				Pronostico pronosticoPartido = new Pronostico(datosDePronostico.getRonda(), datosDePronostico.getParticipante(), datosDePronostico.getPuntos(); partido, datosDePronostico.getEquipo1());
//				
////				Partido pronosticoPartido = new Partido();
//				
//
//				// Agregar pronostico a lista pronosticoPartido
//				pronostico.add(pronosticoPartido);
//			}
//			
//			// comparar los partidos en contra los pronosticos
//		    
//		} else {
//			
//		    System.out.println("La lista de pronosticos está vacía.");
//		}
//		
//		// ================ comparar resultados con pronosticos ==================
//		
//	}

// Se deben crear las clases necesarias para que aqui solo se desarrolle la
// logica.
// En este lugar se ingresan los datos, que pueden ser mediante conexion a BD
// o al lector CSV.
// Tambien se debe poder enviar los resultados a una clase que lo muestre por
// consola o que lo muestre por ventana (Window builder).
