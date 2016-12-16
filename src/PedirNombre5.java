

import java.util.Scanner;

public class PedirNombre5 {
	
	
	
	
	public static String pedirNombre(){
		String nombrePedido = null;
		Scanner scanner = null;
		
		nombrePedido = scanner.next ();
		
		return nombrePedido;
	}
	
	public static int pedirEdad(){
		int edad = 0;
		Scanner scanner = null;
		
		Scanner = new Scanner (System.in);
		edad = scanner.nextInt();
		
		return edad;
	}
	
	public static void man (String[] args){
		
		String nombre = null;
		int edad = 0;
		
		Persona p = new Persona (nombre, edad);
		
		for (int i=0; i <= NUMERO_ALUMNOS; i++ ){
			
			
			System.out.println("Introduzca su nombre");
			nombre = pedirNombre();
			System.out.println("Introduzca su edad");
			edad = pedirEdad();
			
			
			p.setNombre (nombre);
			p.setEdad (edad);
			p.mostrarPersona ();
			//p.exponerpersona(p)
			System.out.println();
			
		}
	}
}
