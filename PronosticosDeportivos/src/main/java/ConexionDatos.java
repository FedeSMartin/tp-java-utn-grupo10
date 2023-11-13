
public class ConexionDatos {
	
	private int origenDeDatos = 1; 	// 1 para lector CSV
									// 2 para conectar a BD

	public ConexionDatos(int origenDeDatos) {
		this.origenDeDatos = origenDeDatos;
		
		if ( origenDeDatos == 1 ) {
			
			// clases para leer archivos CSV
			// LectorDePronosticos
			// LectorDeResultados
			
		} else if ( origenDeDatos == 2 ) {
			
			// LectorBaseDeDatos
			
		} else {
			
			System.out.println("Asegurese de seleccionar la opcion correcta");
			
		}
		
		
	}

	public int getOrigenDeDatos() {
		return origenDeDatos;
	}

	public void setOrigenDeDatos(int origenDeDatos) {
		this.origenDeDatos = origenDeDatos;
	}
	
}
