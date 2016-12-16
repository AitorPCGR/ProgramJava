

import java.util.Scanner;

public class Class2 {
	
public static final int NUMERO_ALUMNOS = 3;
	
	public static String pedirNombre(){
		String nombrePedido = null;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			nombrePedido = scanner.next();
		
		return nombrePedido;
	}
	
	public static int pedirEdad(){
		int edad = 0;
		Scanner scanner = null;
		
			scanner = new Scanner(System.in);
			edad = scanner.nextInt();
		
		return edad;
	}
	
	public static void main(String[] args) {
		
		String nombre = null;
		int edad = 0;

		Persona p = new Persona();
		for(int i=0; i<=NUMERO_ALUMNOS; i++ ){
			
			System.out.print("Introduzca su nombre: ");
			nombre = pedirNombre();
			System.out.print("Introduzca su edad: ");
			edad = pedirEdad();
		
			p.setNombre(nombre);
			p.setEdad(edad);
			
			p.mostrarPersona();
			System.out.println();
		}	
		
	}
}


