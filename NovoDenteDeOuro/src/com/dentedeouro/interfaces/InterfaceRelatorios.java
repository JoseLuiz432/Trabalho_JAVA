package com.dentedeouro.interfaces;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout.Alignment;

import com.dentedeouro.service.GerenteService;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;

/**
 * Interface de relatorios
 * 
 * @author igor
 *
 */
public class InterfaceRelatorios extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Cria o formulario de relatorios
	 */
	public InterfaceRelatorios() {
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
		pnl_menu = new javax.swing.JPanel();
		pnl_menu.setBounds(0, 0, 950, 30);
		img_cadastro = new javax.swing.JLabel();
		lbl_titulovalorporpaciente = new JLabel("VALOR POR PACIENTE");
		pnl_atendimento = new JPanel();
		lblAtendimentoFeitos = new JLabel("ATENDIMENTOS FEITOS");

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
		lbl_titulo.setText("Relatórios");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 10, 400, 60));

		img_janela.setIcon(new ImageIcon(
				InterfaceRelatorios.class.getResource("/com/dentedeouro/interfaces/imagens/progress-report.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));

		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));
		pnl_menu.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Plus_24px_1.png"))); // NOI18N

		pnl_atualizar.setBackground(new java.awt.Color(21, 101, 192));

		lbl_atualizar = new JLabel("");
		lbl_atualizar.setIcon(new ImageIcon(
				InterfaceRelatorios.class.getResource("/com/dentedeouro/interfaces/imagens/refresh-arrow.png")));

		javax.swing.GroupLayout pnl_atualizarLayout = new javax.swing.GroupLayout(pnl_atualizar);
		pnl_atualizarLayout.setHorizontalGroup(pnl_atualizarLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnl_atualizarLayout.createSequentialGroup()
						.addComponent(lbl_atualizar, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pnl_atualizarLayout.setVerticalGroup(pnl_atualizarLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(pnl_atualizarLayout.createSequentialGroup()
						.addComponent(lbl_atualizar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		pnl_atualizar.setLayout(pnl_atualizarLayout);

		pnl_menu.add(pnl_atualizar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(920, 0, 30, 30));

		pnl_conteudo.add(pnl_dados, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 540));
		pnl_dados.setLayout(null);
		pnl_dados.add(pnl_menu);

		pnl_valorporcliente = new JPanel();
		pnl_valorporcliente.setBackground(new java.awt.Color(41, 98, 255));
		pnl_valorporcliente.setBounds(10, 82, 250, 78);
		pnl_dados.add(pnl_valorporcliente);
		pnl_valorporcliente.setLayout(null);

		lbl_titulovalorporpaciente.setBounds(12, 26, 250, 25);
		lbl_titulovalorporpaciente.setForeground(Color.WHITE);
		lbl_titulovalorporpaciente.setFont(new Font("Segoe UI", Font.BOLD, 18));
		pnl_valorporcliente.add(lbl_titulovalorporpaciente);

		pnl_valorporcliente.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_valorporclienteMouseClicked(evt);
			}
		});

		lbl_imgvalorpaciente = new JLabel("");
		lbl_imgvalorpaciente.setBounds(76, 38, 113, 163);
		pnl_valorporcliente.add(lbl_imgvalorpaciente);

		pnl_atendimento.setLayout(null);
		pnl_atendimento.setBackground(new Color(41, 98, 255));
		pnl_atendimento.setBounds(350, 82, 250, 78);

		pnl_atendimento.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_atendimentoclienteMouseClicked(evt);
			}
		});

		pnl_dados.add(pnl_atendimento);

		lblAtendimentoFeitos.setForeground(Color.WHITE);
		lblAtendimentoFeitos.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblAtendimentoFeitos.setBounds(12, 26, 400, 25);
		pnl_atendimento.add(lblAtendimentoFeitos);

		JPanel pnl_lucro = new JPanel();
		pnl_lucro.setLayout(null);
		pnl_lucro.setBackground(new Color(41, 98, 255));
		pnl_lucro.setBounds(690, 82, 250, 78);
		pnl_dados.add(pnl_lucro);

		pnl_lucro.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_lucroMouseClicked(evt);
			}
		});

		JLabel lbl_lucro = new JLabel("LUCRO");
		lbl_lucro.setForeground(Color.WHITE);
		lbl_lucro.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lbl_lucro.setBounds(78, 25, 71, 25);
		pnl_lucro.add(lbl_lucro);

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 950, 620));

		pack();
	}

	/**
	 * Mostra o lucro total do consultório
	 * 
	 * @param evt
	 */
	private void pnl_lucroMouseClicked(java.awt.event.MouseEvent evt) {

		GerenteService gerente = new GerenteService();

		JOptionPane.showMessageDialog(null, "O lucro é de : R$" + String.valueOf(gerente.lucro()));

	}

	/**
	 * Abre a interface que mostra a quantidade de atendimentos feitos por um
	 * determinado dentista
	 * 
	 * @param evt
	 */
	private void pnl_atendimentoclienteMouseClicked(java.awt.event.MouseEvent evt) {

		InterfaceAtendimentoMesDentista relatorio = new InterfaceAtendimentoMesDentista();

		relatorio.setVisible(true);

	}

	/**
	 * Abre a interface que calcula o valor a ser pago por um determinado paciente
	 * 
	 * @param evt
	 */

	private void pnl_valorporclienteMouseClicked(java.awt.event.MouseEvent evt) {
		InterfaceValorPorPaciente valorpaciente = new InterfaceValorPorPaciente();
		valorpaciente.setVisible(true);

	}

	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_janela;
	private JPanel pnl_atendimento;
	private JLabel lblAtendimentoFeitos;
	private JLabel lbl_titulovalorporpaciente;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_atualizar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_dados;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_titulo;
	private javax.swing.JPanel pnl_valorporcliente;
	private JLabel lbl_atualizar;
	private JLabel lbl_imgvalorpaciente;
}