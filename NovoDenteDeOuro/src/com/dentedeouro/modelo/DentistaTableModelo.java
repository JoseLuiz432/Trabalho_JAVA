package com.dentedeouro.modelo;

import java.util.List;

import javax.swing.table.DefaultTableModel;

/**
 * Classe que modela a tabela onde os dentistas cadastrados ficam armazenados
 * 
 * @author igor
 *
 */
public class DentistaTableModelo extends DefaultTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Adiciona as colunas na tabela
	 */
	public DentistaTableModelo() {
		this.addColumn("NOME");
		this.addColumn("ESPECIALIDADE");
		this.addColumn("CRO");
	}

	/**
	 * Adiciona na table a list passado por parametro
	 * 
	 * @param listDentistas
	 */
	public DentistaTableModelo(List<Dentista> listDentistas) {
		this();
		for (Dentista c : listDentistas) {
			this.addRow(new String[] { (c.getNome()), (c.getEspecialidade()), (c.getCro()) });
		}
	}

}
