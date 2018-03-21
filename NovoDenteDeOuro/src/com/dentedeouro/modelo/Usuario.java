package com.dentedeouro.modelo;

/**
 * Classe que modela os usuarios que utiliza o sistema
 * 
 * @author igor e jose luiz
 *
 */

public class Usuario {

	private String nome;
	private String senha;
	private String usuario;

	/**
	 * Obter nome do usuario
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Setar o nome do usuario
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Obter senha do usuario
	 * 
	 * @return
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Setar senha do usuario
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Obter login do usuario
	 * 
	 * @return
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * Setar login do usuario
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
