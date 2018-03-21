package com.dentedeouro.service;

import java.util.List;

import com.dentedeouro.dao.PacienteDAO;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.utils.Verificador;

/**
 * Classe que controla as principais manipulações feitas com os pacientes
 * 
 * @author igor e jose luiz
 *
 */
public class PacienteService {

	private PacienteDAO paciente = new PacienteDAO();
	private Verificador verificador = new Verificador();

	/**
	 * Inserir paciente no sistema
	 */
	public int inserir(Paciente p) {

		if (p.getNome() == null || p.getCpf() == null) {
			return -1; // retorno de erro base
		} else {
			/* Demais verificacoes para a possivel insercao */
			if (!verificador.verificaCPF(p.getCpf()))
				return -2;// erro no cpf
			/* Telefone e e-mail nao sao essencial para o cadastro */
			if (p.getTelefone() != null) {
				if (!verificador.verificaTEL(p.getTelefone()))
					return -3;// erro no telefone
			}
			if (p.getE_mail() != null) {
				if (!verificador.verificaEMA(p.getE_mail()))
					return -4;// erro no email
			}
			if (paciente.inserirPaciente(p)) {
				return 0;// sucesso
			}
			return -5;// Erro numero de pacientes excedido
		}
	}

	/**
	 * Obter a quantidade de pacientes
	 * 
	 * @return
	 */

	public int qtdPacientes() {
		return paciente.qtdPacientes();
	}

	/**
	 * Remove um determinado paciente
	 * 
	 * @param cpf
	 * @return
	 */

	public boolean remover(String cpf) {
		return paciente.removerPaciente(cpf);
	}

	/**
	 * Procurar paciente
	 * 
	 * @param cpf
	 * @return
	 */

	public Paciente procurarPaciente(String cpf) {
		return (paciente.procurarPaciente(cpf));
	}

	/**
	 * Colocar pacientes cadastrados em um arraylist
	 * 
	 * @return
	 */
	public List<Paciente> array() {
		return paciente.arrayPaciente();
	}

}
