package com.dentedeouro.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Essa classe possui os principais metodos que realiza a conversão entre data
 * 
 * @author igor
 *
 */

public class ConversaoDate {

	private SimpleDateFormat simpledateformat;

	public ConversaoDate() {

	}

	/**
	 * Converter String em Data
	 * 
	 * @param data
	 * @return
	 */

	public Date strToDate(String data) {
		simpledateformat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return (simpledateformat.parse(data));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return null;
			// e.printStackTrace();
		}
	}

	/**
	 * Converter Data em string
	 * 
	 * @param data
	 * @return
	 */

	public String dateToStr(Date data) {
		simpledateformat = new SimpleDateFormat("dd/MM/yyyy");
		return (simpledateformat.format(data));
	}

	/**
	 * Converter horas em string
	 * 
	 * @param data
	 * @return
	 */

	public String horastoStro(Date data) {
		simpledateformat = new SimpleDateFormat("HH:mm");

		return (simpledateformat.format(data));
	}

	/**
	 * Converter String em horas
	 * 
	 * @param horas
	 * @return
	 */
	public Date strToHoras(String horas) {
		simpledateformat = new SimpleDateFormat("HH:mm");

		try {
			return (simpledateformat.parse(horas));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			return null;
		}
	}

}
