package com.dentedeouro.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Classe que modelo o paciente particuar e extende a classe paciente
 * 
 * @author igor
 *
 */
public class Paciente_Particular extends Paciente {

	@SerializedName("numero")
	private String conta_bancaria;

	private static float valor_presenca = 100f;
	private static float valor_ausencia = 50f;

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param conta_bancaria
	 */
	public Paciente_Particular(String cpf, String nome, String conta_bancaria) {
		super(cpf, nome);
		this.conta_bancaria = conta_bancaria;
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 * @param conta_bancaria
	 */

	public Paciente_Particular(String cpf, String nome, String telefone, String conta_bancaria) {
		super(cpf, nome, telefone);
		this.conta_bancaria = conta_bancaria;
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 * @param email
	 * @param conta_bancaria
	 */

	public Paciente_Particular(String cpf, String nome, String telefone, String email, String conta_bancaria) {
		super(cpf, nome, telefone, email);
		this.conta_bancaria = conta_bancaria;
	}

	/**
	 * Construtor
	 * 
	 * @return
	 */

	public String getConta_bancaria() {
		return conta_bancaria;
	}

	/**
	 * Seta a conta bancadia do cliente particular
	 * 
	 * @param conta_bancaria
	 */

	public void setConta_bancaria(String conta_bancaria) {
		this.conta_bancaria = conta_bancaria;
	}

	/**
	 * Obter valor da consulta desse tipo de paciente
	 * 
	 * @return
	 */

	public static float getValor_presenca() {
		return valor_presenca;
	}

	/**
	 * Seta o valor desse tipo de paciente
	 * 
	 * @param valor_presenca
	 */

	public static void setValor_presenca(float valor_presenca) {
		Paciente_Particular.valor_presenca = valor_presenca;
	}

	/**
	 * Obter valor caso paciente desse tipo nao compareça na consulta
	 * 
	 * @return
	 */

	public static float getValor_ausencia() {
		return valor_ausencia;
	}

	/**
	 * Seta o valor da ausencia
	 * 
	 * @param valor_ausencia
	 */

	public static void setValor_ausencia(float valor_ausencia) {
		Paciente_Particular.valor_ausencia = valor_ausencia;
	}

	/**
	 * Obter o valor da consulta de acordo com o status da consulta
	 */

	@Override
	public float valorConsulta(StatusConsulta estado) {
		// TODO Auto-generated method stub
		switch (estado) {
		case CONFIRMADA:
			return valor_presenca;

		case AUSENTE:
			return valor_ausencia;

		case CANCELADA:
			return valor_ausencia;

		}
		return 0f;
	}

}
