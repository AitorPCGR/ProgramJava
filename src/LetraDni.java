

import java.util.Scanner;

public class LetraDni {

	/**Para calcular la letra del DNI, hay un algoritmo, que consiste en obtener el resto de la divisi�n entera entre el n�mero dni y 23.

	Esto, nos da un n�mero, cuya posici�n en la lista de caracteres dada, representa la letra del DNI.

	AYUDA: Usad el c�digo que se adjunta como base de la soluci�n**/

	

	public static void main(String[] args) { 
		
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE"; 
		
		System.out.println("Introduzca DNI sin letra: "); 
		
		Scanner leer = new Scanner(System.in); 
		
		int dni = Integer.parseInt(leer.next()); 
		
		int index = dni %23;//dni - (Math.abs(dni/23)*23);
		
		System.out.println("Su letra de DNI es: "+ letras.charAt(index));
			
	}
	}



