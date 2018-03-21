package com.dentedeouro.dao;

import java.util.ArrayList;
import java.util.List;

import com.dentedeouro.modelo.Dentista;

/**
 * Realização das principais operações de gerenciamento dos dentistas
 * 
 * @author igor e josé luiz
 *
 */

public class DentistaDAO {

	private static final int NUM_DENTISTA = 5;
	private static int qtddentista = 0;
	private static Dentista[] dentista = new Dentista[NUM_DENTISTA];

	public DentistaDAO() {

	}

	/**
	 * Cadastrar novo dentista
	 * 
	 * @param dados
	 * @return boolean
	 */

	public boolean inserirDentista(Dentista dados) {

		// Percorrendo o vetor de dentistas com o objetivo de encontrar uma posicao
		// vazia
		for (int i = 0; i < NUM_DENTISTA; i++) {
			// Se encontrar a posicao vazia, inserir nessa posicao
			if (dentista[i] == null) {
				dentista[i] = dados;
				qtddentista++;
				return true;

			}

		}
		return false;
	}

	/**
	 * Obter todos os dentistas cadastrados
	 * 
	 * @return
	 */
	public String[] getDentista() {
		String[] todosdentista = new String[NUM_DENTISTA];

		for (int i = 0; i < qtddentista; i++) {
			if (dentista != null)
				todosdentista[i] = dentista[i].getNome();
		}
		return todosdentista;
	}

	/**
	 * Quantidade de Dentistas cadastrados
	 * 
	 * @return
	 */

	public int qtdDentista() {
		return qtddentista;
	}

	/**
	 * Remover dentista cadastrado
	 * 
	 * @param posicao
	 * @return
	 */

	public boolean removerDentista(int posicao) {

		try {
			dentista[posicao] = null;
			qtddentista--;
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	/**
	 * Procurar por determinado dentista e retornar o objeto contendo este dentista
	 * 
	 * @param nome
	 * @return dentista
	 */
	public Dentista procurarDentista(String nome) {
		for (int i = 0; i < dentista.length; i++) {
			if (dentista[i].getNome().equals(nome)) {
				return dentista[i];
			}
		}
		return null;
	}

	/**
	 * Adicionar todos os dentistas presente no vetor em um ArrayList
	 * 
	 * @return
	 */

	public List<Dentista> arrayDentista() {
		List<Dentista> auxiliar = new ArrayList<>();
		for (int i = 0; i < NUM_DENTISTA; i++) {
			if (dentista[i] != null) {
				auxiliar.add(dentista[i]);
			}
		}
		return auxiliar;
	}

}
