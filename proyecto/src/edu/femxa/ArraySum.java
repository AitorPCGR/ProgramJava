package edu.femxa;



/**
* HACED EL CUERPO DEL MAIN
* PARA QUE DEVUELVA LA NOTA
* MEDIA 
* 
* Ojo con los tipos
* la media será real (float)
* 
*/
public class ArraySum {

	private static int[] array_notas = {0, 10, 2, 6, 7, 5, 4};
	
	/*public double main(String[] args) {
	
		double media = 0.0;
		for (int i=0; i < array_notas.length; i++) {
			 media = media + array_notas[i];
			 }
		media = media / array_notas.length;
		
		return media;
	}*/
	
	
	public static void main(String[] args) {
		
		double media = 0.0;
		for (int i=0; i < array_notas.length; i++) {
			 media = media + array_notas[i];
			 }
		media = media / array_notas.length;
		
		System.out.println("La media es " + media);
		
	}
	}
	
	
	//AitorPCGR

