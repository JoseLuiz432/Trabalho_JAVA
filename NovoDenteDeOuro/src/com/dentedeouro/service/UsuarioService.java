package com.dentedeouro.service;

import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.UsuarioDAO;
import com.dentedeouro.modelo.Usuario;

/**
 * Classe que manipula os usuarios do sistema
 * 
 * @author igor e jose luiz
 *
 */
public class UsuarioService {

	private UsuarioDAO usuariodao = new UsuarioDAO();

	/**
	 * Insere usuario no sistema
	 * 
	 * @param user
	 * @return
	 */
	public int inserirUsuario(Usuario user) {

		if (user.getNome() == null || user.getSenha() == null || user.getUsuario() == null) {
			return -1; // retorno de erro base
		} else {
			if (usuariodao.inserirUsuario(user)) {
				return 0;// sucesso
			}
			return 1;
		}

	}

	/**
	 * Salva arquivo com os usuario do sistema
	 * 
	 * @param user
	 * @return
	 */
	public int salvarUsuarioTxt(Usuario user) {

		if (user.getNome() == null || user.getSenha() == null || user.getUsuario() == null) {
			return -1; // retorno de erro base
		} else {
			try {
				if (usuariodao.salvarUsuarioTxt(user)) {
					return 0;// sucesso
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			return 1;
		}

	}

	/**
	 * Obter todos os usuarios cadastrado no sistema
	 * 
	 * @return
	 */
	public List<Usuario> getArray() {
		return usuariodao.getArray();
	}

}
