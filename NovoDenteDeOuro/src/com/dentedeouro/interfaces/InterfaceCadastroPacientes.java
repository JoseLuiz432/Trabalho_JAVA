/*


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import javax.swing.JOptionPane;

import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.modelo.Paciente_Particular;
import com.dentedeouro.modelo.Paciente_Plano;
import com.dentedeouro.modelo.Paciente_VIP;
import com.dentedeouro.service.PacienteService;

/**
 * Interface de cadastro dos pacientes
 * @author igor e josé luiz
 */
public class InterfaceCadastroPacientes extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String cpf;
	private String celular;
	private String email;

	/**
	 * Cria o formulario de cadastro dos pacientes
	 */
	public InterfaceCadastroPacientes() {

		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * Cria o formulario de edição dos pacientes
	 * @param nome
	 * @param cpf
	 * @param celular
	 * @param email
	 */
	public InterfaceCadastroPacientes(String nome, String cpf, String celular, String email) {

		initComponents();
		setLocationRelativeTo(null);
		edt_nome.setText(nome);
		edt_cpf.setText(cpf);
		edt_email.setText(email);
		edt_celular.setText(celular);
	}

	/**
	 * Inicializa e instancia os componentes presentes na interface
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		pnl_titulopacientes = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_cadastro = new javax.swing.JLabel();
		pnl_conteudo = new javax.swing.JPanel();
		lbl_nome = new javax.swing.JLabel();
		btn_cadastrar = new javax.swing.JButton();
		edt_nome = new javax.swing.JTextField();
		edt_cpf = new javax.swing.JTextField();
		lbl_cpf = new javax.swing.JLabel();
		edt_celular = new javax.swing.JTextField();
		lbl_celular = new javax.swing.JLabel();
		lbl_plano = new javax.swing.JLabel();
		edt_email = new javax.swing.JTextField();
		lbl_email = new javax.swing.JLabel();
		cb_planos = new javax.swing.JComboBox<>();

		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_titulopacientes.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulopacientes.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Cadastrar Paciente");
		pnl_titulopacientes.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 400, 40));

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_User_24px_1.png"))); // NOI18N
		pnl_titulopacientes.add(img_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		getContentPane().add(pnl_titulopacientes, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 570, 80));

		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_nome.setText("Nome: ");
		pnl_conteudo.add(lbl_nome, new com.dentedeouro.bibliotecas.AbsoluteConstraints(18, 10, 120, -1));

		btn_cadastrar.setText("CADASTRAR");

		btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_cadastrarMouseClicked(evt);
			}
		});

		pnl_conteudo.add(btn_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(200, 240, 150, 50));
		pnl_conteudo.add(edt_nome, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 40, 530, 30));
		pnl_conteudo.add(edt_cpf, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 180, 260, 30));

		lbl_cpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_cpf.setText("CPF:");
		pnl_conteudo.add(lbl_cpf, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 150, -1, -1));
		pnl_conteudo.add(edt_celular, new com.dentedeouro.bibliotecas.AbsoluteConstraints(290, 180, 260, 30));

		lbl_celular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_celular.setText("Celular:");
		pnl_conteudo.add(lbl_celular, new com.dentedeouro.bibliotecas.AbsoluteConstraints(290, 150, -1, -1));
		pnl_conteudo.add(edt_email, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 110, 260, 30));

		lbl_email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_email.setText("E-mail:");
		pnl_conteudo.add(lbl_email, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 80, 120, -1));

		lbl_plano.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_plano.setText("Tipo:");
		pnl_conteudo.add(lbl_plano, new com.dentedeouro.bibliotecas.AbsoluteConstraints(290, 80, 120, -1));

		cb_planos.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Nenhum Selecionado", "Particular", "VIP", "Plano de Saúde" }));
		pnl_conteudo.add(cb_planos, new com.dentedeouro.bibliotecas.AbsoluteConstraints(290, 112, 260, 30));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 570, 320));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Cadastra os dados preenchidos na estrutura de dados presentes na classe DAO
	 * @param evt
	 */

	private void btn_cadastrarMouseClicked(final java.awt.event.MouseEvent evt) {

		nome = edt_nome.getText();
		cpf = edt_cpf.getText();
		celular = edt_celular.getText();
		email = edt_email.getText();
		/*
		 * Igor aqui voce vai ter que configurar qual o Paciente que vai ser cadastrado
		 * vou deixar o erro aqui para voce ver a menssagem
		 */

		Paciente paciente = null;

		if (cb_planos.getSelectedIndex() == 1) {
			String conta = JOptionPane.showInputDialog(null, "Digite a Conta Bancária: ");
			paciente = new Paciente_Particular(cpf, nome, conta);
			paciente.setTelefone(celular);
			paciente.setE_mail(email);
			paciente.setTipo("Particular");

		} else if (cb_planos.getSelectedIndex() == 2) {
			String numero = JOptionPane.showInputDialog(null, "Digite o numero VIP: ");
			paciente = new Paciente_VIP(cpf, nome, celular, email, numero);
			paciente.setTipo("Vip");

		} else if (cb_planos.getSelectedIndex() == 3) {
			paciente = new Paciente_Plano(cpf, nome, celular, email);
			paciente.setTipo("Plano de Saúde");
		}

		if (paciente != null) {
			PacienteService pecienteservice = new PacienteService();

			int resultado = pecienteservice.inserir(paciente);

			if (resultado == 0) {
				JOptionPane.showMessageDialog(null, "Paciente Cadastrado com Sucesso!");
				InterfaceCadastroPacientes.this.dispose();
			}
			if (resultado == -1)
				JOptionPane.showMessageDialog(null, "Preencha todas as informações obrigatórias");
			if (resultado == -2)
				JOptionPane.showMessageDialog(null, "CPF incorreto");
			if (resultado == -3)
				JOptionPane.showMessageDialog(null, "Telefone incorreto");
			if (resultado == -4)
				JOptionPane.showMessageDialog(null, "E-mail incorreto");
			if (resultado == -5)
				JOptionPane.showMessageDialog(null, "Não é possível adicionar mais pacientes");
		}
	}

	
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
			java.util.logging.Logger.getLogger(InterfaceCadastroPacientes.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(InterfaceCadastroPacientes.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(InterfaceCadastroPacientes.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(InterfaceCadastroPacientes.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new InterfaceCadastroPacientes().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btn_cadastrar;
	private javax.swing.JTextField edt_celular;
	private javax.swing.JTextField edt_cpf;
	private javax.swing.JTextField edt_email;
	private javax.swing.JTextField edt_nome;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JComboBox<String> cb_planos;
	private javax.swing.JLabel lbl_celular;
	private javax.swing.JLabel lbl_cpf;
	private javax.swing.JLabel lbl_email;
	private javax.swing.JLabel lbl_nome;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_titulopacientes;
	private javax.swing.JLabel lbl_plano;
	// End of variables declaration//GEN-END:variables
}
