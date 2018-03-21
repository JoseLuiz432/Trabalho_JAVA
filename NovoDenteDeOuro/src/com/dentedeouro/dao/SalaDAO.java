package com.dentedeouro.dao;

import java.util.ArrayList;
import java.util.List;

import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.Sala;

/**
 * Realização das principais operações de gerenciamento das salas do consultório
 * 
 * @author igor e josé luiz
 *
 */
public class SalaDAO {
	private static final int NUM_SALAS = 5;
	private static Sala salas[] = new Sala[NUM_SALAS];

	public SalaDAO() {

	}

	/**
	 * Inserir sala em um vetor de salas
	 * 
	 * @param num_sala
	 * @return
	 */
	public boolean inserirSala(int num_sala) {
		for (int i = 0; i < NUM_SALAS; i++) {
			if (salas[i] == null) {
				salas[i] = new Sala(num_sala);
				return true;
			}
		}
		return false;
	}

	/**
	 * Insere uma determinada consulta em uma sala vazia
	 * 
	 * @param consulta
	 * @param num_sala
	 * @return
	 */
	public boolean inserirConsultanaSala(Consulta consulta, int num_sala) {
		for (int i = 0; i < NUM_SALAS; i++) {
			if (salas[i].getNum() == num_sala) {
				salas[i].setConsulta(consulta);
				return true;
			}
		}
		return false; // sala nao encontrada
	}

	/**
	 * Remove as consultas de uma determinada sala
	 * 
	 * @param num_sala
	 * @return
	 */

	public boolean removerConsultanaSala(int num_sala) {
		for (int i = 0; i < NUM_SALAS; i++) {
			if (salas[i].getNum() == num_sala) {
				salas[i].setConsulta(null);
				return true;
			}
		}
		return false;
	}

	/**
	 * Adiciona todas as salas em uma estrutura de dados ArrayList
	 * 
	 * @return
	 */
	public List<Sala> arraySala() {
		List<Sala> auxiliar = new ArrayList<>();
		for (int i = 0; i < NUM_SALAS; i++) {
			if (salas[i] != null) {
				auxiliar.add(salas[i]);
			}
		}
		return auxiliar;
	}

}
