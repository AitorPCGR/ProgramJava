package edu.femxa;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leerfichero {

	public static void main (String [] args) throws IOException{
	
	File archivo = new File ("pepe");
	FileReader filereader = new FileReader(archivo);
	int a = filereader.read ();
	int b = filereader.read ();
	
	char c = (char)a; //Casting: conversi�n de
	//char d =(char)b; //casting: conversi�n 
	
	
	System.out.println(a);
	
	
	
	
}
}
