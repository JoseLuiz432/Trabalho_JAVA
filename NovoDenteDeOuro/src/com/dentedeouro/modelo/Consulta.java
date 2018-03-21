package com.dentedeouro.modelo;

import java.util.Date;

/**
 * Classe que modela as consultas
 * 
 * @author igor e jose luiz
 *
 */
public class Consulta {
	private Dentista dentista;
	private Date dtConsulta;
	private Paciente paciente;
	private Sala sala;
	private Date horario;
	private String tipo;
	private StatusConsulta statusconsulta;
	private int codigo;

	/**
	 * Construtor do modelo consulta
	 * 
	 * @param codigo
	 * @param dentista
	 * @param dtConsulta
	 * @param paciente
	 * @param horario
	 * @param status
	 * @param sala
	 * @param tipo
	 */

	public Consulta(int codigo, Dentista dentista, Date dtConsulta, Paciente paciente, Date horario,
			StatusConsulta status, Sala sala, String tipo) {
		this.dentista = dentista;
		this.dtConsulta = dtConsulta;
		this.paciente = paciente;
		this.sala = sala;
		this.horario = horario;
		this.codigo = codigo;
		this.statusconsulta = status;
		this.tipo = tipo;
	}

	/**
	 * Consultar o estado da consulta
	 * 
	 * @return statusdaconsulta
	 */

	public StatusConsulta getEstado() {
		return statusconsulta;
	}

	/**
	 * Setar o Estado da consulta
	 * 
	 * @param estado
	 */

	public void setEstado(StatusConsulta estado) {
		this.statusconsulta = estado;
	}

	/**
	 * Setar o codigo da consulta
	 * 
	 * @param codigo
	 */

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obter o codigo da consulta
	 * 
	 * @return
	 */

	public int getCodigo() {
		return codigo;
	}

	/**
	 * Setar o horario da consulta
	 * 
	 * @param horario
	 */

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	/**
	 * Obter a data da consulta
	 * 
	 * @return
	 */

	public Date getHorario() {
		return horario;
	}

	/**
	 * Consultar se determinado paciente compareceu na consulta
	 * 
	 * @return
	 */

	public StatusConsulta isConpareceu() {
		return statusconsulta;
	}

	/**
	 * Obter data da consulta
	 * 
	 * @return
	 */
	public Date getDate() {
		return dtConsulta;
	}

	/**
	 * Obter dentista vinculado a consulta
	 * 
	 * @return
	 */
	public Dentista getDentista() {
		return dentista;
	}

	/**
	 * Setar dentista para determinada consulta
	 * 
	 * @param dentista
	 */

	public void setDentista(Dentista dentista) {
		this.dentista = dentista;
	}

	/**
	 * Obter sala na qual a consulta esta marcada
	 * 
	 * @return
	 */

	public Sala getSala() {
		return sala;
	}

	/**
	 * Setar a sala na qual a consulta sera marcada
	 * 
	 * @param sala
	 */

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	/**
	 * Obter a data da consulta
	 * 
	 * @return
	 */

	public Date getDtConsulta() {
		return dtConsulta;
	}

	/**
	 * Setar a data da consulta
	 * 
	 * @param dtConsulta
	 */

	public void setDtConsulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	/**
	 * Obter paciente vinculado a determinada consulta
	 * 
	 * @return
	 */

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * Substuição do metodo equals
	 */

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
		if (!Consulta.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		/* Recebendo o objeto do paratro em objeto desta classe uso do auxiliar other */
		final Consulta other = (Consulta) obj;
		/* Comparando o atributo dentista do parametro com o do objeto em questao */
		if (other.dentista.equals(this.dentista) || other.paciente.equals(this.paciente)
				|| other.dtConsulta.equals(this.dtConsulta)) {
			return false;
		}
		/* caso nenhum tenha retornado false ira retornar true */
		return true;
	}

	/**
	 * Substuição do metodo ToString
	 */
	@Override
	public String toString() {
		return "Consulta [dentista=" + dentista + ", dtConsulta=" + dtConsulta + ", paciente=" + paciente + ", sala="
				+ sala + "]";
	}

	/**
	 * OBter o valor da consulta
	 * 
	 * @return
	 */

	public float valorConsulta() {
		return paciente.valorConsulta(getEstado());
	}

	/**
	 * Obter o tipo da consulta
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
