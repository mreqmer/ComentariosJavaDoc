package clases;

/**
 * Recoge distintas operaciones de dos números dados
 */
public class Operaciones {
	/**
	 * Numero 1
	 */
	double num1;
	/**
	 * Numero 2
	 */
	double num2;

	/**
	 * Constructor sin parámetros
	 */
	public Operaciones() {

	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param num1 | Numero 1
	 * @param num2 | Numero 2
	 */
	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	/**
	 * Suma los dos números
	 * 
	 * @return el cálculo de la suma de ambos números
	 */
	public double suma() {
		return num1 + num2;
	}

	/**
	 * Resta los dos números
	 * 
	 * @return el cálculo de la resta de ambos números
	 */
	public double resta() {
		return num1 - num2;
	}

	/**
	 * Multiplicación de los dos números
	 * 
	 * @return el cálculo de la multiplicación de ambos números
	 */
	public double multiplicacion() {
		return num1 * num2;
	}

	/**
	 * División de numero 1 entre numero 2, comprobando que el divisor no pueda ser
	 * 0, si lo es el resultado es 0
	 * 
	 * @return el cálculo de la división de ambos números
	 */
	public double division() {
		/**
		 * Var donde se guardará el resultado de la operación, se inicializa en 0 para
		 * devolver ese número si el divisor es 0
		 */
		double res = 0;

		if (num2 != 0) {
			res = num1 / num2;
		}
		return res;
	}
	/**
	 * Calcula el número mayor de ambos
	 * @return Devuelve que número es mayor de ambos
	 */
	public double max() {
		return num1 > num2 ? num1 : num2;
	}
	/**
	 * Calcula el número menor de ambos
	 * @return Devuelve que número es menor de ambos
	 */
	public double min() {
		return num1 < num2 ? num1 : num2;
	}
}
