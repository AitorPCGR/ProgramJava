package edu.femxa;

import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Registarse {

	public static void escribir(String nombre, int contraseña) throws IOException {

		// Hacer el código de escribir.

		File fichero = new File("fichero_nombre.txt");
		FileWriter fw = new FileWriter(fichero);
		BufferedWriter br = new BufferedWriter(fw);

		br.write(nombre);

		br.close();
		fw.close();

		File fichero1 = new File("fichero_contraseña.txt");
		FileWriter fw1 = new FileWriter(fichero1);
		BufferedWriter br1 = new BufferedWriter(fw1);

		
		String palabra_contraseña = String.valueOf(contraseña);
		br1.write(palabra_contraseña);

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

	public static int pedirContraseña() {
		Scanner sc = new Scanner(System.in);
		int contraseña = 0;
		System.out.println("Introduzca contraseña de usuario.");
		contraseña = sc.nextInt();
		return contraseña;
	}
	
	public static void main(String[] args) throws IOException {
		
		String nombre = pedirNombre();
		int contraseña = pedirContraseña();
		
		escribir(nombre, contraseña);
		
		
	}
}
