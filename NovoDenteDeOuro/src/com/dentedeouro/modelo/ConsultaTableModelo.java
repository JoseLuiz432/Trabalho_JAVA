package com.dentedeouro.modelo;

import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.dentedeouro.utils.ConversaoDate;

/**
 * Classe que modela a table das consultas
 * 
 * @author igor e josé luiz
 *
 */
public class ConsultaTableModelo extends DefaultTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ConversaoDate converter = new ConversaoDate();

	/**
	 * Adiciona as colunas na tabela
	 */
	public ConsultaTableModelo() {
		this.addColumn("CODIGO");
		this.addColumn("DATA");
		this.addColumn("PACIENTE");
		this.addColumn("DENTISTA");
		this.addColumn("HORARIO");
		this.addColumn("SALA");
		this.addColumn("ESTADO");
		this.addColumn("TIPO");

	}

	/**
	 * Mostra dados na tabela
	 * 
	 * @param filtro
	 * @param listConsulta
	 * @param tipo
	 * @param data
	 */
	public ConsultaTableModelo(String filtro, List<Consulta> listConsulta, String tipo, Date data) {
		this();

		for (int i = 0; i < listConsulta.size(); i++) {
			if (filtro.equals("all")) {

				StatusConsulta status = listConsulta.get(i).getEstado();
				String statusconsulta = status.name();

				if (converter.dateToStr(listConsulta.get(i).getDate()).equals(converter.dateToStr(data))) {
					this.addRow(new String[] { (String.valueOf(listConsulta.get(i).getCodigo())),
							converter.dateToStr(listConsulta.get(i).getDate()),
							listConsulta.get(i).getPaciente().getNome(), listConsulta.get(i).getDentista().getNome(),
							converter.horastoStro(listConsulta.get(i).getHorario()),
							String.valueOf(listConsulta.get(i).getSala().getNum()), statusconsulta,
							listConsulta.get(i).getTipo() });
				}
			} else {

				if (tipo != null) {
					StatusConsulta status = listConsulta.get(i).getEstado();
					String statusconsulta = status.name();
					if (converter.dateToStr(listConsulta.get(i).getDate()).equals(converter.dateToStr(data))
							&& listConsulta.get(i).getDentista().getNome().equals(filtro)
							&& (listConsulta.get(i).getTipo().equals(tipo))) {
						this.addRow(new String[] { (String.valueOf(listConsulta.get(i).getCodigo())),
								converter.dateToStr(listConsulta.get(i).getDate()),
								listConsulta.get(i).getPaciente().getNome(),
								listConsulta.get(i).getDentista().getNome(),
								converter.horastoStro(listConsulta.get(i).getHorario()),
								String.valueOf(listConsulta.get(i).getSala().getNum()), statusconsulta,
								listConsulta.get(i).getTipo() });
					}
				} else {

					if (tipo == null) {
						StatusConsulta status = listConsulta.get(i).getEstado();
						String statusconsulta = status.name();
						if (converter.dateToStr(listConsulta.get(i).getDate()).equals(converter.dateToStr(data))
								&& listConsulta.get(i).getDentista().getNome().equals(filtro)) {
							this.addRow(new String[] { (String.valueOf(listConsulta.get(i).getCodigo())),
									converter.dateToStr(listConsulta.get(i).getDate()),
									listConsulta.get(i).getPaciente().getNome(),
									listConsulta.get(i).getDentista().getNome(),
									converter.horastoStro(listConsulta.get(i).getHorario()),
									String.valueOf(listConsulta.get(i).getSala().getNum()), statusconsulta,
									listConsulta.get(i).getTipo() });
						}
					}
				}

			}

		}

	}
}
