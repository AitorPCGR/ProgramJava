package DesCaracteres;

import java.util.Scanner;

public class Invertintroteclado {

public static void main (String[] args) {
	    	
	        Scanner leer = new Scanner(System.in);
	        
	        System.out.print("Cadena: ");
	        String Cadena = leer.nextLine(); // Leemos la cadena
	        
	        String CadenaInvertida = ""; 
	        
	        int tama�oCadena = Cadena.length()-1; // Conocer el tama�o de la cadena-1
	        
	        while(tama�oCadena >= 0)
	        {
	            CadenaInvertida += Cadena.charAt(tama�oCadena);
	            tama�oCadena--;
	        }
	        
	        System.out.print("Cadena invertida: " + CadenaInvertida); // Imprimir cadena
	    }    
	}

