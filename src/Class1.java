

import java.util.Scanner;

// hacer un programa que pida una nota, hasta que sea aprobado (> que 5)
public class Class1 {

	public static int pedirNota() {
		int n_leido = 0;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		n_leido = scanner.nextInt();
		return n_leido;
	}

	public static void main(String[] args) {
		int nota_introducida = 0;
		do {
			System.out.println("Introduce una nota: ");
			nota_introducida = pedirNota();
			if (nota_introducida < 5) {
				System.out.println("Has suspendido");
			}
		} while (nota_introducida < 5);
		System.out.println("¡Has aprobado, por Crom!");
	}

}


