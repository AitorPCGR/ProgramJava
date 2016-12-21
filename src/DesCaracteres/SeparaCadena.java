package DesCaracteres;

import java.util.Scanner;

public class SeparaCadena {

	public SeparaCadena(){}

	public String Lectura(){
	    Scanner lee = new Scanner(System.in);
	    String dato;
	    dato = lee.nextLine();
	    return dato;
	}

	public void SeparaCaracteres(){
	    String data;
	    SeparaCadena Funciones = new SeparaCadena();
	    System.out.println("Ingresa una frase: ");
	    data =  Funciones.Lectura();
	    for (int i = 0, j = 0; i< data.length(); i++, j++){
	        System.out.println(data.substring(j,i+1));
	    }
	}
	}
	
	
	

