package com.dentedeouro.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dentedeouro.modelo.Paciente;

/**
 * Realização das principais operações de gerenciamento dos pacientes
 * @author igor e josé luiz
 *
 */
public class PacienteDAO {

	
	private static Map<String, Paciente> pacientes = new HashMap<>();

	public PacienteDAO() {

	}
	/**
	 * Insere o paciente passado por parametro em uma HashMap
	 * @param dados
	 * @return boolean
	 */
	public boolean inserirPaciente(Paciente dados) {
		
		pacientes.put(dados.getCpf(), dados);
		
		return true;
	}
	
	/**
	 * Quantidade de Pacientes cadastrados
	 * @return
	 */
	// Quantidade de pacientes cadastrados
	public int qtdPacientes() {
		return pacientes.size();
	}
	
	/**
	 * Remover paciente da estrutura de dados que contem todos os pacientes
	 * @param cpf
	 * @return boolean
	 */

	// Funcao que remove do vetor de pacientes a posicao passada por parametro
	public boolean removerPaciente(String cpf) {
		if(pacientes.containsKey(cpf)) {
			pacientes.remove(cpf);
			return true;
		}else return false;
		
	}
	
	/**
	 * Procurar paciente através do paciente cpf passado por parametro
	 * @param cpf
	 * @return paciente
	 */

	public Paciente procurarPaciente(String cpf) {
		
		if(pacientes.containsKey(cpf)) {
			return pacientes.get(cpf);
		}
		return null;
	}
	
	/**
	 * Adiciona todos os pacientes em um arraylist
	 * @return
	 */

	public List<Paciente> arrayPaciente() {
		List<Paciente> auxiliar = new ArrayList<>(pacientes.values());
		return auxiliar;
	}

}
