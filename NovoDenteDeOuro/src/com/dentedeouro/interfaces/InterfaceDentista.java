/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.service.DentistaService;
import com.dentedeouro.modelo.DentistaTableModelo;

/**
 * Interface responsavel por mostras os dentistas cadastrados
 * 
 * @author igor e jose luiz
 */
public class InterfaceDentista extends javax.swing.JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Cria a interface dos Dentistas
	 */

	public InterfaceDentista() {
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); // Retirar barra de titulo

		initComponents();

	}

	/**
	 * Seta os dados e o modelo da Table presente na interface
	 */

	private void dadosTable() {
		dentistas = servicodentista.array(); // add o array dos dentistas
		DentistaTableModelo modelo = new DentistaTableModelo(dentistas);

		tbl_dados.setModel(modelo);

	}

	/**
	 * Instancia todos componentes da interface
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		pnl_conteudo = new javax.swing.JPanel();
		pnl_menu = new javax.swing.JPanel();
		pnl_cadastrar = new javax.swing.JPanel();
		img_cadastro = new javax.swing.JLabel();
		lbl_cadastrar = new javax.swing.JLabel();
		pnl_alterar = new javax.swing.JPanel();
		img_alterar = new javax.swing.JLabel();
		lbl_alterar = new javax.swing.JLabel();
		pnl_apagar = new javax.swing.JPanel();
		img_apagar = new javax.swing.JLabel();
		lbl_apagar = new javax.swing.JLabel();
		pnl_atualizar = new javax.swing.JPanel();
		lbl_atualizar = new javax.swing.JLabel();
		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_janela = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tbl_dados = new javax.swing.JTable();

		setBorder(null);
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setMaximumSize(new java.awt.Dimension(930, 610));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));
		pnl_menu.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

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

		pnl_menu.add(pnl_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 160, -1));

		pnl_alterar.setBackground(new java.awt.Color(21, 101, 192));
		pnl_alterar.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_alterar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Edit_24px_1.png"))); // NOI18N
		pnl_alterar.add(img_alterar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 30, 30));

		lbl_alterar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
		lbl_alterar.setForeground(new java.awt.Color(255, 255, 255));
		lbl_alterar.setText("Alterar");
		pnl_alterar.add(lbl_alterar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(30, 0, 110, 30));

		pnl_alterar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_alterarMouseClicked(evt);
			}
		});

		pnl_menu.add(pnl_alterar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(167, 0, 160, -1));

		pnl_apagar.setBackground(new java.awt.Color(21, 101, 192));
		pnl_apagar.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		pnl_apagar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_apagarMouseClicked(evt);
			}
		});

		img_apagar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Trash_Can_24px.png"))); // NOI18N
		pnl_apagar.add(img_apagar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 30, 30));

		lbl_apagar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
		lbl_apagar.setForeground(new java.awt.Color(255, 255, 255));
		lbl_apagar.setText("Apagar");
		pnl_apagar.add(lbl_apagar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(30, 0, 110, 30));

		pnl_menu.add(pnl_apagar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(334, 0, 160, -1));

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

		pnl_conteudo.add(pnl_menu, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 30));

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Dentistas");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 300, 40));

		img_janela.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_24px.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));

		dadosTable();
		jScrollPane1.setViewportView(tbl_dados);

		pnl_conteudo.add(jScrollPane1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 110, 950, 510));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 950, 620));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	/**
	 * Metodo chamado no evento de click do botao de cadastro
	 * 
	 * @param evt
	 */
	private void pnl_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pnl_cadastrarMouseClicked
		InterfaceCadastroDentista cadastrar = new InterfaceCadastroDentista();

		cadastrar.setVisible(true);
	}

	/**
	 * Metodo chamado no evento de editar os dados do dentista
	 * 
	 * @param evt
	 */

	private void pnl_alterarMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pnl_cadastrarMouseClicked

		if (tbl_dados.getSelectedRow() != -1) {

			int linha = tbl_dados.getSelectedRow();
			String nome = (String) tbl_dados.getValueAt(linha, 0);
			String especialidade = (String) tbl_dados.getValueAt(linha, 1);
			String cro = (String) tbl_dados.getValueAt(linha, 2);

			InterfaceCadastroDentista cadastrar = new InterfaceCadastroDentista(nome, especialidade, cro);

			cadastrar.setVisible(true);
			apagarDentista(linha);
		}

	}

	/**
	 * Apagar o dentista presenta na linha marcada da Table
	 * 
	 * @param indice
	 * @return
	 */
	public boolean apagarDentista(int indice) {
		if (indice != -1) {
			try {
				servicodentista.remover(indice);

				return true;
			} catch (Exception e) {
				return false;
			}

		} else {
			return false;
		}

	}

	/**
	 * Metodo chamado no evento onclick do botao de apagar
	 * 
	 * @param evt
	 */
	private void pnl_apagarMouseClicked(final java.awt.event.MouseEvent evt) {

		if (apagarDentista(tbl_dados.getSelectedRow()))
			JOptionPane.showMessageDialog(null, "Dentista Apagado");
		else
			JOptionPane.showMessageDialog(null, "Erro ao apagar");

	}

	private void lbl_atualizarMouseClicked(java.awt.event.MouseEvent evt) {
		dadosTable(); // TODO add your handling code here:
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel img_alterar;
	private javax.swing.JLabel img_apagar;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_janela;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbl_alterar;
	private javax.swing.JLabel lbl_apagar;
	private javax.swing.JLabel lbl_atualizar;
	private javax.swing.JLabel lbl_cadastrar;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_alterar;
	private javax.swing.JPanel pnl_apagar;
	private javax.swing.JPanel pnl_atualizar;
	private javax.swing.JPanel pnl_cadastrar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_titulo;
	private javax.swing.JTable tbl_dados;
	private static List<Dentista> dentistas = new ArrayList<>();
	private DentistaService servicodentista = new DentistaService();
	// End of variables declaration//GEN-END:variables
}
