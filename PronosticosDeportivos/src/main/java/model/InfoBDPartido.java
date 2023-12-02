package model;
import java.sql.*;
import java.util.*;

import controller.Partido;

public class InfoBDPartido {
	
    private List<Partido> listaDePartidos;

    public InfoBDPartido() {
        cargarDatosDesdeDB();
    }

    private void cargarDatosDesdeDB() {
    	
        // Lógica para cargar datos desde la base de datos a listaDePartidos
        this.listaDePartidos = obtenerDatosDesdeDB();
        
    }

    public List<Partido> obtenerDatosPartidos() {
        return listaDePartidos;
    }

    private List<Partido> obtenerDatosDesdeDB() {
    	
        // Lógica para obtener datos desde la base de datos
        List<Partido> listaDePartidos = new ArrayList<>();

        Connection conexion = null;
        java.sql.Statement consulta = null;
        String sql;

        try {
            // Abrir la conexión
            conexion = DriverManager.getConnection(CredencialBaseDeDatos.DB_URL, CredencialBaseDeDatos.USER,
                    CredencialBaseDeDatos.PASS);

            // Ejecutar una consulta
            consulta = conexion.createStatement();

            sql = "SELECT * FROM partidos";

            // En la variable resultado obtendremos las distintas filas que nos devolvió la base
            ResultSet resultado = consulta.executeQuery(sql);

            // Obtener las distintas filas de la consulta
            while (resultado.next()) {
                int idPartido = resultado.getInt("id_Partido");
                int ronda = resultado.getInt("Ronda");
                String equipo1 = resultado.getString("Equipo_1");
                int golesEquipo1 = resultado.getInt("Goles_Equipo_1");
                int golesEquipo2 = resultado.getInt("Goles_Equipo_2");
                String equipo2 = resultado.getString("Equipo_2");

                // Almacenar los valores obtenidos
                listaDePartidos.add(new Partido(idPartido, ronda, equipo1, golesEquipo1, golesEquipo2, equipo2));
            }

            // Esto se utiliza para cerrar la conexión con la base de datos
            resultado.close();
            consulta.close();
            conexion.close();

        } catch (SQLException se) {
            // Excepción ante problemas de conexión
            se.printStackTrace();

        } finally {

            // Esta sentencia es para que ante un problema con la base igual se cierren las conexiones

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

        return listaDePartidos;
    }
}