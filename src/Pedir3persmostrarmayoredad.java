

import java.util.Scanner;

	public class Pedir3persmostrarmayoredad {
	    public static void main(String[] ar) {
	        
	    	Scanner sc = new Scanner(System.in);
	        
	        String nombre1, nombre2, nombre3;
	        int edad1, edad2, edad3;
	        
	        
	        System.out.print("Introduzca el nombre:");
	        nombre1 = sc.next();
	        
	        System.out.print("Introduzca edad:");
	        edad1 = sc.nextInt();
	        
	        System.out.print("Introduzca el nombre:");
	        nombre2 = sc.next();
	        
	        System.out.print("Introduzca edad:");
	        edad2 = sc.nextInt();
	        
	        System.out.print("Introduzca el nombre:");
	        nombre3 = sc.next();
	        
	        System.out.print("Introduzca edad:");
	        edad3 = sc.nextInt();
	        
	        System.out.print("La persona de mayor edad es:");
	        
	        
	        if (edad1 > edad2) {
	            System.out.print(nombre1);
	        } else {
	            System.out.print(nombre2);
	        }
	        }
	    }
	