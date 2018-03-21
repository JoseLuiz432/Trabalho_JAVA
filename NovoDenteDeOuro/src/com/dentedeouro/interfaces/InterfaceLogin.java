package com.dentedeouro.interfaces;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.dentedeouro.modelo.Usuario;
import com.dentedeouro.service.UsuarioService;

/**
 * Interface de login do sistema
 */
public class InterfaceLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Cria a interface de login
	 */
	public InterfaceLogin() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * Inicializa e mostra os componentes da tela de interface
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		pnl_conteudo = new javax.swing.JPanel();
		lbl_nome = new javax.swing.JLabel();
		btn_cadastrar = new javax.swing.JButton();
		edt_usuario = new javax.swing.JTextField();
		edt_senha = new javax.swing.JPasswordField();
		lbl_especialidade = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Dente de Ouro");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(80, 0, 380, 80));

		getContentPane().add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 480, 80));

		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_nome.setText("Usuario:");
		pnl_conteudo.add(lbl_nome, new com.dentedeouro.bibliotecas.AbsoluteConstraints(18, 10, 120, -1));

		btn_cadastrar.setText("ENTRAR");
		btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_cadastrarActionPerformed(evt);
			}
		});
		pnl_conteudo.add(btn_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(160, 170, 150, 50));
		pnl_conteudo.add(edt_usuario, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 40, 430, 30));
		pnl_conteudo.add(edt_senha, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 110, 430, 30));

		lbl_especialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_especialidade.setText("Senha:");
		pnl_conteudo.add(lbl_especialidade, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 80, -1, -1));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 480, 240));

		pack();
	}// </editor-fold>

	/**
	 * Controla o evento de clique do botao de login
	 * @param evt
	 */
	private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {

		UsuarioService service = new UsuarioService();
		List<Usuario> lista = new ArrayList<>();

		lista = service.getArray();

		String senha = edt_senha.getText();
		String usuario = edt_usuario.getText();

		for (Usuario c : lista) {

			if (usuario.equals(c.getUsuario())) {
				if (senha.equals(c.getSenha())) {

					java.awt.EventQueue.invokeLater(new Runnable() {
						public void run() {
							new InterfacePrincipal().setVisible(true);
							InterfaceLogin.this.dispose();
						}
					});

				}
			} else
				JOptionPane.showMessageDialog(null, "Usuário não cadastrado");

		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(InterfaceLogin.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new InterfaceLogin().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btn_cadastrar;
	private javax.swing.JTextField edt_senha;
	private javax.swing.JTextField edt_usuario;
	private javax.swing.JLabel lbl_especialidade;
	private javax.swing.JLabel lbl_nome;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_titulo;
	// End of variables declaration
}
