
public class Visualizador {
	
	private String salidaDeDatos;	// consola
									// ventana

	public Visualizador(String salidaDeDatos) {
		
		this.salidaDeDatos = salidaDeDatos;
		
		if ( salidaDeDatos.equals("consola")) {
			
			// Invocar clase VisorConsola
			
		} else if ( salidaDeDatos.equals("ventana") ) {
			
			// Invocar clase VisorVentana
			
		} else {
			
			System.out.println("Asegurese de seleccionar la opcion correcta");
			
		}

	}

	public String getSalidaDeDatos() {
		return salidaDeDatos;
	}

	public void setSalidaDeDatos(String salidaDeDatos) {
		this.salidaDeDatos = salidaDeDatos;
	}

}
