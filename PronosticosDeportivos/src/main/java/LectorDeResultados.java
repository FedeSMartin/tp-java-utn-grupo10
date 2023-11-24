import java.io.*;
import java.util.*;
import com.opencsv.bean.CsvToBeanBuilder;

public class LectorDeResultados {
	
	 String rutaArchivoResultados;
	 List<ArchivoResultados> lineasArchivoResultados;
	    
	 public LectorDeResultados(String rutaArchivo) {    	
	    	
	        this.rutaArchivoResultados = rutaArchivo;
	        this.lineasArchivoResultados = new ArrayList<>();   
	  }
	 
	 //-------------------------------------------

	    @SuppressWarnings("unchecked")
	    
	 //-------------------------------------------
	    
	 public void parsearArchivo() {
	    	
	   List<ArchivoResultados> listaDeResultados = null;
	        
	   try {
	        	
	      // En esta primera línea definimos el archivos que va a ingresar
	      listaDeResultados = new CsvToBeanBuilder(new FileReader(this.rutaArchivoResultados))
	        			
	      // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
	      .withSkipLines(1)
	                    
	      // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
	      .withSeparator(';')
	                    
	      // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
	      .withType(ArchivoResultados.class)
	      .build()
	      .parse();

	    } catch (IOException e) {
	        	
	        e.printStackTrace();
	    }
	        this.lineasArchivoResultados = listaDeResultados;
	    }
	    
	    // Getters & Setters

		public String getRutaArchivoResultados() {
			return rutaArchivoResultados;
		}

		public void setRutaArchivoResultados(String rutaArchivoResultados) {
			this.rutaArchivoResultados = rutaArchivoResultados;
		}

		public List<ArchivoResultados> getLineasArchivoResultados() {
			return lineasArchivoResultados;
		}

		public void setLineasArchivoResultados(List<ArchivoResultados> lineasArchivoResultados) {
			this.lineasArchivoResultados = lineasArchivoResultados;
		}
	    
	    
	    
}
