/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Interface da Agenda do consultório	
 * @author igor e josé luiz
 */
public class InterfaceAgenda extends javax.swing.JInternalFrame {


	private static final long serialVersionUID = 1L;

/**
 * Construtor para a inicialização dos componentes presentes nesta interface
 */
	public InterfaceAgenda() {
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		initComponents();
	}
/**
 * Inicializa todos os componentes da interface
 */

	private void initComponents() {

		pnl_conteudo = new javax.swing.JPanel();
		pnl_menu = new javax.swing.JPanel();
		pnl_cadastrar = new javax.swing.JPanel();
		img_cadastro = new javax.swing.JLabel();
		lbl_cadastrar = new javax.swing.JLabel();
		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_janela = new javax.swing.JLabel();
		calendario = new com.toedter.calendar.JCalendar();

		setBorder(null);
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setMaximumSize(new java.awt.Dimension(930, 610));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));

		pnl_cadastrar.setBackground(new java.awt.Color(21, 101, 192));
		pnl_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_cadastrarMouseClicked(evt);
			}
		});
		pnl_cadastrar.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Plus_24px_1.png"))); // NOI18N
		pnl_cadastrar.add(img_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 30, 30));

		lbl_cadastrar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
		lbl_cadastrar.setForeground(new java.awt.Color(255, 255, 255));
		lbl_cadastrar.setText("Cadastrar");
		pnl_cadastrar.add(lbl_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(30, 0, 110, 30));

		javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
		pnl_menu.setLayout(pnl_menuLayout);
		pnl_menuLayout.setHorizontalGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnl_menuLayout.createSequentialGroup().addComponent(pnl_cadastrar,
						javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(790, 790, 790)));
		pnl_menuLayout.setVerticalGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnl_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

		pnl_conteudo.add(pnl_menu, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 30));

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Agenda");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 10, 210, 60));

		img_janela.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Calendar_24px.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));

		calendario.getDayChooser().addPropertyChangeListener("day", new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				pegarDataCalendario();

			}
		});
		pnl_conteudo.add(calendario, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 110, 950, 510));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 950, 620));

		pack();
	}// </editor-fold>//GEN-END:initComponents
/**
 * Abre a interface de cadastro de novas consultas
 * @param evt
 */
	private void pnl_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pnl_cadastrarMouseClicked
		InterfaceCadastroConsulta consulta = new InterfaceCadastroConsulta();

		consulta.setVisible(true);
		// TODO add your handling code here:
	}// GEN-LAST:event_pnl_cadastrarMouseClicked

	
	/**
	 * Lista as consultas de um determinado dia na interface Mostrar Consultas
	 */
	public void pegarDataCalendario() {
		// ConversaoDate converterdata = new ConversaoDate();

		InterfaceMostrarConsultas mostrarconsultas = new InterfaceMostrarConsultas(calendario.getDate());

		mostrarconsultas.setVisible(true);

		// System.out.println(converterdata.dateToStr(calendario.getDate()));

	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private com.toedter.calendar.JCalendar calendario;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_janela;
	private javax.swing.JLabel lbl_cadastrar;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_cadastrar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_titulo;
	// End of variables declaration//GEN-END:variables

}
