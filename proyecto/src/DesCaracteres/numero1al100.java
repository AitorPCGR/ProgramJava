package DesCaracteres;

import java.util.Random;
import javax.swing.JOptionPane;

// El programa elige un número del 0 al 99 y pide adivinarlo. En cada fallo dice si es mayor o menor
// y dice cuantos intentos ha necesitado.
public class numero1al100 {
	public static void main(String[] args) {
		Random r = new Random();
		int adivinar = r.nextInt(100); // genera un número entre 0 y 99
		int i = 0; // crea variable contador que es usada para contar los
					// intentos fallidos
		int apuesta = input("Comienza el juego. Adivina el número entre 0 y 99.");
		while (adivinar != apuesta) { // si el número dado es distinto al
										// sorteado repite
			i++; // incrementa variable contador
			if (adivinar > apuesta) {
				apuesta = input("El número es mayor. \n Inténtalo otra vez");
			} else {
				apuesta = input("El número es menor. \n Inténtalo otra vez");
			}
		}
		JOptionPane.showMessageDialog(null, "Felicitaciones ha dado con el número con " + i + " intentos fallidos");
	}

	/**
	 * Muestra una ventana con el mensaje text y solicita una respuesta
	 * 
	 * @param text
	 * @return devuelve un número int
	 */
	private static int input(String text) {
		return Integer.parseInt(JOptionPane.showInputDialog(text));
	}
}
