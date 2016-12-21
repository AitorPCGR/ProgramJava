package DesCaracteres;

import java.util.Scanner;

public class Invertintroteclado {

public static void main (String[] args) {
	    	
	        Scanner leer = new Scanner(System.in);
	        
	        System.out.print("Cadena: ");
	        String Cadena = leer.nextLine(); // Leemos la cadena
	        
	        String CadenaInvertida = ""; 
	        
	        int tamañoCadena = Cadena.length()-1; // Conocer el tamaño de la cadena-1
	        
	        while(tamañoCadena >= 0)
	        {
	            CadenaInvertida += Cadena.charAt(tamañoCadena);
	            tamañoCadena--;
	        }
	        
	        System.out.print("Cadena invertida: " + CadenaInvertida); // Imprimir cadena
	    }    
	}

