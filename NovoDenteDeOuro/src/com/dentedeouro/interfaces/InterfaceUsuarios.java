/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import java.util.ArrayList;
import java.util.List;
import com.dentedeouro.modelo.Usuario;
import com.dentedeouro.modelo.UsuarioTableModelo;
import com.dentedeouro.service.UsuarioService;

/**
 * Interface que mostra os usuarios cadastrados no sistema
 * 
 * @author iigor
 */
public class InterfaceUsuarios extends javax.swing.JInternalFrame {

	// Variables declaration - do not modify
	private javax.swing.JLabel img_alterar;
	private javax.swing.JLabel img_apagar;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_janela;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbl_alterar;
	private javax.swing.JLabel lbl_apagar;
	private javax.swing.JLabel lbl_cadastrar;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_alterar;
	private javax.swing.JPanel pnl_apagar;
	private javax.swing.JPanel pnl_cadastrar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_titulo;
	private javax.swing.JTable tbl_dados;

	private static List<Usuario> usuarios = new ArrayList<>();
	private UsuarioService service = new UsuarioService();

	private static final long serialVersionUID = 1L;

	/**
	 * Cria o formulario que mostra os usuarios cadastrados
	 */
	public InterfaceUsuarios() {
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null); // Retirar barra de titulo

		initComponents();

	}

	/**
	 * Carrega os dados na table presente na interface
	 */
	public void dadosTable() {
		usuarios = service.getArray();

		UsuarioTableModelo modelo = new UsuarioTableModelo(usuarios);

		tbl_dados.setModel(modelo);

	}

	/**
	 * Inicializa os componentes presentes na interface
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
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

		pnl_alterar.setBackground(new java.awt.Color(21, 101, 192));
		pnl_alterar.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_alterar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Edit_24px_1.png"))); // NOI18N
		pnl_alterar.add(img_alterar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 30, 30));

		lbl_alterar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
		lbl_alterar.setForeground(new java.awt.Color(255, 255, 255));
		lbl_alterar.setText("Alterar");
		pnl_alterar.add(lbl_alterar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(30, 0, 110, 30));

		pnl_apagar.setBackground(new java.awt.Color(21, 101, 192));
		pnl_apagar.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_apagar.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Trash_Can_24px.png"))); // NOI18N
		pnl_apagar.add(img_apagar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 30, 30));

		lbl_apagar.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
		lbl_apagar.setForeground(new java.awt.Color(255, 255, 255));
		lbl_apagar.setText("Apagar");
		pnl_apagar.add(lbl_apagar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(30, 0, 110, 30));

		javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
		pnl_menu.setLayout(pnl_menuLayout);
		pnl_menuLayout.setHorizontalGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pnl_menuLayout.createSequentialGroup()
						.addComponent(pnl_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(pnl_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(pnl_apagar,
								javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)));
		pnl_menuLayout.setVerticalGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnl_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(pnl_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addComponent(pnl_apagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		pnl_conteudo.add(pnl_menu, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 30));

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Usuários");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 210, 40));

		img_janela.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_24px.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));

		dadosTable();
		jScrollPane1.setViewportView(tbl_dados);

		pnl_conteudo.add(jScrollPane1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 110, 950, 510));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 950, 620));

		pack();
	}// </editor-fold>

	/**
	 * Abre a interface de cadastro de usuarios
	 * 
	 * @param evt
	 */
	private void pnl_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {
		InterfaceCadastroUsuarios cadastro = new InterfaceCadastroUsuarios();

		cadastro.setVisible(true);

	}

	// End of variables declaration
}
