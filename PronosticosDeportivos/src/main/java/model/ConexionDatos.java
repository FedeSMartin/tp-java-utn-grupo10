package model;

public class ConexionDatos {

	private boolean origenDeDatos; // true para lector CSV
									// false para conectar a BD

	// Constructor de la conexion
	public ConexionDatos(boolean origenDeDatos) {

		this.origenDeDatos = origenDeDatos;

		if (origenDeDatos == true) {

			System.out.println("Hola, soy una conexion a CSV");
			// clases para leer archivos CSV
			// LectorDePronosticos
			// LectorDeResultados

		} else if (origenDeDatos == false) {

			System.out.println("Hola, soy una conexion a base de datos");

			// LectorBaseDeDatos
			// infoBDPronosticos rBD = new LectorBaseDeDatos();

		} else {

			System.out.println("Asegurese de seleccionar la opcion correcta");

		}

	}

	public boolean getOrigenDeDatos() {
		return origenDeDatos;
	}

}
