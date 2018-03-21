package com.dentedeouro.modelo;

import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 * Classe que modela a tabela do usuario
 * @author igor
 *
 */
public class UsuarioTableModelo extends DefaultTableModel {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	
	/**
	 * Adiciona as colunas na tabela
	 */
	public UsuarioTableModelo() {
		this.addColumn("NOME");
		this.addColumn("USUARIO");
		this.addColumn("SENHA");
	}
	
	
	/**
	 * Lista os usuarios cadastrados na tabela
	 * @param listaUsuarios
	 */

	public UsuarioTableModelo(List<Usuario> listaUsuarios) {
		this();
		for (Usuario usuario : listaUsuarios) {
			this.addRow(new String[] { usuario.getNome(), usuario.getUsuario(), usuario.getSenha() });
			
		}
	}
	

}
