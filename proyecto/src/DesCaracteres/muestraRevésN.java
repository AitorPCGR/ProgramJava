package DesCaracteres;

public class muestraRev�sN {

	public static void main(String[] args) {
		String cadenaOriginal = "HOLA";
		String cadenaInvertida = "";

		for (int i = cadenaOriginal.length() - 1; i >= 0; i--) {
			cadenaInvertida += cadenaOriginal.charAt(i);
		}
		System.out.println(cadenaInvertida);
	}
}
