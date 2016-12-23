package DesCaracteres;

import java.util.Scanner;
import java.util.Random;;

public class adivinarnumero {
	
	public static int pedirNumero()
	{
		int numero_introducido = 0;
		Scanner scanner = null;
		
			Scanner sc = new Scanner(System.in);
			numero_introducido = scanner.nextInt();
		
		return numero_introducido;
	}
	
	public static void main (String[] args){
		
		//Scanner sc = new Scanner(System.in);
		int numero_introducido = 0;
		int numero_aleatorio = (int) (Math.random()*100) +1;
		
		int intentos = 5;
		
		if (numero_introducido < numero_aleatorio)
		{
			System.out.println("El número es mayor.");	
		}
			else if	(numero_introducido > numero_aleatorio)
				
				System.out.println ("El número es menor.");
		
		
	}while ((numero_introducido != numero_aleatorio) && (contador< intentos));
		
		
		
		
		
		
		
		
		
	}
}