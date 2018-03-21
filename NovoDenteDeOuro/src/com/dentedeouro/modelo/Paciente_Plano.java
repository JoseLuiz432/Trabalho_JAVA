package com.dentedeouro.modelo;

import com.google.gson.annotations.SerializedName;

/**
 * Classe que modela o paciente que utiliza plano de saúde
 * 
 * @author igor e jose luiz
 *
 */
public class Paciente_Plano extends Paciente {

	@SerializedName("numero")
	private String nome_plano = "qualquer";
	private static float valor_presenca = 40f;
	private static float valor_ausencia = 70f;

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 */
	public Paciente_Plano(String cpf, String nome) {
		super(cpf, nome);
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 */

	public Paciente_Plano(String cpf, String nome, String telefone) {
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
	public Paciente_Plano(String cpf, String nome, String telefone, String email) {
		super(cpf, nome, telefone, email);
		this.setTipo("Plano de Saúde");
	}

	/**
	 * Obter nome do paciente
	 * 
	 * @return
	 */

	public String getNome_plano() {
		return nome_plano;
	}

	/**
	 * Setar o nome do paciente
	 * 
	 * @param nome_plano
	 */

	public void setNome_plano(String nome_plano) {
		this.nome_plano = nome_plano;
	}

	/**
	 * Obter valor caso o paciente compareça na consulta
	 * 
	 * @return
	 */

	public static float getValor_presenca() {
		return valor_presenca;
	}

	/**
	 * Seta o valor da consulta desse tipo de pacientes
	 * 
	 * 
	 * @param valor_presenca
	 */

	public static void setValor_presenca(float valor_presenca) {
		Paciente_Plano.valor_presenca = valor_presenca;
	}

	/**
	 * Obter o valor da consulta caso o paciente nao compareça
	 * 
	 * @return
	 */

	public static float getValor_ausencia() {
		return valor_ausencia;
	}

	/**
	 * Seta o valor da consulta caso o paciente nao compareça
	 * 
	 * @param valor_ausencia
	 */
	public static void setValor_ausencia(float valor_ausencia) {
		Paciente_Plano.valor_ausencia = valor_ausencia;
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
