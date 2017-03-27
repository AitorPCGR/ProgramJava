package edu.femxa;

import java.io.File;
import java.io.IOException;

public class CrearFichero {
	
	public static void main (String[] args) throws IOException{
		File f = new File ("Hola.jsp");
		f.createNewFile();
		f.delete();
		
	}
	
	
	
	
	
}
