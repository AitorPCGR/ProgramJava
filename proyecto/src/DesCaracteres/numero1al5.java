package DesCaracteres;

import java.util.Random;
import java.util.Scanner;

public class numero1al5 {
	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner entrada = new Scanner(System.in);
		int aleatorio;
		int numero;
		aleatorio = (int) (rnd.nextDouble() * 5 + 1);
		do {
			System.out.println("Adivina el número del 1 al 5: ");
			numero = entrada.nextInt();
		} while (numero != aleatorio);
		System.out.println("Has acertado!!!");
	}
}
