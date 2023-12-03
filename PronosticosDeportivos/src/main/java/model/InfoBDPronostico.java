package model;

import java.sql.*;
import java.util.*;

import controller.Pronostico;

public class InfoBDPronostico {

	private List<Pronostico> listaDePronosticos;

	public InfoBDPronostico() {

		cargarDatosDesdeDB();

	}

	private void cargarDatosDesdeDB() {
		// logica para cargar datos desde la base de datos a listaDePronosticos
		this.listaDePronosticos = obtenerDatosDesdeDB();
	}

	public List<Pronostico> obtenerDatosPronosticos() {
		return listaDePronosticos;
	}

	private List<Pronostico> obtenerDatosDesdeDB() {
		// logica para obtener datos desde la base de datos
		List<Pronostico> listaDePronostico = new ArrayList<>();

		Connection conexion = null;
		java.sql.Statement consulta = null;
		String sql;

		try {
			// abrir la conexion
			conexion = DriverManager.getConnection(CredencialBaseDeDatos.DB_URL, CredencialBaseDeDatos.USER,
					CredencialBaseDeDatos.PASS);

			// ejecutar una consulta
			consulta = conexion.createStatement();

			sql = "SELECT * FROM pronosticos";

			// en la variable resultado obtendremos las distintas 
			// filas que nos devolvio la base
			ResultSet resultado = consulta.executeQuery(sql);

			// obtener las distintas filas de la consulta
			while (resultado.next()) {
				int idPronostico = resultado.getInt("id_Pronostico");
				int ronda = resultado.getInt("Ronda");
				String participante = resultado.getString("Participante");
				String equipo1 = resultado.getString("Equipo_1");
				String ganaEquipo1 = resultado.getString("Gana_Equipo_1");
				String empate = resultado.getString("Empate");
				String ganaEquipo2 = resultado.getString("Gana_Equipo_2");
				String equipo2 = resultado.getString("Equipo_2");
				int idPartidoFK = resultado.getInt("ID_Partido_FK");

				// almacenar los valores obtenidos
				listaDePronostico.add(new Pronostico(idPronostico, ronda, participante, equipo1, ganaEquipo1, empate,
						ganaEquipo2, equipo2, idPartidoFK));
			}

			// esto se utiliza para cerrar la conexion con la base de datos
			resultado.close();
			consulta.close();
			conexion.close();

		} catch (SQLException se) {

			// excepcion ante problemas de conexion
			se.printStackTrace();

		} finally {

			// esta sentencia es para que ante un problema con
			// la base igual se cierren las conexiones

			try {

				if (consulta != null)
					consulta.close();

			} catch (SQLException se2) {
			}
			try {

				if (conexion != null)
					conexion.close();

			} catch (SQLException se) {

				se.printStackTrace();
			}
		}

		return listaDePronostico;
	}
}
