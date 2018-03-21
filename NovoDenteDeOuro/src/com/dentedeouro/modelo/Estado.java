package com.dentedeouro.modelo;

/**
 * Estados dos pacientes
 * 
 * @author igor e jose luiz
 *
 */
public enum Estado {
	PRESENTE(0), AUSENTE(1), CANCELADO(2);
	private int valor;

	Estado(int valor) {
		this.valor = valor;
	}

	/**
	 * Obter valor veinculado ao estado
	 * 
	 * @return
	 */

	public int getValor() {
		return this.valor;
	}

}
