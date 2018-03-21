package com.dentedeouro.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dentedeouro.io.GravarArquivoTxt;
import com.dentedeouro.modelo.Usuario;

/**
 * Realização das principais operações de gerenciamento dos usuarios que
 * utilizam o sistema
 * 
 * @author igor e josé luiz
 *
 */

public class UsuarioDAO {

	private static List<Usuario> usuarios = new ArrayList<>();

	/**
	 * Adiciona o usuario cadastrado em um ArrayList
	 * 
	 * @param user
	 * @return
	 */

	public boolean inserirUsuario(Usuario user) {
		usuarios.add(user);
		return true;
	}

	/**
	 * Remove o usuario passado por parametro do ArrayList
	 * 
	 * @param user
	 * @return
	 */
	public boolean removerUsuario(Usuario user) {
		usuarios.remove(user);
		return true;
	}

	/**
	 * Salva o usuario do sistema um arquivo TXT
	 * 
	 * @param user
	 * @return
	 * @throws IOException
	 */
	public boolean salvarUsuarioTxt(Usuario user) throws IOException {
		GravarArquivoTxt txt = new GravarArquivoTxt();
		txt.gravarTxt(user);
		return true;

	}

	/**
	 * Obter usuarios cadastrados
	 * 
	 * @return
	 */

	public List<Usuario> getArray() {
		return usuarios;
	}

}
