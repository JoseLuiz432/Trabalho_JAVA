package com.dentedeouro.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.ConsultaDAO;
import com.dentedeouro.dao.SalaDAO;
import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.modelo.Sala;
import com.dentedeouro.utils.ConversaoDate;
import com.dentedeouro.utils.Verificador;

/**
 * 
 * @author igor e jose luiz
 *
 */

public class ConsultaService {
	SalaDAO sala = new SalaDAO();
	ConsultaDAO consulta = new ConsultaDAO();
	private List<Sala> salas;
	private List<Consulta> consultas;
	private static Verificador ver = new Verificador();

	/**
	 * Inseri e verifica se a é possivel fazer a vinculação de uma consulta a um
	 * dentista, verifica qual sala esta disponivel no horario e verifica o horario
	 * da consulta
	 * 
	 * @param consulta
	 * @return
	 */
	/*
	 * aqui estara a verificacao de insercao num max de consultas do dentista
	 * verificar se sala esta disponivel no horario verificar horario da consulta
	 */
	public int inserir(Consulta consulta) {
		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat df2 = new SimpleDateFormat("HH:mm");
		String data1 = df1.format(consulta.getDate());
		String data2;
		consultas = this.array();
		for (Consulta c : consultas) {
			if (c.getDentista().equals(consulta.getDentista())) {
				data2 = df1.format(c.getDate());
				if ((data1.compareTo(data2) == 0)
						&& (df2.format(c.getHorario()).equals(df2.format(consulta.getHorario())))) {

					return -5;
				}
			}
			if (c.getPaciente().equals(consulta.getPaciente())) {
				data2 = df1.format(c.getDate());
				if ((data1.compareTo(data2) == 0)
						&& (df2.format(c.getHorario()).equals(df2.format(consulta.getHorario())))) {
					JOptionPane.showMessageDialog(null, "Paciente ja tem consulta no Horatio");// Dentista ocupado no
																								// horario
					return -6;
				}
			}
		}
		/* verificacao em cada sala e assim que achar a sala e insrida na mesma */
		if (this.numConsultasnoDia(consulta.getDentista(), consulta.getDate()) >= 3) {
			return -1; // num max de consultas do dentista
		}
		if (!ver.verificaHorario(consulta.getHorario())) {
			return -4;// horario invalido
		}

		if (this.disponibilidadeSala(consulta)) {
			if (this.consulta.inserirConsulta(consulta)) {
				return 0; // insercao concluida
			} else
				return -2; // insercao de consulta invalido
		} else
			return -3; // nenhuma sala disponivel no horario

	}

	/**
	 * Verifica a disponibidade da sala
	 */
	/* Verificacao de disponibilidade da sala */
	private boolean disponibilidadeSala(Consulta consulta) {
		salas = sala.arraySala();
		boolean flag = false;

		SimpleDateFormat df1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat df2 = new SimpleDateFormat("HH:mm");
		for (Sala s : salas) {
			consultas = s.getConsulta();
			for (Consulta c : consultas) {
				String data1 = df1.format(c.getDtConsulta());
				String data2 = df1.format(consulta.getDtConsulta());
				if ((data1.compareTo(data2) == 0)
						&& (df2.format(c.getHorario()).equals(df2.format(consulta.getHorario())))) {
					flag = true;// sala com o mesmo horario e data da consulta
				}
			}
			if (!flag) {// sala encontrada inserindo consulta na sala
				if (this.sala.inserirConsultanaSala(consulta, s.getNum())) {
					consulta.setSala(s);
					return true;
				}
			} else
				flag = false; // flag volta a ser zero para a verificacao na prox sala
		}
		return false;
	}

	/**
	 * Obter o codigo da consulta
	 * 
	 * @return
	 */
	public int getCodigo() {
		return this.consulta.getCodigo();
	}

	/**
	 * Remova a consulta
	 */
	public boolean remove(int posicao) {
		return this.consulta.removerConsulta(posicao);
	}

	/**
	 * Deletar todas as consultas
	 * 
	 * @return
	 */

	public boolean zerar() {
		return this.consulta.zerarConsultas();
	}

	/**
	 * Obter a quantidade de consultas cadastradas
	 * 
	 * @return
	 */

	public int qtdConsultas() {
		return consulta.qtdConsultas();
	}

	/**
	 * Obter a quantidade de consultas vinculadas a um determiando dentista
	 * 
	 * @param dentista
	 * @return
	 */

	public int numConsultasTotal(Dentista dentista) {
		if (dentista == null)
			return -1; // erro dentista invalido
		return consulta.numConsultasTotal(dentista);
	}

	/**
	 * Lista as consultas que um determinado dentista possui em um determinado dia
	 * 
	 * @param dentista
	 * @param data
	 * @return
	 */

	public int numConsultasnoDia(Dentista dentista, Date data) {
		if (dentista == null)
			return -1; // erro dentista invalido
		return consulta.numConsultasnoDia(dentista, data);
	}

	/**
	 * Lista as consultas de um determinado paciente em uma determinada data
	 * 
	 * @param pessoa
	 * @param data
	 * @return
	 */

	public String listar(Object pessoa, String data) {
		Date dat;
		ConversaoDate cv = new ConversaoDate();

		if ((dat = cv.strToDate(data)) == null)
			return null;
		if (pessoa == null)
			return null;

		if (pessoa instanceof Paciente) {
			return consulta.listarConsultasPaciente((Paciente) pessoa, dat);
		}
		if (pessoa instanceof Dentista) {
			return consulta.listarConsultasDentista((Dentista) pessoa, dat);
		}
		return null;
	}

	public List<Consulta> array() {
		// TODO Auto-generated method stub
		return consulta.arrayConsulta();
	}

}
