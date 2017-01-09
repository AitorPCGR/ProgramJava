

import java.util.Scanner;

public class Palindromo {
	
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);
	        int i=0, j;
	        String frase;
	        boolean esPalindromo=true;
	        System.out.println("Introduzca una frase para detectar el palíndromo.");
	        frase = entrada.nextLine();
	        j=(frase.length()-1);
	        while (i<j & esPalindromo)
	            if (!Character.isLetter(frase.charAt(i)))
	                i++;
	            else
	                if (!Character.isLetter(frase.charAt(j)))
	                    j--;
	                else
	                    if (frase.charAt(i) == frase.charAt(j)){
	                        i++;
	                        j--;
	                    }
	                    else
	                        esPalindromo = false;
	        if (i>=j)
	            System.out.println("La frase es un palíndromo.");
	        else
	            System.out.println("La frase no es un palíndromo.");
	    }
	}   

//AitorPCGR
