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
        // Lógica para procesar los datos
        // Puedes realizar operaciones, comparaciones, etc.
        // En este ejemplo, simplemente imprimimos los datos
		
		Pronostico pronostik = pronosticos.get(2);
		
		String[] datosPronostico = pronostik.toString().split(",");
		
//		for (String lineaPronostico : datosPronostico) {
//		    System.out.print(lineaPronostico);
//		}
		
//		System.out.println(" ");
//		System.out.println(datosPronostico[0]);
//		System.out.println(datosPronostico[1]);
//		System.out.println(datosPronostico[2]);
//		System.out.println(datosPronostico[3]);
//		System.out.println(datosPronostico[4]);
//		System.out.println(datosPronostico[5]);
//		System.out.println(datosPronostico[6]);
//		System.out.println(datosPronostico[7]);
//		System.out.println(datosPronostico[8]);
		
		////////////////////////////////////////////////////
		
		Partido partido = partidos.get(0);
		
		String[] datosPartido = partido.toString().split(",");
		
		//int datoPartidoGolesEquipo1Int = Integer.parseInt(datosPartido);
		
		
	   }
	}
		
		
		
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
