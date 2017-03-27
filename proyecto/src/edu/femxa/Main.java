package edu.femxa;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Empieza el programa.");
		
		ListaPersonas lista = new ListaPersonas();
		Persona persona1 = new Persona("Aitor", 22);
		Persona persona2 = new Persona("Álvaro", 27);
		
		lista.insertarPersona(persona1);
		lista.insertarPersona(persona2);
		lista.listarPersonas();
		int resultadoBuscar = lista.buscarPersonaPos("Álvaro");
		
		if (resultadoBuscar == -5)
		{
			System.out.println("La persona no existe.");
		}
		else { System.out.println("La persona existe.");
		System.out.println("La persona está en posición "+ resultadoBuscar);
		}
		
		
}
}
