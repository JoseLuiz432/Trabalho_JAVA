package com.dentedeouro.interfaces;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import com.dentedeouro.service.GerenteService;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.io.File;

import javax.swing.JButton;

/**
 * Interface de Configurações do sistema
 * 
 * @author igor e josé luiz
 *
 */

public class InterfaceConfiguracoes extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public InterfaceConfiguracoes() {
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

		initComponents();

	}

	/**
	 * Inicializa os componentes presentes na interface
	 */

	private void initComponents() {

		pnl_conteudo = new javax.swing.JPanel();
		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();

		img_janela = new javax.swing.JLabel();
		pnl_dados = new javax.swing.JPanel();
		pnl_importar = new javax.swing.JPanel();
		pnl_importar.setBounds(263, 57, 210, 190);
		edt_dentistas = new javax.swing.JLabel();
		edt_dentistas.setBounds(0, 0, 70, 25);
		pnl_exportar = new javax.swing.JPanel();
		pnl_exportar.setBounds(30, 57, 210, 190);
		lbl_exportar = new javax.swing.JLabel();
		lbl_exportar.setBounds(0, 0, 66, 25);
		pnl_menu = new javax.swing.JPanel();
		pnl_menu.setBounds(0, 0, 950, 30);
		cb_exportar = new JComboBox<String>();
		img_cadastro = new javax.swing.JLabel();
		gerente = new GerenteService();
		pnl_atualizar = new javax.swing.JPanel();

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
		lbl_titulo.setText("Configurações");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 10, 400, 60));

		img_janela.setIcon(new ImageIcon(
				InterfaceConfiguracoes.class.getResource("/com/dentedeouro/interfaces/imagens/config.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));

		pnl_importar.setBackground(new java.awt.Color(255, 255, 255));
		pnl_importar.setLayout(null);

		edt_dentistas.setBackground(new java.awt.Color(13, 71, 161));
		edt_dentistas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		edt_dentistas.setForeground(new java.awt.Color(13, 71, 161));
		edt_dentistas.setText("Importar\r\n");
		pnl_importar.add(edt_dentistas);

		pnl_exportar.setBackground(new java.awt.Color(255, 255, 255));
		pnl_exportar.setLayout(null);

		lbl_exportar.setBackground(new java.awt.Color(13, 71, 161));
		lbl_exportar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_exportar.setForeground(new java.awt.Color(13, 71, 161));
		lbl_exportar.setText("Exportar");
		pnl_exportar.add(lbl_exportar);

		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));
		pnl_menu.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Plus_24px_1.png"))); // NOI18N

		pnl_atualizar.setBackground(new java.awt.Color(21, 101, 192));

		javax.swing.GroupLayout pnl_atualizarLayout = new javax.swing.GroupLayout(pnl_atualizar);
		pnl_atualizarLayout.setHorizontalGroup(
				pnl_atualizarLayout.createParallelGroup(Alignment.LEADING).addGap(0, 30, Short.MAX_VALUE));
		pnl_atualizarLayout.setVerticalGroup(
				pnl_atualizarLayout.createParallelGroup(Alignment.LEADING).addGap(0, 30, Short.MAX_VALUE));
		pnl_atualizar.setLayout(pnl_atualizarLayout);

		pnl_menu.add(pnl_atualizar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(920, 0, 30, 30));

		pnl_conteudo.add(pnl_dados, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 540));
		pnl_dados.setLayout(null);
		pnl_dados.add(pnl_exportar);

		cb_exportar.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Selecionar", "Pacientes", "Dentistas", "Consultas" }));
		cb_exportar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		cb_exportar.setBounds(0, 38, 210, 40);
		pnl_exportar.add(cb_exportar);

		JButton btn_exportar = new JButton("EXPORTAR");
		btn_exportar.setBounds(52, 152, 120, 25);
		pnl_exportar.add(btn_exportar);

		btn_exportar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_exportarMouseClicked(evt);
			}
		});

		pnl_dados.add(pnl_importar);

		cb_importar = new JComboBox<String>();
		cb_importar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		cb_importar.setModel(
				new DefaultComboBoxModel<String>(new String[] { "Selecionar", "Pacientes", "Dentistas", "Consultas" }));
		cb_importar.setBounds(0, 38, 210, 40);
		pnl_importar.add(cb_importar);

		JButton btn_importar = new JButton("IMPORTAR");
		btn_importar.setBounds(57, 152, 120, 25);
		pnl_importar.add(btn_importar);

		btn_importar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_importarMouseClicked(evt);
			}
		});

		pnl_dados.add(pnl_menu);

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 950, 620));

		pack();
	}

	/**
	 * Evento de do botao de importar 
	 * @param evt
	 */
	private void btn_importarMouseClicked(final java.awt.event.MouseEvent evt) {

		if (cb_importar.getSelectedIndex() == 0)
			JOptionPane.showMessageDialog(null, "Selecione uma opcao valida");
		else {

			JFileChooser file = new JFileChooser();
			file.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int i = file.showSaveDialog(null);
			if (i == 1) {
				// JtextFieldLocal.setText("");
			} else {
				File arquivo = file.getSelectedFile();
				int opcao = cb_importar.getSelectedIndex();
				if (gerente.importar(arquivo.getPath(), opcao)) {
					JOptionPane.showMessageDialog(null, "Importado com sucesso");
				}

			}

		}

	}

	/**
	 * Evento do botao de exportar
	 * @param evt
	 */
	private void btn_exportarMouseClicked(final java.awt.event.MouseEvent evt) {

		if (cb_exportar.getSelectedIndex() == 0)
			JOptionPane.showMessageDialog(null, "Selecione uma opcao valida");
		else {

			JFileChooser file = new JFileChooser();
			file.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int i = file.showSaveDialog(null);
			if (i == 1) {
				// JtextFieldLocal.setText("");
			} else {
				File arquivo = file.getSelectedFile();
				int opcao = cb_exportar.getSelectedIndex();
				if (gerente.exportar(arquivo.getPath(), opcao)) {
					JOptionPane.showMessageDialog(null, "Exportado com sucesso");
				}

			}

		}

	}

	private javax.swing.JLabel edt_dentistas;
	private javax.swing.JLabel lbl_exportar;
	private javax.swing.JComboBox<String> cb_exportar;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_janela;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_atualizar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_dados;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_importar;
	private javax.swing.JPanel pnl_exportar;
	private javax.swing.JPanel pnl_titulo;
	private JComboBox<String> cb_importar;
	private GerenteService gerente;
}
