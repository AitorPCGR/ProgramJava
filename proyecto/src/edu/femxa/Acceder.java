package edu.femxa;

import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class Acceder {

	
	public static void main(String[] args) throws IOException {
		
	        String cadena;
	        String fichero = "fichero_nombre.txt";
			FileReader fr = new FileReader(fichero);
	        BufferedReader br = new BufferedReader(fr);
	        while((cadena = br.readLine())!=null) {
	            System.out.println(cadena);
	        }
	        br.close();
	        
	        String palabra_contraseña = null;
	        String fichero1 = "fichero_contraseña.txt";
			FileReader fr1 = new FileReader(fichero1);
	        BufferedReader br1 = new BufferedReader(fr1);
	        while((cadena = br1.readLine())!=null) {
	            System.out.println(palabra_contraseña);
	        }
	        br1.close();
	        
	        
	        
	        
	        
	        
	    }

	  
	      
	    
	   
	
		
		
		
	}
	
	
	
	
	
	
	

