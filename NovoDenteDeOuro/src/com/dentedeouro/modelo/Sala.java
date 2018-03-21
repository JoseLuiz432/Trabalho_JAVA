package com.dentedeouro.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que modela as salas do consultorio
 * 
 * @author igor e jose luiz
 *
 */

public class Sala {

	private int num; // numero da sala

	private transient List<Consulta> consultas = new ArrayList<>();

	/**
	 * Construtor
	 * 
	 * @param num
	 */

	public Sala(int num) {
		this.num = num;
	}

	/**
	 * Obter numero da sala
	 * 
	 * @return
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Setar o numero da sala
	 * 
	 * @param num
	 */

	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * Obter todas as consultas cadastradas
	 * 
	 * @return
	 */

	public List<Consulta> getConsulta() {
		return consultas;
	}

	/**
	 * Setar as consultas a serem realizadas em uma determinada sala
	 * 
	 * @param consulta
	 * @return
	 */

	public boolean setConsulta(Consulta consulta) {
		return consultas.add(consulta);
	}

	/**
	 * Sobrescreve o metodo equals que serve para conferir se o objeto passado por
	 * parametro é igual ao que modela a classe em questão
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
		if (!Sala.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		/* Recebendo o objeto do paratro em objeto desta classe uso do auxiliar other */
		final Sala other = (Sala) obj;
		/* Comparando o atributo num do parametro com o do objeto em questao */
		if (other.getNum() != this.getNum()) {
			return false;
		}
		/* caso nenhum tenha retornado false ira retornar true */
		return true;
	}

}
