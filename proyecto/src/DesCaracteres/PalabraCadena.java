package DesCaracteres;

public class PalabraCadena {

	public void mostrarLetrasdeunapalabraporlinea(String palabra, char letra) {
	}

	public void mostrarLetrasPalabra(String palabra) {
		int index = 0;
		int longi = palabra.length();
		char letra = 0; // la letra es un número en el fondo, recuerda
		while (index < longi) {
			letra = palabra.charAt(index);
			System.out.println("Letra " + index + " = " + letra);
			index = index + 1;
		}
	}

	public static void main(String[] args) {
		 String data;
		 SeparaCadena Funciones = new SeparaCadena();
		 System.out.println("Ingresa una frase: ");
		 data =  Funciones.Lectura();
		 for (int i = 0, j = 0; i< data.length(); i++, j++){
		        System.out.println(data.substring(j,i+1));
	}}}

