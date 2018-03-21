package com.dentedeouro.modelo;

/**
 * Classe que modela o objetto Dentista
 * 
 * @author igor e jose luiz
 *
 */
public class Dentista {

	private String nome;
	private String especialidade;
	private String cro;

	public Dentista() {
		//
	}

	public Dentista(String nome) {

	}

	public Dentista(String nome, String especialidade) {

	}

	public Dentista(String nome, String especialidade, String cro) {

	}

	/**
	 * Obter CRO do dentista
	 * 
	 * @return
	 */
	public String getCro() {
		return cro;
	}

	/**
	 * Setar CRO do dentista
	 * 
	 * @param cro
	 */

	public void setCro(String cro) {
		this.cro = cro;
	}

	/**
	 * Obter a especialidade do dentista
	 * 
	 * @return
	 */
	public String getEspecialidade() {
		return especialidade;
	}

	/**
	 * Setar a especialidade do dentista
	 * 
	 * @param especialidade
	 */

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * Obtem o nome do dentista
	 * 
	 * @return
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * Seta o nome do dentista
	 * 
	 * @param nome
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Confere se o objeto passado por parametro é igual a classe
	 * 
	 * @param object
	 */
	@Override
	public boolean equals(Object obj) {
		// Verificar se o objeto passado por parametro � null
		if (obj == null) {
			return false;
		}
		// Tentative de transformar o objeto passado por parametro em um objeto desta
		// classe
		if (!Dentista.class.isAssignableFrom(obj.getClass())) {
			return false;
		}

		// Constante (other) recebendo o objeto passado por parametro
		final Dentista other = (Dentista) obj;

		// Se o atributo de identifica��o � igual
		if ((this.cro != other.getCro())) {
			return false;
		}

		return true;

	}

	/**
	 * Mostra o nome, a especialidade e o CRO do dentista
	 */
	@Override
	public String toString() {
		return (nome + "" + especialidade + "" + cro);
	}

}
