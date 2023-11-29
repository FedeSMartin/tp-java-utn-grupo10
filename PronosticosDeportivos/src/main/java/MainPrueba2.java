




















/*

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
//import com.mysql.cj.xdevapi.Statement;

public class MainPrueba2 {
	
	public static void main(String[] args) {
		
		 	Connection conexion = null;
	        java.sql.Statement consulta = null;
	        String sql;

	        try {// Abrir la conexión
	            System.out.println("conectando a la base de datos...");
	            conexion = DriverManager.getConnection(CredencialBaseDeDatos.DB_URL,
			            							   CredencialBaseDeDatos.USER, 
			            							   CredencialBaseDeDatos.PASS);

	            // Ejecutar una consulta
	            System.out.println("creando statement...");
	            consulta = conexion.createStatement();
	            
//////////////////// Consulta SQL a tabla pronosticos ////////////////////////////////////////
	            
	            
	            sql = "SELECT * FROM pronosticos";

	            //En la variable resultado obtendremos las distintas filas que nos devolvió la base
	            ResultSet resultado = consulta.executeQuery(sql);
	            
	            // ArrayList con info de tabla Pronosticos
	            
	            List<Pronostico> listaDePronosticos = new ArrayList<Pronostico>();
	            
	            // Obtener las distintas filas de la consulta
	            while (resultado.next()) {
	            	
	                // Pbtener el valor de cada columna
	            	int idPronostico = resultado.getInt("id_Pronostico");
	            	int ronda = resultado.getInt("Ronda");
	            	String participante = resultado.getString("Participante");
	            	String equipo1 = resultado.getString("Equipo_1");
	            	String ganaEquipo1 = resultado.getString("Gana_Equipo_1");
	            	String empate = resultado.getString("Empate");
	            	String ganaEquipo2 = resultado.getString("Gana_Equipo_2");
	            	String equipo2 = resultado.getString("Equipo_2");
	            	int idPartidoFK = resultado.getInt("ID_Partido_FK");
	            	
	                // Almacenar los valores obtenidos
	            	
	            	listaDePronosticos.add(new Pronostico(idPronostico, ronda, participante,equipo1, ganaEquipo1, empate, ganaEquipo2,equipo2, idPartidoFK));
	            	
	            	
	            }
	            
//	            for(Pronostico heee : listaDePronosticos) {
//	            	
//	            	System.out.println(heee);
//	            }
	            
//////////////////// Consulta SQL a tabla partidos ////////////////////////////////////////
	            
	            sql = "SELECT * FROM partidos";

	            //En la variable resultado obtendremos las distintas filas que nos devolvió la base
	            ResultSet resultado2 = consulta.executeQuery(sql);
	            
	            //ArrayList contenedora
	            
	            List<Partido> listaDePartidos = new ArrayList<>();
	            
	            // Obtener las distintas filas de la consulta
	            while (resultado2.next()) {
	            	
	                // Pbtener el valor de cada columna
	            	int idPartido = resultado2.getInt("id_Partido");
	            	int ronda = resultado2.getInt("Ronda");
	            	String equipo1 = resultado2.getString("Equipo_1");
	            	int golesEquipo1 = resultado2.getInt("Goles_Equipo_1");
	            	int golesEquipo2 = resultado2.getInt("Goles_Equipo_2");
	            	String equipo2 = resultado2.getString("Equipo_2");
	            	
	                // Almacenar los valores obtenidos
	            	
	            	listaDePartidos.add(new Partido(idPartido, ronda, equipo1, golesEquipo1, golesEquipo2, equipo2));
	            		            	
	            }
	            
	            for(Partido huuu : listaDePartidos) {
	            	
	            	//return huuu;
	            }
	            
///////////////////////////////////////////////////////////////////////////////////////////////////
	            
	            // Esto se utiliza par cerrar la conexión con la base de datos
	            resultado.close();
	            resultado2.close();
	            consulta.close();
	            conexion.close();
	        } catch (SQLException se) {
	            // Execpción ante problemas de conexión
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
	        
	        System.out.println("Fin de la ejecucción");

////////// corchetes del main //////////	        
	        
	    }
	
}




























































//////////////////////////////////////////////////////////////////////////////////////////		
/////////////// INSTANCIANDO RONOSTICO(S) /////////////////////////////////////////////////////////////////////////////
//		
//		List<Pronostico> pronostico = new ArrayList<>();
//		
//		LectorDePronosticos lecturaPronosticos = new LectorDePronosticos("src/main/resources/pronostico.csv");
//		lecturaPronosticos.parsearArchivo();
//		
//		List<ArchivoPronosticos> pronosticos = lecturaPronosticos.lineasArchivoPronosticos;
//		
//		if (pronosticos != null && !pronosticos.isEmpty()) {
//			
//			for(ArchivoPronosticos datosDePronostico : pronosticos) {
//							
//				// Instanciar un partido con datos de pronostico
//				// Partido unPronostico = new Partido(datosDePronostico.getRonda(), datosDePronostico.getEquipo1(), datosDePronostico.getEquipo2());
//                Pronostico unPronostico = new Pronostico (datosDePronostico.getRonda(), datosDePronostico.getParticipante(), datosDePronostico.getPartido(), datosDePronostico.getEquipo(), datosDePronostico.estado());
//				// Agregar pronostico a lista pronosticos
//				pronostico.add(unPronostico);
//			}
//			
//			// comparar los partidos en contra los pronosticos
//		    
//		} else {
//			
//		    System.out.println("La lista de pronosticos está vacía.");
//		}
//		
//		for (Pronostico pronosticoDePartido : pronostico) {
//		    System.out.println("Ronda " + pronosticoDePartido.getRonda()+ ": " + pronosticoDePartido.getEquipo1() + ", " + pronosticoDePartido.getEquipo2() +  pronostico.".");
//		}
//		
///////////////// INSTANCIANDO PARTIDO(S) /////////////////////////////////////////////////////////////////////////////
//				
//				LectorDeResultados lecturaResultados = new LectorDeResultados("src/main/resources/resultados.csv");
//				lecturaResultados.parsearArchivo();
//				
//				// lista partido
//				List<Partido> partido = new ArrayList<>();
//				
//				
//				List<ArchivoResultados> resultados = lecturaResultados.lineasArchivoResultados;
//				
//		//-----------------------------------------------------------------------------
//				
//				if (resultados != null && !resultados.isEmpty()) {
//				
//					for(ArchivoResultados datosDePartido : resultados) {
//						
//						// Agregar partido a lista partido
//						Partido unPartido = new Partido(datosDePartido.getRonda(), datosDePartido.getEquipo1(), datosDePartido.getEquipo2(), datosDePartido.getCantidadGoles1(),datosDePartido.getCantidadGoles2());
//		                partido.add(unPartido);
//						
//					}
//				    
//				} else {
//					
//				    System.out.println("La lista de resultados está vacía.");
//				    
//				}
//				
//				//Esto es para verificar la correcta lectura del CSV
//				
//				for (Partido resultadoDePartido : partido) {
//				    System.out.println("Ronda " + resultadoDePartido.getRonda()+ ": " + resultadoDePartido.getEquipo1() + ", " + resultadoDePartido.getGolesEquipo1() + " --- " + resultadoDePartido.getEquipo2() +  ", " + resultadoDePartido.getGolesEquipo2() +  ".");
//				}
				
				
/////////////////////////////////////////////////////////////////////////////////////
		
//		Partido partidoGana = new Partido("Argentina","Mexico",0,1);
//		
//		System.out.println(partidoGana.resultado());
//		
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
//		
//		
//	}
//}

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


*/