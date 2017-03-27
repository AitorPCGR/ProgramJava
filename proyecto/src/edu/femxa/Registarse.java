package edu.femxa;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Registarse {

	public static void escribir(String nombre, int contrase�a) throws IOException {

		// Hacer el c�digo de escribir.

		File fichero = new File("fichero_nombre.txt");
		FileWriter fw = new FileWriter(fichero);
		BufferedWriter br = new BufferedWriter(fw);

		br.write(nombre);

		br.close();
		fw.close();

		File fichero1 = new File("fichero_contrase�a.txt");
		FileWriter fw1 = new FileWriter(fichero1);
		BufferedWriter br1 = new BufferedWriter(fw1);

		
		String palabra_contrase�a = String.valueOf(contrase�a);
		br1.write(palabra_contrase�a);

		br1.close();
		fw1.close();
		
		System.out.println("Datos guardados correctamente.");

		
	}

	public static String pedirNombre() {
		Scanner sc = new Scanner(System.in);
		String nombre;
		System.out.println("Introduzca nombre de usuario.");
		nombre = sc.nextLine();
		return nombre;
	}

	public static int pedirContrase�a() {
		Scanner sc = new Scanner(System.in);
		int contrase�a = 0;
		System.out.println("Introduzca contrase�a de usuario.");
		contrase�a = sc.nextInt();
		return contrase�a;
	}
	
	public static void main(String[] args) throws IOException {
		
		String nombre = pedirNombre();
		int contrase�a = pedirContrase�a();
		
		escribir(nombre, contrase�a);
		
		
	}
}
