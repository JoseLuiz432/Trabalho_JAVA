package com.dentedeouro.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.modelo.Paciente;

/**
 * Realização das principais operações de gerenciamento das consultas
 * 
 * @author igor e josé luiz
 *
 */

public class ConsultaDAO {

	private static final int NUM_CONSULTAS = 5 * 60; // Constante que guarda a quantidade de Consultas
	private static int qtdConsulta = 0; // Variavel que guarda a quantidade de consultas no vetor
	private static Consulta consultas[] = new Consulta[NUM_CONSULTAS]; // Vetor onde esta localizado as consultas

	public ConsultaDAO() {

	}

	/**
	 * Adiciona a consulta passada por parametro na posição vazia do vetor de
	 * consultas
	 * 
	 * @param consulta
	 * @return boolean
	 */

	public boolean inserirConsulta(Consulta consulta) {
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] == null) {
				consultas[i] = consulta;
				qtdConsulta++;
				return true; // retorno de incersao bem sucedida
			}
		}
		return false; // retorno de erro;
	}

	/**
	 * Obter o codigo da consulta
	 * 
	 * @return codigo da consulta
	 */

	public int getCodigo() {
		int cod = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] == null) {
				cod = i;
				break;
			}

		}
		return cod;
	}

	/**
	 * Quantidade de consultas cadastradas
	 * 
	 * @return valor presenta na variavel que controla a quantidade de consultas
	 */
	public int qtdConsultas() {
		return qtdConsulta;
	}

	/**
	 * Remove a consulta que se encontra na posicao passada por parametro
	 * 
	 * @param posicao
	 * @return boolean
	 */

	public boolean removerConsulta(int posicao) {

		try {
			consultas[posicao] = null;
			qtdConsulta--;
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	/**
	 * Adiciona as consultadas cadastradas em um ArrayList
	 * 
	 * @return ArrayList
	 */
	// A funcao abaixo adiciona as consultas cadastradas no vetor em uma List
	public List<Consulta> arrayConsulta() {
		List<Consulta> auxiliar = new ArrayList<>();
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				auxiliar.add(consultas[i]);
			}
		}
		return auxiliar;
	}

	/**
	 * Exclui todas as consultas presentes no vetor de consultas
	 * 
	 * @return boolean
	 */

	// A Funcao abaixo zera as consultas do vetor
	public boolean zerarConsultas() {
		for (int i = 0; i < NUM_CONSULTAS; i++)
			consultas[i] = null;
		return true;
	}

	/**
	 * Consultar a quantidade de consultas feitas pelo dentista
	 * 
	 * @param dentista
	 * @return quantidade
	 */

	// A Funcao abaixo retorna a quantidade de consultas feitas por um dentista
	public int numConsultasTotal(Dentista dentista) {
		int cont = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (dentista.equals(consultas[i].getDentista())) {
					cont++;
				}
			}
		}

		return cont;
	}

	/**
	 * Quantidade de consultas particular feitas pelo dentista passado por parametro
	 * 
	 * @param dentista
	 * @return quantidade
	 */

	// A Funcao abaixo retorna a quantidade de consultas particular feitas por um
	// dentista
	public int numConsultasParticular(Dentista dentista) {
		int cont = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (dentista.equals(consultas[i].getDentista()) && consultas[i].getTipo().equals("Particular")) {
					cont++;
				}
			}
		}
		return cont;
	}

	/**
	 * Quantidade de consultas vips feitas pelo dentista passado por parametro
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultasVip(Dentista dentista) {
		int cont = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (dentista.equals(consultas[i].getDentista()) && consultas[i].getTipo().equals("Vip")) {
					cont++;
				}
			}
		}
		return cont;
	}

	/**
	 * Quantidade de Consultas de Plano de saúde feitas pelo dentista passado por
	 * parametro
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultasPlano(Dentista dentista) {
		int cont = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (dentista.equals(consultas[i].getDentista()) && consultas[i].getTipo().equals("Plano de Saúde")) {
					cont++;
				}
			}
		}
		return cont;
	}

	/**
	 * Quantidade de consultas realizadas em um determinado dia por um determinado
	 * dentista
	 * 
	 * @param dentista
	 * @param data
	 * @return quantidade
	 */

	public int numConsultasnoDia(Dentista dentista, Date data) {
		int cont = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (dentista.equals(consultas[i].getDentista()) && consultas[i].getDate().compareTo(data) == 0) {
					cont++;
				}
			}
		}
		return cont;
	}

	/**
	 * Calcula o lucro mensal do consultorio de acordo com as consultas cadastradas
	 * 
	 * @return
	 */

	// A funcao abaixo retorna o lucro mensal do consultorio
	public float lucroMensal() {
		float valor = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (consultas[i].getTipo().equals("Plano de Saúde"))
					valor += 30;
				valor += consultas[i].getPaciente().valorConsulta(consultas[i].getEstado());
			}
		}
		return valor;
	}

	/**
	 * Calcula o valor que o paciente passado por parametro possui a pagar
	 * 
	 * @param paciente
	 * @return
	 */

	public float contaPaciente(Paciente paciente) {
		float valor = 0;
		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] != null) {
				if (paciente.equals(consultas[i].getPaciente())) {
					valor += consultas[i].valorConsulta();
				}
			}
		}
		return valor;
	}

	/**
	 * Lista todas as consultas de um determinado dentista passado por parametro na
	 * data passada por parametro
	 * 
	 * @param dentista
	 * @param data
	 * @return String
	 */

	public String listarConsultasDentista(Dentista dentista, Date data) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < NUM_CONSULTAS; i++) {
			if (consultas[i] == null)
				continue;
			if (dentista.equals(consultas[i].getDentista())) {
				if (df.format(consultas[i].getDtConsulta()).equals(df.format(data))) {
					builder.append(consultas[i].toString());
					builder.append('\n');
				}
			}
		}
		return builder.toString();
	}

	/**
	 * Lista as consultas que determinado paciente possui em determinada data
	 * 
	 * @param paciente
	 * @param data
	 * @return
	 */

	public String listarConsultasPaciente(Paciente paciente, Date data) {

		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < NUM_CONSULTAS; i++) {

			if (consultas[i] != null && df.format(consultas[i].getDtConsulta()).equals(df.format(data))) {
				builder.append(consultas[i].getPaciente().toString());
				builder.append('\n');
			}
		}
		return builder.toString();
	}

}
