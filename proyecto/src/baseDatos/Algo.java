package baseDatos;

import java.sql.ResultSet;
import java.sql.Statement;


public class Algo {

	public static void main(String[] args) {
		
	
	
	ResultSet rs = null;
	Connection con = pool.getConnection();
	int idpatol = -5;
	Statement st = null;
	try{
		st = con.createStatement ();
		rs= st.executeQuery((select_pat);
		idpatrol = rs.getInt(("id_patol");
	}catch (SQLEception e){
		//TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		pool.liberarRecursos (con, st, rs);
	}
	
	response.getWriter(). append("id QUERATOCONO").append;
	
	
}}
