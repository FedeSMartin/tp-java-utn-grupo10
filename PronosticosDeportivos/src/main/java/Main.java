//import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Partido partidoGana = new Partido("Argentina","Mexico",0,1);
		
		System.out.println(partidoGana.resultado());
		
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

