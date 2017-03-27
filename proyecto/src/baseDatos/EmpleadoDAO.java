package baseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;
import java.util.List;

public class EmpleadoDAO {

	public List <EmpleadosDTO> consultaEmpleadosDepartamentos (int departamento)
	{
		return null;
		
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
			ActBaseDatos.liberarRecursos(stat, rset);
			ActBaseDatos.liberarConexion(conn);
		}}}
		
		
		
		
		
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

