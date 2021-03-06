package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BD {

		
		private static Connection connection = null;
		private static Statement statement = null;

		/** Inicializa una BD SQLITE y devuelve una conexi�n con ella. Debe llamarse a este 
		 * m�todo antes que ning�n otro, y debe devolver no null para poder seguir trabajando con la BD.
		 * @param nombreBD	Nombre de fichero de la base de datos
		 * @return	Conexi�n con la base de datos indicada. Si hay alg�n error, se devuelve null
		 */
		public static Connection initBD( String viajesBD ) {
			try {
			    Class.forName("org.sqlite.JDBC");
			    connection = DriverManager.getConnection("jdbc:sqlite:" + viajesBD );
				statement = connection.createStatement();
				statement.setQueryTimeout(30);  // poner timeout 30 msg
			    return connection;
			} catch (ClassNotFoundException | SQLException e) {
				return null;
			}
		}
		
		/** Cierra la conexi�n con la Base de Datos
		 */
		public static void close() {
			try {
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		/** Devuelve la conexi�n si ha sido establecida previamente (#initBD()).
		 * @return	Conexi�n con la BD, null si no se ha establecido correctamente.
		 */
		public static Connection getConnection() {
			return connection;
		}
		
		/** Devuelve una sentencia para trabajar con la BD,
		 * si la conexi�n si ha sido establecida previamente (#initBD()).
		 * @return	Sentencia de trabajo con la BD, null si no se ha establecido correctamente.
		 */
		public static Statement getStatement() {
			return statement;
		}

		
		/** Crear una tabla de viajes en una base de datos, si no exist�a ya.
		 * Debe haberse inicializado la conexi�n correctamente.
		 */
		public static void crearTablaBD() {
			if (statement==null) return;
			try {
				statement.executeUpdate("create table viajes " +
					"(ciudadO string, ciudadD string, fechaI string" +
					", fechaF string)");
			} catch (SQLException e) {
				// Si hay excepci�n es que la tabla ya exist�a (lo cual es correcto)
				// e.printStackTrace();  
			}
		}
}
