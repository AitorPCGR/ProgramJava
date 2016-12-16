

import java.util.Scanner;

//hacer un programa que pida una nota, hasta que sea aprobado (> que 5)
//
public class Boolean_función {

	public static int pedirNota() {
		int n_leido = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		n_leido = scanner.nextInt();
		return n_leido;
	}

	public static boolean suspenso(int numero) {
		boolean bul = false;
		if (numero < 5) {
			bul = true;
		} else
			bul = false;
		return bul;
	}

	public static void main(String[] args) {
		int nota_introducida = 0;
		do {
			System.out.println("Introduce una nota. ");
			nota_introducida = pedirNota();
			if (suspenso(nota_introducida)) {
				System.out.println("Has suspendido.");
			}
		} while (suspenso(nota_introducida));
		System.out.println("¡Has aprobado, por Crom!");
	}
}