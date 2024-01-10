package clases;

/**
 * En esta clase están contenidos todos los cálculos relacionados con las opeaciones sobre una esfera
 */
public class Esfera {
	
	/**
	 * Radio de la esfera
	 */
	double radio = 1.0;
	
	/**
	 * Constructor sin parámetros
	 */
	public Esfera() {
		super();
	}

  /**
   * Constructor con el parámetro radio
   * @param radio
   */
	public Esfera(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Hace los cálculos de la superficie de la esfera
	 * @return superficie | supercifie calculada de la esfera
	 */
	public double superficie() {
		/**
		 * guarda el volumen calculado de la esfera
		 */
		double superficie = 4*Math.PI*Math.pow(radio, 2);		
		return superficie;
	}
	
	/**
	 * Hace los cálculos del volumen de la esfera
	 * @return volumen |volumen calculado de la esfera
	 */
	public double volumen() {
		/**
		 * Guarda el volumen calculado de la esfera
		 */
		double volumen = (4*Math.PI/3) * Math.pow(radio, 3);
		return volumen;
	}
}
