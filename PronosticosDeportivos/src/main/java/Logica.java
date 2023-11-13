import java.util.List;

public class Logica {

	public Logica() {
		
		Partido partido = null;
		
/////////////// INSTANCIANDO PARTIDO(S) /////////////////////////////////////////////////////////////////////////////
		
		LectorDeResultados lecturaResultados = new LectorDeResultados("src/main/resources/resultados.csv");
		lecturaResultados.parsearArchivo();
		
		
		List<ArchivoResultados> resultados = lecturaResultados.lineasArchivoResultados;
		
		if (resultados != null && !resultados.isEmpty()) {
			
//		    // Obtener el primer elemento (en este ejemplo) de la lista
//		    ArchivoResultados primerResultado = resultados.get(1);
		
			for(ArchivoResultados datosDePartido : resultados) {
				
				Partido partido1 = new Partido(datosDePartido.getRonda(), datosDePartido.getEquipo1(), datosDePartido.getEquipo2(), datosDePartido.getCantidadGoles1(),datosDePartido.getCantidadGoles2() );
				partido1 = partido;	
			}
		    
		} else {
			
		    System.out.println("La lista de resultados está vacía.");
		}
		
///////////////////// INSTANCIANDO PRONOSTICO(S) ////////////////////////////////////////////////		
		
		LectorDePronosticos lecturaPronosticos = new LectorDePronosticos("src/main/resources/pronostico.csv");
		lecturaPronosticos.parsearArchivo();
		
		List<ArchivoPronosticos> pronosticos = lecturaPronosticos.lineasArchivoPronosticos;
		
		if (pronosticos != null && !pronosticos.isEmpty()) {
			
//		    // Obtener el primer elemento (en este ejemplo) de la lista
//		    ArchivoResultados primerResultado = resultados.get(1);
			
			for(ArchivoPronosticos datosDePronostico : pronosticos) {
				
				// Pronostico pronostico1 = new Pronostico(partido, datosDePronostico.getEquipo1(), datosDePronostico.getParticipante());
					
			}
		    
		} else {
			
		    System.out.println("La lista de pronosticos está vacía.");
		}
		
	}
	
	
	
	// Se deben crear las clases necesarias para que aqui solo se desarrolle la
	// logica.
	// En este lugar se ingresan los datos, que pueden ser mediante conexion a BD
	// o al lector CSV.
	// Tambien se debe poder enviar los resultados a una clase que lo muestre por
	// consola o que lo muestre por ventana (Window builder).
	

}
