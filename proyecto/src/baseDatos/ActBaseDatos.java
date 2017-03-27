package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class ActBaseDatos {
	
	public static void liberarRecursos(Statement stat, ResultSet rset) {
		if (rset != null) {
			try {
				rset.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (stat != null) {
			try {
				stat.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void liberarConexion(Connection conn)
	{
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stat = null;
		ResultSet rset = null;
		Savepoint save = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
			conn.setAutoCommit(false);
			
			stat = conn.createStatement();
			stat.execute("UPDATE JUGADORES j SET j.SALARIO = ROUND ( j.SALARIO * 1.20 )");
			
			save = conn.setSavepoint();
			stat.execute("UPDATE JUGADORES e SET j.SALARIO = ROUND ( j.SALARIO * 1.20 )");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en el proceso. \n  ---- Rollback ----");
			conn.rollback(save);
		} finally {
			liberarRecursos(stat, rset);
			liberarConexion(conn);
		}
	}
}
