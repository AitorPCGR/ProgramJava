package edu.femxa;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Haced un programa (Una clase Main) con dos m�todos: 1) El main 2) y una
 * funci�n que reciba una cadena (String) con espacios en blanco; es decir, una
 * frase; y devuelva esa frase, sin espacios, toda junta.
 */

public class Estoesunafrase {

	public static void main(String[] args) {

		String palabra;
		String palabra2;
		String palabra3;
		String palabra4;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una palabra.");
		palabra = sc.nextLine();

		System.out.println("Introduzca otra palabra.");
		palabra2 = sc.nextLine();
		
		System.out.println("Introduzca otra palabra.");
		palabra3 = sc.nextLine();

		System.out.println("Introduzca la �ltima palabra.");
		palabra4 = sc.nextLine();

		// Esto lo encontr� por Internet.
		String cadena1 = palabra + palabra2 + palabra3 + palabra4;
		JOptionPane.showMessageDialog(null, cadena1);

	}
}

// AitorPCGR
