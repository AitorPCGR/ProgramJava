

import java.util.Scanner;

public class LetraDni {

	/**Para calcular la letra del DNI, hay un algoritmo, que consiste en obtener el resto de la división entera entre el número dni y 23.

	Esto, nos da un número, cuya posición en la lista de caracteres dada, representa la letra del DNI.

	AYUDA: Usad el código que se adjunta como base de la solución**/

	

	public static void main(String[] args) { 
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		
		System.out.println("Introduzca DNI sin letra: "); 
		
		Scanner leer = new Scanner(System.in); 
		
		int dni = Integer.parseInt(leer.next()); 
		
		int index = dni %23;//dni - (Math.abs(dni/23)*23);
		
		System.out.println("Su letra de DNI es: "+ letras.charAt(index));
			
	}
	}



