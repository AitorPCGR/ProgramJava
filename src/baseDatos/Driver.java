package baseDatos;

import java.io.FileReader;
import java.util.Properties;

public class Driver {

	public static void main(String[] args) throws Throwable {
		
		Properties fichero_propiedades = null;
		fichero_propiedades = new Properties();
		
		
		FileReader fr = new FileReader ("db.properties");
		fichero_propiedades.load(fr);
		String vd = fichero_propiedades.getProperty("driver");
		System.out.println(vd);
		fr.close();
	}
	
	
}
