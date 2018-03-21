package com.dentedeouro.visao;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.SalaDAO;
import com.dentedeouro.interfaces.InterfaceCadastroUsuarios;
import com.dentedeouro.interfaces.InterfaceLogin;

import com.dentedeouro.io.LerArquivoTxt;

/**
 * Contem o metodo principal da aplicação
 * 
 * @author igor e josé luiz
 *
 */

public class Principal {

	/**
	 * Gera as salas do consultorio, carregar os usuarios cadastrados e mostrar a
	 * tela de login e posteriormente a tela principal.
	 * 
	 * @param args
	 */
	public static LerArquivoTxt lerusuarios;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaDAO salas = new SalaDAO();
		salas.inserirSala(1);
		salas.inserirSala(2);
		salas.inserirSala(3);
		salas.inserirSala(4);
		salas.inserirSala(5);

		lerusuarios = new LerArquivoTxt("usuarios.txt");
		try {
			lerusuarios.lerArquivoUsuario();

			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new InterfaceLogin().setVisible(true);
				}
			});

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,
					"Não existe usuários cadastrados neste sistema, é necessário fazer o cadastro");
			InterfaceCadastroUsuarios cadastro = new InterfaceCadastroUsuarios();
			cadastro.setVisible(true);
			
			new InterfaceLogin().setVisible(true);
			
		}

	}

}
