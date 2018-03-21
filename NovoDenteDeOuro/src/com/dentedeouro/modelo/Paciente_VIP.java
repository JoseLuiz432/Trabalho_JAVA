package com.dentedeouro.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Classe que modela o paciente que é vip
 * 
 * @author igor e jose luiz
 *
 */

public class Paciente_VIP extends Paciente {

	@SerializedName("numero")
	private String numero_vip;
	private static float valor_presenca = 120f;
	private static float valor_ausencia = 0f;

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 */
	public Paciente_VIP(String cpf, String nome) {
		super(cpf, nome);
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 */

	public Paciente_VIP(String cpf, String nome, String telefone) {
		super(cpf, nome, telefone);
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 * @param email
	 */

	public Paciente_VIP(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 * @param email
	 * @param numero_vip
	 */

	public Paciente_VIP(String cpf, String nome, String telefone, String email, String numero_vip) {
		super(cpf, nome, telefone, email);
		this.numero_vip = numero_vip;
		this.setTipo("Vip");
	}

	/**
	 * Obter numero vip do paciente
	 * 
	 * @return
	 */
	public String getNumero_vip() {
		return numero_vip;
	}

	/**
	 * Setar o numero vip do paciente
	 * 
	 * @param numero_vip
	 */

	public void setNumero_vip(String numero_vip) {
		this.numero_vip = numero_vip;
	}

	/**
	 * Obter valor da consulta caso o paciente compareça
	 * 
	 * @return
	 */

	public static float getValor_presenca() {
		return valor_presenca;
	}

	/**
	 * Setar o valor da consulta caso o paciente compareça
	 * 
	 * @param valor_presenca
	 */

	public static void setValor_presenca(float valor_presenca) {
		Paciente_VIP.valor_presenca = valor_presenca;
	}

	/**
	 * Obter valor caso o paciente falte a consulta
	 * 
	 * @return
	 */

	public static float getValor_ausencia() {
		return valor_ausencia;
	}

	/**
	 * Setar o valor da ausencia do paciente a consulta
	 * 
	 * @param valor_ausencia
	 */

	public static void setValor_ausencia(float valor_ausencia) {
		Paciente_VIP.valor_ausencia = valor_ausencia;
	}

	/**
	 * Calcula o valor da consulta de acordo com o status da mesma
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
