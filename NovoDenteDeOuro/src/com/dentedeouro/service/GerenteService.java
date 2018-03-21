package com.dentedeouro.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.ConsultaDAO;
import com.dentedeouro.io.ImportJson;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.io.ExportJson;

/**
 * Classe que gerencia os principais relatorios do sistema
 * 
 * @author igor e jose luiz
 *
 */
public class GerenteService {
	/* Gerenciamento de caixa numero de consultas, lucro e etc */

	private ConsultaDAO consulta = new ConsultaDAO();
	private ImportJson importjson = new ImportJson();
	private ExportJson exportjson = new ExportJson();

	/**
	 * Lista o lucro do mes corrente
	 * 
	 * @return
	 */
	/* Listando lucro do mes corrente */
	public float lucro() {
		return consulta.lucroMensal();
	}

	/**
	 * Lista divida do cliente no mes corrente
	 * 
	 * @param paciente
	 * @return
	 */

	/* Listar divida do cliente no mes corrente */
	public float conta(Paciente paciente) {
		if (paciente == null)
			return -1;
		return consulta.contaPaciente(paciente);
	}

	/**
	 * Lista a quantidade de consulta de um detemrinado dentista
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultasTotal(Dentista dentista) {
		if (dentista == null)
			return -1;

		return consulta.numConsultasTotal(dentista);
	}

	/**
	 * Quantidade de consultas particular que um determinado dentista realizou
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultaParticular(Dentista dentista) {
		if (dentista == null)
			return -1;
		return consulta.numConsultasParticular(dentista);
	}

	/**
	 * Quantidade de consultas vips que um determinado dentista realizou
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultasVip(Dentista dentista) {
		if (dentista == null)
			return -1;
		return consulta.numConsultasVip(dentista);
	}

	/**
	 * Quantidade de consultas em pacientes com plano de saude que um determinado
	 * dentista realizou
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultasPlano(Dentista dentista) {
		if (dentista == null)
			return -1;
		return consulta.numConsultasPlano(dentista);
	}

	/**
	 * Importar objeto salvo em um determinado diretorio
	 * 
	 * @param diretorio
	 * @param opcao
	 * @return
	 */
	public boolean importar(String diretorio, int opcao) {

		switch (opcao) {
		case 2:
			try {
				importjson.deJsontoDentista(diretorio);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Arquivo " + diretorio + ".json nao encontrado");
				return false;
			}
			break;
		case 3:
			try {
				importjson.deJsontoConsulta(diretorio);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Arquivo " + diretorio + ".json nao encontrado");
				return false;
			}
			break;
		case 1:
			try {
				importjson.deJsontoPaciente(diretorio);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "Arquivo " + diretorio + ".json nao encontrado");
				return false;
			}
			break;
		}
		return true;
	}

	/**
	 * Exportar dados em arquivo .json
	 * 
	 * @param diretorio
	 * @param opcao
	 * @return
	 */
	public boolean exportar(String diretorio, int opcao) {
		try {
			switch (opcao) {
			case 1:
				exportjson.dePacientetoJson(diretorio);
				break;
			case 2:
				exportjson.deDentistatoJson(diretorio);
				break;
			case 3:
				exportjson.deConsultatoJson(diretorio);
				break;
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return true;
	}

}
