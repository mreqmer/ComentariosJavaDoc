package clases;

import java.util.Random;

/**
 * Contiene los elementos necesarios para mostrar la tabla, generar el tesoro y el movimiento
 */
public class Tesoro {
	/**
	 * Contiene el tamaño del tablero
	 */
	public static final int TAM_TABLERO = 5;
	/**
	 * Contiene la posición X del tesoro
	 */
	static int xTesoro;
	/**
	 * Contiene la posición Y del tesoro
	 */
	static int yTesoro;
	/**
	 * contiene la posición actual X del jugador
	 */
	int xJugador = 1;
	/**
	 * contiene la posición actual Y del jugador
	 */
	int yJugador = 1;

	/**
	 * Genera una posición aleatoria del tesoro, entre 1 y el tamaño máximo del tablero
	 */
	static void generaPosicionTesoro() {
		Random rand = new Random();
		xTesoro = rand.nextInt(1, TAM_TABLERO + 1);
		yTesoro = rand.nextInt(1, TAM_TABLERO + 1);
	}
	
	/**
	 * Muestra el tablero
	 */
	void pintaTablero() {
		// Imprimimos la primera línea de números
		for (int i = 1; i <= TAM_TABLERO; i++) {
			System.out.print("\t" + i);
		}

		// Salto de línea para comenzar con los números de la izquierda
		System.out.println();

		// Bucle para imprimir las líneas
		for (int i = 1; i <= TAM_TABLERO; i++) {
			// Imprimimos el número de línea
			System.out.print(i);
			// Si la línea coincide con la posición X del jugador
			if (xJugador == i) {
				/// Imprimimos tantos tabuladores como posición Y del jugador
				for (int j = 1; j <= yJugador; j++) {
					System.out.print("\t");
				}
				// Imprimimos la ficha del jugador
				System.out.print("J");
			}
			// Salto de línea para pasar a la siguiente línea
			System.out.println();
		}
	}
	/**
	 * Se encarga de mover el eje X y/o Y del jugador según su input de movimiento
	 * @param movimiento | Input del jugador, puede ser arriba, abajo, derecha e izquierda
	 * @return res |
	 */
	int mueveJugador(String movimiento) {
		int res = 0;
		String movMinuscula = movimiento.toLowerCase();

		switch (movMinuscula) {
		case "arriba":
			if (xJugador - 1 < 1) {
				res = -1;
			} else {
				xJugador--;
			}
			break;
		case "abajo":
			if (xJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				xJugador++;
			}
			break;
		case "izquierda":
			if (yJugador - 1 < 1) {
				res = -1;
			} else {
				yJugador--;
			}
			break;
		case "derecha":
			if (yJugador + 1 > TAM_TABLERO) {
				res = -1;
			} else {
				yJugador++;
			}
			break;
		default:
			res = -2;
			break;
		}		
		
		return res;
	}

	boolean buscaTesoro(){
		boolean res = false;
		if(xTesoro == xJugador && yTesoro == yJugador) {
			res = true;
		}
		return res;
	}
}
