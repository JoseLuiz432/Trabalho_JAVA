package com.dentedeouro.service;

import java.util.List;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.DentistaDAO;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.utils.Verificador;

/**
 * Classe que controla as manipulações dos dentistas
 * 
 * @author igor
 *
 */
public class DentistaService {
	DentistaDAO dentista = new DentistaDAO();
	Verificador verificador = new Verificador();

	/**
	 * Cadastrar Dentista no sistema
	 * 
	 * @param p
	 * @return
	 */
	public int inserir(Dentista p) {

		if (p.getNome() == null || p.getCro() == null) {
			return -1; // retorno de erro base
		} else {
			/* Demais verificacoes para a possivel insercao */
			if (!verificador.verificaCRO(p.getCro())) {
				JOptionPane.showMessageDialog(null, "Formato da CRO exemplo: MG 99999");
				return -2;// erro no cro
			}
			/* Telefone e e-mail nao sao essencial para o cadastro */

			if (dentista.inserirDentista(p)) {
				return 0;// sucesso
			}
			return -5;// Erro numero de pacientes excedido
		}
	}

	/**
	 * Obter a quantidade de dentista cadastrado
	 * 
	 * @return
	 */
	public int qtdDentista() {
		return dentista.qtdDentista();
	}

	/**
	 * Remove o dentista presente na posicao passada por parametro
	 * 
	 * @param posicao
	 * @return
	 */
	public boolean remover(int posicao) {
		return dentista.removerDentista(posicao);
	}

	/**
	 * Procura se exite determinado dentista cadastrado
	 * 
	 * @param nome
	 * @return
	 */
	public Dentista procurarDentista(String nome) {

		return (dentista.procurarDentista(nome));

	}

	/**
	 * Obter array com todos os dentistas cadastrado
	 * 
	 * @return
	 */

	public List<Dentista> array() {
		return dentista.arrayDentista();
	}

}
