/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import com.dentedeouro.dao.DentistaDAO;
import com.dentedeouro.dao.PacienteDAO;

/**
 * Interface do painel
 * @author igor e josé luiz
 */
public class InterfacePainel extends javax.swing.JInternalFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Cria a interface do painel
	 */
	public InterfacePainel() {
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		initComponents();
	}

	/**
	 * Inicializa os compoentes presentes nessa interface
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		pnl_conteudo = new javax.swing.JPanel();
		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_janela = new javax.swing.JLabel();
		pnl_dados = new javax.swing.JPanel();
		pnl_qtddentistacadastrado = new javax.swing.JPanel();
		img_dentistas = new javax.swing.JLabel();
		edt_dentistas = new javax.swing.JLabel();
		qtd_dentistas = new javax.swing.JLabel();
		pnl_qtddeconsultas = new javax.swing.JPanel();
		edt_consultas = new javax.swing.JLabel();
		pnl_qtdpacientecadastrado = new javax.swing.JPanel();
		img_pacientes = new javax.swing.JLabel();
		edt_pacientes = new javax.swing.JLabel();
		qtd_pacientes = new javax.swing.JLabel();
		pnl_menu = new javax.swing.JPanel();

		img_cadastro = new javax.swing.JLabel();

		pnl_atualizar = new javax.swing.JPanel();
		lbl_atualizar = new javax.swing.JLabel();

		setBorder(null);
		setRequestFocusEnabled(false);
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setMaximumSize(new java.awt.Dimension(930, 610));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Painel");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 210, 40));

		img_janela.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Home_24px.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));

		pnl_qtddentistacadastrado.setBackground(new java.awt.Color(255, 255, 255));
		pnl_qtddentistacadastrado.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_dentistas.setBackground(new java.awt.Color(13, 71, 161));
		img_dentistas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		img_dentistas.setForeground(new java.awt.Color(13, 71, 161));
		img_dentistas.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_100px.png"))); // NOI18N
		pnl_qtddentistacadastrado.add(img_dentistas,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 50, 90, 80));

		edt_dentistas.setBackground(new java.awt.Color(13, 71, 161));
		edt_dentistas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		edt_dentistas.setForeground(new java.awt.Color(13, 71, 161));
		edt_dentistas.setText("Dentistas Cadastrados:");
		pnl_qtddentistacadastrado.add(edt_dentistas, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, -1, -1));

		qtd_dentistas.setBackground(new java.awt.Color(13, 71, 161));
		qtd_dentistas.setFont(new java.awt.Font("Segoe UI", 0, 90)); // NOI18N
		qtd_dentistas.setForeground(new java.awt.Color(13, 71, 161));
		qtd_dentistas.setText("0");
		pnl_qtddentistacadastrado.add(qtd_dentistas,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(120, 40, 90, 80));

		pnl_qtddeconsultas.setBackground(new java.awt.Color(255, 255, 255));
		pnl_qtddeconsultas.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		edt_consultas.setBackground(new java.awt.Color(13, 71, 161));
		edt_consultas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		edt_consultas.setForeground(new java.awt.Color(13, 71, 161));
		edt_consultas.setText("Consultas (HOJE):");
		pnl_qtddeconsultas.add(edt_consultas, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, -1, -1));

		pnl_qtdpacientecadastrado.setBackground(new java.awt.Color(255, 255, 255));
		pnl_qtdpacientecadastrado.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_pacientes.setBackground(new java.awt.Color(13, 71, 161));
		img_pacientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		img_pacientes.setForeground(new java.awt.Color(13, 71, 161));
		img_pacientes.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/com/dentedeouro/interfaces/imagens/userazul.png"))); // NOI18N
		pnl_qtdpacientecadastrado.add(img_pacientes,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 50, 90, 80));

		edt_pacientes.setBackground(new java.awt.Color(13, 71, 161));
		edt_pacientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		edt_pacientes.setForeground(new java.awt.Color(13, 71, 161));
		edt_pacientes.setText("Pacientes Cadastrados: ");
		pnl_qtdpacientecadastrado.add(edt_pacientes, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, -1, -1));

		qtd_pacientes.setBackground(new java.awt.Color(13, 71, 161));
		qtd_pacientes.setFont(new java.awt.Font("Segoe UI", 0, 90)); // NOI18N
		qtd_pacientes.setForeground(new java.awt.Color(13, 71, 161));
		qtd_pacientes.setText("0");
		pnl_qtdpacientecadastrado.add(qtd_pacientes,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(120, 40, 90, 80));

		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));
		pnl_menu.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Plus_24px_1.png"))); // NOI18N

		pnl_atualizar.setBackground(new java.awt.Color(21, 101, 192));

		lbl_atualizar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/refresh-arrow.png"))); // NOI18N
		lbl_atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lbl_atualizarMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout pnl_atualizarLayout = new javax.swing.GroupLayout(pnl_atualizar);
		pnl_atualizar.setLayout(pnl_atualizarLayout);
		pnl_atualizarLayout
				.setHorizontalGroup(pnl_atualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbl_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));
		pnl_atualizarLayout
				.setVerticalGroup(pnl_atualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lbl_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));

		pnl_menu.add(pnl_atualizar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(920, 0, 30, 30));

		javax.swing.GroupLayout pnl_dadosLayout = new javax.swing.GroupLayout(pnl_dados);
		pnl_dados.setLayout(pnl_dadosLayout);
		pnl_dadosLayout
				.setHorizontalGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(pnl_dadosLayout.createSequentialGroup().addGap(29, 29, 29)
								.addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(pnl_qtdpacientecadastrado, javax.swing.GroupLayout.PREFERRED_SIZE,
												210, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(pnl_qtddentistacadastrado, javax.swing.GroupLayout.PREFERRED_SIZE,
												210, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(30, 30, 30)
								.addComponent(pnl_qtddeconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 640,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(pnl_dadosLayout.createSequentialGroup()
								.addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(0, 0, Short.MAX_VALUE)));
		pnl_dadosLayout.setVerticalGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnl_dadosLayout.createSequentialGroup()
						.addComponent(pnl_menu, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(46, 46, 46)
						.addGroup(pnl_dadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(pnl_dadosLayout.createSequentialGroup()
										.addComponent(pnl_qtdpacientecadastrado, javax.swing.GroupLayout.PREFERRED_SIZE,
												140, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(60, 60, 60).addComponent(pnl_qtddentistacadastrado,
												javax.swing.GroupLayout.PREFERRED_SIZE, 140,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addComponent(pnl_qtddeconsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 340,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(124, Short.MAX_VALUE)));

		pnl_conteudo.add(pnl_dados, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 540));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 950, 620));

		pack();
	}// </editor-fold>

	/**
	 * Atualiza a quantidade de clientes e dentistas cadastrados
	 * @param evt
	 */
	private void lbl_atualizarMouseClicked(java.awt.event.MouseEvent evt) {

		PacienteDAO pacientedao = new PacienteDAO();
		DentistaDAO dentistadao = new DentistaDAO();

		qtd_pacientes.setText(String.valueOf(pacientedao.qtdPacientes()));
		qtd_dentistas.setText(String.valueOf(dentistadao.qtdDentista()));
	}

	// Variables declaration - do not modify
	private javax.swing.JLabel edt_consultas;
	private javax.swing.JLabel edt_dentistas;
	private javax.swing.JLabel edt_pacientes;

	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_dentistas;
	private javax.swing.JLabel img_janela;
	private javax.swing.JLabel img_pacientes;

	private javax.swing.JLabel lbl_atualizar;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_atualizar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_dados;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_qtddeconsultas;
	private javax.swing.JPanel pnl_qtddentistacadastrado;
	private javax.swing.JPanel pnl_qtdpacientecadastrado;
	private javax.swing.JPanel pnl_titulo;
	private javax.swing.JLabel qtd_dentistas;
	private javax.swing.JLabel qtd_pacientes;
	// End of variables declaration
}
