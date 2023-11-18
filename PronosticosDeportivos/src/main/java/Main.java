import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
/////////////// INSTANCIANDO RONOSTICO(S) /////////////////////////////////////////////////////////////////////////////
		
		List<Pronostico> pronostico = new ArrayList<>();
		
		LectorDePronosticos lecturaPronosticos = new LectorDePronosticos("src/main/resources/pronostico.csv");
		lecturaPronosticos.parsearArchivo();
		
		List<ArchivoPronosticos> pronosticos = lecturaPronosticos.lineasArchivoPronosticos;
		
		if (pronosticos != null && !pronosticos.isEmpty()) {
			
			for(ArchivoPronosticos datosDePronostico : pronosticos) {
							
				// Instanciar un partido con datos de pronostico
				// Partido unPronostico = new Partido(datosDePronostico.getRonda(), datosDePronostico.getEquipo1(), datosDePronostico.getEquipo2());
                Pronostico unPronostico = new Pronostico (datosDePronostico.getRonda(), datosDePronostico.getParticipante(), datosDePronostico.getPartido(), datosDePronostico.getEquipo(), datosDePronostico.estado());
				// Agregar pronostico a lista pronosticos
				pronostico.add(unPronostico);
			}
			
			// comparar los partidos en contra los pronosticos
		    
		} else {
			
		    System.out.println("La lista de pronosticos está vacía.");
		}
		
		for (Pronostico pronosticoDePartido : pronostico) {
		    System.out.println("Ronda " + pronosticoDePartido.getRonda()+ ": " + pronosticoDePartido.getEquipo1() + ", " + pronosticoDePartido.getEquipo2() +  pronostico.".");
		}
		
///////////////// INSTANCIANDO PARTIDO(S) /////////////////////////////////////////////////////////////////////////////
//				
//				LectorDeResultados lecturaResultados = new LectorDeResultados("src/main/resources/resultados.csv");
//				lecturaResultados.parsearArchivo();
//				
//				// lista partido
//				List<Partido> partido = new ArrayList<>();
//				
//				
//				List<ArchivoResultados> resultados = lecturaResultados.lineasArchivoResultados;
//				
//		//-----------------------------------------------------------------------------
//				
//				if (resultados != null && !resultados.isEmpty()) {
//				
//					for(ArchivoResultados datosDePartido : resultados) {
//						
//						// Agregar partido a lista partido
//						Partido unPartido = new Partido(datosDePartido.getRonda(), datosDePartido.getEquipo1(), datosDePartido.getEquipo2(), datosDePartido.getCantidadGoles1(),datosDePartido.getCantidadGoles2());
//		                partido.add(unPartido);
//						
//					}
//				    
//				} else {
//					
//				    System.out.println("La lista de resultados está vacía.");
//				    
//				}
//				
//				//Esto es para verificar la correcta lectura del CSV
//				
//				for (Partido resultadoDePartido : partido) {
//				    System.out.println("Ronda " + resultadoDePartido.getRonda()+ ": " + resultadoDePartido.getEquipo1() + ", " + resultadoDePartido.getGolesEquipo1() + " --- " + resultadoDePartido.getEquipo2() +  ", " + resultadoDePartido.getGolesEquipo2() +  ".");
//				}
				
				
/////////////////////////////////////////////////////////////////////////////////////
		
//		Partido partidoGana = new Partido("Argentina","Mexico",0,1);
//		
//		System.out.println(partidoGana.resultado());
//		
//		if (partidoGana.resultado() == ResultadoEnum.GANO_EQUIPO1) {
//			
//			System.out.println( "Gano " + partidoGana.getEquipo1());
//			
//		}
//		else if (partidoGana.resultado() == ResultadoEnum.GANO_EQUIPO2) {
//			
//			System.out.println( "Gano " + partidoGana.getEquipo2());
//			
//		} else {
//			
//			System.out.println("Empataron");
//			
//		}
		
		
	}
}

//LectorDeResultados lectura1 = new LectorDeResultados("src/main/resources/resultados.csv");
//lectura1.parsearArchivo();
//
//List<ArchivoResultados> resultados = lectura1.lineasArchivoResultados;
//
////List<ArchivoResultados> lineasArchivoResultados = lectura1.lineasArchivoResultados;
//
//if (resultados != null && !resultados.isEmpty()) {
//	
//	for(ArchivoResultados resultados01 : resultados) {
//    	
//        System.out.println(resultados01.getEquipo1()); // Imprimir cada elemento en la lista
//        
//    }
//    
//}
//	
////    // Obtener el primer elemento (en este ejemplo) de la lista
////    ArchivoResultados primerResultado = resultados.get(1);
////    
////    // Realizar acciones con el primer resultado, por ejemplo, imprimir sus datos
////    System.out.println(primerResultado.getEquipo1());
// else {
//    System.out.println("La lista de resultados está vacía.");
//}
//
//}

