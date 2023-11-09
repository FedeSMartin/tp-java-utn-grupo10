import java.util.List;

import com.opencsv.exceptions.CsvValidationException;

public class PruebaLectorArchivos {
	
	public static void main(String[] args) throws CsvValidationException {
		
		int verArchivo = 1; // 1 - Es para archivo resultados
							// 2 - Es para archivo pronostico
		
		if(verArchivo == 1) {
		
			String rutaArchivo = "src/main/resources/resultados.csv"; // Reemplazar con la ruta de tu archivo CSV
		    LectorDeResultados lector = new LectorDeResultados(rutaArchivo);
		    lector.parsearArchivo();
	
		        // Verificar si se han parseado los datos correctamente
		        List<ArchivoResultados> lineasArchivoResultados = lector.lineasArchivoResultados;
		        
		        if(lineasArchivoResultados != null && !lineasArchivoResultados.isEmpty()) {
		        	
		            for(ArchivoResultados resultado : lineasArchivoResultados) {
		            	
		                System.out.println(resultado); // Imprimir cada elemento en la lista
		                
		            }
		            
		        } else {
		        	
		            System.out.println("No se han parseado datos o la lista está vacía.");
		            
		        }
	        
		} else if(verArchivo == 2) {
	        
			 String rutaArchivo = "src/main/resources/pronostico.csv"; // Reemplazar con la ruta de tu archivo CSV
		     LectorDePronosticos lector = new LectorDePronosticos(rutaArchivo);
		     lector.parsearArchivo();
	
		        // Verificar si se han parseado los datos correctamente
		        List<ArchivoPronosticos> lineasArchivoPronosticos = lector.lineasArchivoPronosticos;
		        
		        if (lineasArchivoPronosticos != null && !lineasArchivoPronosticos.isEmpty()) {
		        	
		            for (ArchivoPronosticos pronostico : lineasArchivoPronosticos) {
		            	
		                System.out.println(pronostico); // Imprimir cada elemento en la lista
		                
		            }
		            
		        } else {
		        	
		            System.out.println("No se han parseado datos o la lista está vacía.");
		            
		        }
	        
		}
		
/////////////// BARRA PARA EVITAR PROBLEMA CON LOS UTIMOS 2 CORCHETES ///////////////
		
	}

}
