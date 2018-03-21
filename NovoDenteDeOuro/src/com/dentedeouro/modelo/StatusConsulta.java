package com.dentedeouro.modelo;

/**
 * Enum que contem os status da consulta
 * @author igor
 *
 */

public enum StatusConsulta {
	CONFIRMADA(0), CANCELADA(1), AUSENTE(2);
	private int valor;

	StatusConsulta(int valor) {
		this.valor = valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return this.valor;
	}

}
