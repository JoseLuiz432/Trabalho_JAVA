package com.dentedeouro.modelo;

import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PacienteTableModelo extends DefaultTableModel {
	/**
	 * Classe que modela a table dos pacientes
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Adiciona as colunas na tabela do paciente
	 */
	public PacienteTableModelo() {
		this.addColumn("NOME");
		this.addColumn("CPF");
		this.addColumn("EMAIL");
		this.addColumn("TELEFONE");
		this.addColumn("TIPO");
	}

	/**
	 * Lista os dados na tabela dos pacientes
	 * 
	 * @param listPaciente
	 */
	public PacienteTableModelo(List<Paciente> listPaciente) {
		this();
		for (Paciente c : listPaciente) {
			this.addRow(new String[] { c.getNome(), c.getCpf(), c.getE_mail(), c.getTelefone(), c.getTipo() });
		}
	}

}
