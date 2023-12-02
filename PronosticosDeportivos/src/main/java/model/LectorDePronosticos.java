package model;
import java.io.*;
import java.util.*;
import com.opencsv.bean.CsvToBeanBuilder;

public class LectorDePronosticos {
	
	 String rutaArchivoPronosticos;
	 List<ArchivoPronosticos> lineasArchivoPronosticos;
	    
	    public LectorDePronosticos(String rutaArchivo) {    	
	    	
	        this.rutaArchivoPronosticos = rutaArchivo;
	        this.lineasArchivoPronosticos = new ArrayList<>();
	        
	    }

	    @SuppressWarnings("unchecked")
	    
		public void parsearArchivo() {
	    	
	        List<ArchivoPronosticos> listaDePronosticos = null;
	        
	        try {
	        	
	            // En esta primera línea definimos el archivos que va a ingresar
	        	listaDePronosticos = new CsvToBeanBuilder(new FileReader(this.rutaArchivoPronosticos))
	        			
	                    // con esta configuración podemos skipear la primera línea de nuestro archivo CSV
	                    .withSkipLines(1)
	                    
	                    // con esta configuración podemos elegir cual es el caracter que vamos a usar para delimitar
	                    .withSeparator(';')
	                    
	                    // Es necesario definir el tipo de dato que va a generar el objeto que estamos queriendo parsear a partir del CSV
	                    .withType(ArchivoPronosticos.class)
	                    .build()
	                    .parse();

	        } catch (IOException e) {
	        	
	        e.printStackTrace();
	    }
	        this.lineasArchivoPronosticos = listaDePronosticos;
	    }
	    
	    ///////////////////////////////////////////////////////////////////////////
}

