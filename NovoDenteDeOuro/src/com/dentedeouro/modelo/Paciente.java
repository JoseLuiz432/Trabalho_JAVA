package com.dentedeouro.modelo;

/**
 * Classe abstrata que modela os pacientes
 * 
 * @author igor e jose luiz
 *
 */

abstract public class Paciente {

	private String nome;
	private String cpf;
	private String telefone;
	private String e_mail;
	private String tipo;

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 */

	/*
	 * nao pode existir um objeto desta classe sem um nome e cpf Validacao dos dados
	 * e feita no momento do cadastro
	 */

	public Paciente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 */

	/* Opcao de construtor com mais dados */
	public Paciente(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	/**
	 * Construtor
	 * 
	 * @param cpf
	 * @param nome
	 * @param telefone
	 * @param e_mail
	 */

	/* Opcao de construtor com mais dados */
	public Paciente(String cpf, String nome, String telefone, String e_mail) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.e_mail = e_mail;
	}

	/**
	 * Obter CPF do paciente
	 * 
	 * @return
	 */

	public String getCpf() {
		return this.cpf;
	}

	/**
	 * Obter nome do paciente
	 * 
	 * @return
	 */

	public String getNome() {
		return this.nome;
	}

	/**
	 * Obter telefone do paciente
	 * 
	 * @return
	 */

	public String getTelefone() {
		return this.telefone;
	}

	/**
	 * Obter email do paciente
	 * 
	 * @return
	 */

	public String getE_mail() {
		return this.e_mail;
	}

	/**
	 * Obter telefone do paciente
	 * 
	 * @param telefone
	 */

	/*
	 * Decidido que nao se pode modificar o cpf e o nome depois de criado, so com a
	 * destruicao do objeto, verificacao e feita tmb a parte, esta classe so realiza
	 * a incercao dos mesmos
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Seta o email dos paciente
	 * 
	 * @param e_mail
	 */

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	/**
	 * Confere se o objeto passado por parametro é igual ao da classe
	 */

	/* Sobrescrevendo o metodo equals */
	@Override
	public boolean equals(Object obj) {
		/* verificando se e um objeto nulo */
		if (obj == null) {
			return false;
		}
		/*
		 * Tentatica de transformar o objeto passado por parametro em um objeto desta
		 * classe
		 */
		if (!Paciente.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		/* Recebendo o objeto do paratro em objeto desta classe uso do auxiliar other */
		final Paciente other = (Paciente) obj;
		/* Comparando o atributo cpf do parametro com o do objeto em questao */
		if (other.getCpf() != this.cpf) {
			return false;
		}
		/* caso nenhum tenha retornado false ira retornar true */
		return true;
	}

	/* Passando o objeto do paciente em string */

	/**
	 * Gerando uma string com os dados do paciente
	 */
	public String toString() {
		return "Paciente [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", e_mail=" + e_mail + "]";
	}

	/**
	 * Metodo que as subclasses sao obrigadas a implementar
	 * 
	 * @param estado
	 * @return
	 */
	abstract public float valorConsulta(StatusConsulta estado);

	/**
	 * Obter tipo da consulta
	 * 
	 * @return
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Setar o tipo da consulta
	 * 
	 * @param tipo
	 */

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
