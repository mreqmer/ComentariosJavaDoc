package clases;

import java.util.Random;

/**
 * En la clase Aleatorios están contenidas las funciones que crean números
 * aleatorios.
 */

public class Aleatorios {

	/**
	 * Función encargada de generar una cantidad, dicha 0por consola, de números
	 * aleatorios.
	 * 
	 * @param cantidad Cantidad de números aleatorios que se generarán
	 * 
	 */
	public static void numerosAletorios(int cantidad) {
		double aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = Math.random();
			System.out.println(aleatorio);
		}
	}

	/**
	 * Función encargadad de generar una cantidad dada de números aleatorios, con un
	 * máximo definido
	 * 
	 * @param cantidad Cantidad de números aleatorios a generar
	 * @param max Número máximo que tendrá el número generado
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		int aleatorio;

		for (int i = 1; i <= cantidad; i++) {
			aleatorio = (int) Math.random() * max;
			System.out.println(aleatorio);
		}
	}

	/**
	 * Crea números aleatorios con un máximo y un mínimo definidos
	 * @param cantidad | cantidad de números a generar
	 * @param minimo | número más alto de un número generado
	 * @param maximo | número más bajo de un número generado
	 */
	public static void numerosAleatorios(int cantidad, int minimo, int maximo) {
		int aleatorio;
		Random rand = new Random();
		for (int i = 1; i <= cantidad; i++) {
			aleatorio = rand.nextInt(minimo, maximo + 1);
			System.out.println(aleatorio);
		}
	}
}
