package com.dentedeouro.utils;

import java.util.Date;
import java.util.InputMismatchException;


/**
 * Classe responsavel por validar os principais campos do sistema
 * @author igor e jose luiz
 *
 */



public class Verificador {

	private static ConversaoDate conversor = new ConversaoDate();

	/**
	 * Retirar mascara de uma string
	 * @param n
	 * @return
	 */
	private String retiraMAS(String n) {
		String aux;
		aux = n.replaceAll("[[.]|[-]|(|)]", ""); // usando expressao regular para retirar as mascaras
		return aux;
	}
	
	/**
	 * Verifica se o CPF é válido
	 * @param cpf
	 * @return
	 */

	public boolean verificaCPF(String cpf) {
		// considera-se erro cpf's formados por uma sequencia de numeros iguais

		cpf = retiraMAS(cpf);

		if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
				|| cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
				|| cpf.equals("99999999999") || (cpf.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// converte o i-esimo caractere do cpf em um numero:
				// por exemplo, transforma o caractere '0' no inteiro 0
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig10 = '0';
			else
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico

			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}

			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11))
				dig11 = '0';
			else
				dig11 = (char) (r + 48);

			// Verifica se os digitos calculados conferem com os digitos informados.
			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	
	/**
	 * Verifica se o telefone esta correto
	 * @param tel
	 * @return
	 */
	public boolean verificaTEL(String tel) {
		return tel.matches("[(]?[0-9]{2}[)]?[0-9]{5}[-]?[0-9]{4}");
	}
	
	/**
	 * Verifica se o email esta correto
	 * @param email
	 * @return
	 */

	public boolean verificaEMA(String email) {
		return email.matches("([a-z]|[A-Z])+[.]?([a-z]|[A-Z])+[@]([a-z]|[A-Z])+[.]([a-z]|[A-Z])+");
	}
	
	/**
	 * Verifica se o CRO esta correto
	 * @param cro
	 * @return
	 */

	public boolean verificaCRO(String cro) {
		cro = this.retiraMAS(cro);
		return cro.matches("([a-z]|[A-Z]){2}( )*[1-9]*");
	}
	
	/**
	 * Verifica  o horario da consulta
	 * @param data
	 * @return
	 */
	/* verifica horario consulta */
	public boolean verificaHorario(Date data) {
		String dt1 = "09:00";
		String dt2 = "10:00";
		String dt3 = "11:00";
		if (dt1.equals(conversor.horastoStro(data)) || dt2.equals(conversor.horastoStro(data))
				|| dt3.equals(conversor.horastoStro(data))) {
			return true;
		}
		return false;
	}
}
