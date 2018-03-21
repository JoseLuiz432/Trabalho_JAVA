/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import javax.swing.JOptionPane;

import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.service.DentistaService;

/**
 * Interface de cadastro dos dentistas
 * 
 * @author igor e josé luiz
 */
public class InterfaceCadastroDentista extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DentistaService dentistaservice = new DentistaService();

	private String nome;
	private String cro;
	private String especialidade;

	/**
	 * Cria o formulario de cadastro dos dentistas
	 */
	public InterfaceCadastroDentista() {

		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * Cria o formulario de edição dos dentistas
	 * 
	 * @param nome
	 * @param cro
	 * @param especialidade
	 */
	public InterfaceCadastroDentista(String nome, String cro, String especialidade) {

		initComponents();
		setLocationRelativeTo(null);
		edt_nome.setText(nome);
		edt_especi.setText(especialidade);
		edt_cro.setText(cro);
	}

	/**
	 * Esse metodo instancia e inicializa todos os componentes presentes na
	 * interface
	 */
	private void initComponents() {

		pnl_titulopacientes = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_cadastro = new javax.swing.JLabel();
		pnl_conteudo = new javax.swing.JPanel();
		lbl_nome = new javax.swing.JLabel();
		btn_cadastrar = new javax.swing.JButton();
		edt_nome = new javax.swing.JTextField();
		edt_cro = new javax.swing.JTextField();
		lbl_especialidade = new javax.swing.JLabel();
		edt_especi = new javax.swing.JTextField();
		lbl_cro = new javax.swing.JLabel();

		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_titulopacientes.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulopacientes.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Cadastrar Dentista");
		pnl_titulopacientes.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 400, 40));

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_24px.png"))); // NOI18N
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
		pnl_conteudo.add(btn_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(200, 170, 150, 50));
		pnl_conteudo.add(edt_nome, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 40, 530, 30));
		pnl_conteudo.add(edt_cro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 110, 260, 30));

		lbl_especialidade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_especialidade.setText("Especialidade:");
		pnl_conteudo.add(lbl_especialidade, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 80, -1, -1));
		pnl_conteudo.add(edt_especi, new com.dentedeouro.bibliotecas.AbsoluteConstraints(290, 110, 260, 30));

		lbl_cro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_cro.setText("CRO:");
		pnl_conteudo.add(lbl_cro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(290, 80, -1, -1));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 570, 250));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Controla o evento de click do botao de cadastro 
	 */
	private void btn_cadastrarMouseClicked(final java.awt.event.MouseEvent evt) {

		nome = edt_nome.getText();
		cro = edt_especi.getText();
		especialidade = edt_cro.getText();

		Dentista dentista = new Dentista();
		dentista.setCro(cro);
		dentista.setEspecialidade(especialidade);
		dentista.setNome(nome);

		int resultado = dentistaservice.inserir(dentista);

		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "Dentista Cadastrado com Sucesso!");
			InterfaceCadastroDentista.this.dispose();
		}
		if (resultado == -1)
			JOptionPane.showMessageDialog(null, "Preencha todas as informações obrigatórias");
		if (resultado == -2)
			JOptionPane.showMessageDialog(null, "CRO incorreto");
		if (resultado == -5)
			JOptionPane.showMessageDialog(null, "Não é possível adicionar mais dentistas");

	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btn_cadastrar;
	private javax.swing.JTextField edt_especi;
	private javax.swing.JTextField edt_cro;
	private javax.swing.JTextField edt_nome;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel lbl_cro;
	private javax.swing.JLabel lbl_especialidade;
	private javax.swing.JLabel lbl_nome;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_titulopacientes;
	// End of variables declaration//GEN-END:variables
}
