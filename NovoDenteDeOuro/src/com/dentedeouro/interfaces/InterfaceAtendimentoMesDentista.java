package com.dentedeouro.interfaces;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.DentistaDAO;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.service.GerenteService;

/**
 * Interface que mostra a quantidade de atendimento realizados por um
 * determinado dentista
 * 
 * @author igor e josé luiz
 *
 */
public class InterfaceAtendimentoMesDentista extends JFrame {

	private static final long serialVersionUID = 1L;
	private javax.swing.JComboBox<String> cb_dentista;
	private javax.swing.JLabel img_janela;
	private javax.swing.JLabel lbl_atendimentoparticular;
	private javax.swing.JLabel lbl_atendimentoplano;
	private javax.swing.JLabel lbl_atendimentovip;
	private javax.swing.JLabel lbl_qtdatendimentoplano;
	private javax.swing.JLabel lbl_qtdparticular;
	private javax.swing.JLabel lbl_qtdtotal;
	private javax.swing.JLabel lbl_qtdvip;
	private javax.swing.JLabel lbl_selecione;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JLabel lbl_totalatendimentos;
	private javax.swing.JPanel pnl_atendimentoparticular;
	private javax.swing.JPanel pnl_atendimentoplano;
	private javax.swing.JPanel pnl_atendimentovip;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_qtdatedimento;
	private javax.swing.JPanel pnl_titulo;
	private DentistaDAO dentistadao = new DentistaDAO();
	private GerenteService gerenteservice;

	/**
	 * Construtor que chama a função de incialização dos componentes
	 */
	public InterfaceAtendimentoMesDentista() {
		initComponents();
		carregarComboBox();
		setLocationRelativeTo(null);
	}

	/**
	 * Carrega os dentistas cadastrados no combobox
	 */

	private void carregarComboBox() {
		String[] dentista = dentistadao.getDentista();

		// Preenchendo o combobox de pacientes
		for (int i = 0; i < dentistadao.qtdDentista(); i++) {
			cb_dentista.insertItemAt(dentista[i], i + 1);
		}

	}

	/**
	 * Inicializa os componentes da interface
	 */

	private void initComponents() {

		pnl_menu = new javax.swing.JPanel();
		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_janela = new javax.swing.JLabel();
		cb_dentista = new javax.swing.JComboBox<>();
		lbl_selecione = new javax.swing.JLabel();
		pnl_atendimentoplano = new javax.swing.JPanel();
		lbl_atendimentoplano = new javax.swing.JLabel();
		lbl_qtdatendimentoplano = new javax.swing.JLabel();
		pnl_qtdatedimento = new javax.swing.JPanel();
		lbl_totalatendimentos = new javax.swing.JLabel();
		lbl_qtdtotal = new javax.swing.JLabel();
		pnl_atendimentovip = new javax.swing.JPanel();
		lbl_atendimentovip = new javax.swing.JLabel();
		lbl_qtdvip = new javax.swing.JLabel();
		pnl_atendimentoparticular = new javax.swing.JPanel();
		lbl_atendimentoparticular = new javax.swing.JLabel();
		lbl_qtdparticular = new javax.swing.JLabel();

		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));

		javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
		pnl_menu.setLayout(pnl_menuLayout);
		pnl_menuLayout.setHorizontalGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 500, Short.MAX_VALUE));
		pnl_menuLayout.setVerticalGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 30, Short.MAX_VALUE));

		getContentPane().add(pnl_menu, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 500, 30));

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Dentistas");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 320, 40));

		img_janela.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_24px.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		getContentPane().add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 500, 80));

		cb_dentista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

		getContentPane().add(cb_dentista, new com.dentedeouro.bibliotecas.AbsoluteConstraints(90, 160, 330, 30));

		cb_dentista.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cb_dentistaActionPerformed(evt);
			}
		});

		lbl_selecione.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
		lbl_selecione.setText("Selecione o dentista:");
		getContentPane().add(lbl_selecione, new com.dentedeouro.bibliotecas.AbsoluteConstraints(170, 130, -1, -1));

		pnl_atendimentoplano.setBackground(new java.awt.Color(20, 2, 183));
		pnl_atendimentoplano.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_atendimentoplano.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
		lbl_atendimentoplano.setForeground(new java.awt.Color(254, 254, 254));
		lbl_atendimentoplano.setText("ATENDIMENTO PLANO ");
		pnl_atendimentoplano.add(lbl_atendimentoplano,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, -1, -1));

		lbl_qtdatendimentoplano.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
		lbl_qtdatendimentoplano.setForeground(new java.awt.Color(254, 254, 254));
		lbl_qtdatendimentoplano.setText("0");
		pnl_atendimentoplano.add(lbl_qtdatendimentoplano,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(100, 20, -1, -1));

		getContentPane().add(pnl_atendimentoplano,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(240, 460, 260, 120));

		pnl_qtdatedimento.setBackground(new java.awt.Color(0, 98, 255));
		pnl_qtdatedimento.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_totalatendimentos.setBackground(new java.awt.Color(254, 254, 254));
		lbl_totalatendimentos.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
		lbl_totalatendimentos.setForeground(new java.awt.Color(254, 247, 247));
		lbl_totalatendimentos.setText("TOTAL DE ATENDIMENTOS");
		pnl_qtdatedimento.add(lbl_totalatendimentos,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, -1, -1));

		lbl_qtdtotal.setFont(new java.awt.Font("Ubuntu", 0, 200)); // NOI18N
		lbl_qtdtotal.setForeground(new java.awt.Color(254, 254, 254));
		lbl_qtdtotal.setText("0");
		pnl_qtdatedimento.add(lbl_qtdtotal, new com.dentedeouro.bibliotecas.AbsoluteConstraints(60, 70, -1, -1));

		getContentPane().add(pnl_qtdatedimento, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 220, 240, 360));

		pnl_atendimentovip.setBackground(new java.awt.Color(2, 0, 255));
		pnl_atendimentovip.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_atendimentovip.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
		lbl_atendimentovip.setForeground(new java.awt.Color(254, 254, 254));
		lbl_atendimentovip.setText("ATENDIMENTOS VIPS");
		pnl_atendimentovip.add(lbl_atendimentovip, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, -1, -1));

		lbl_qtdvip.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
		lbl_qtdvip.setForeground(new java.awt.Color(254, 254, 254));
		lbl_qtdvip.setText("0");
		pnl_atendimentovip.add(lbl_qtdvip, new com.dentedeouro.bibliotecas.AbsoluteConstraints(100, 20, -1, -1));

		getContentPane().add(pnl_atendimentovip,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(240, 220, 260, 120));

		pnl_atendimentoparticular.setBackground(new java.awt.Color(17, 1, 221));
		pnl_atendimentoparticular.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_atendimentoparticular.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
		lbl_atendimentoparticular.setForeground(new java.awt.Color(254, 254, 254));
		lbl_atendimentoparticular.setText("ATENDIMENTOS PARTICULARES");
		pnl_atendimentoparticular.add(lbl_atendimentoparticular,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, -1, -1));

		lbl_qtdparticular.setFont(new java.awt.Font("Ubuntu", 0, 80)); // NOI18N
		lbl_qtdparticular.setForeground(new java.awt.Color(254, 254, 254));
		lbl_qtdparticular.setText("0");
		pnl_atendimentoparticular.add(lbl_qtdparticular,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(100, 20, -1, -1));

		getContentPane().add(pnl_atendimentoparticular,
				new com.dentedeouro.bibliotecas.AbsoluteConstraints(240, 340, 260, 120));

		pack();

	}

	/**
	 * Controle a escolha dos dentistas pelo ComboBox
	 * 
	 * @param evt
	 */
	private void cb_dentistaActionPerformed(java.awt.event.ActionEvent evt) {
		Dentista dentistas = new Dentista();
		gerenteservice = new GerenteService();

		dentistas = dentistadao.procurarDentista(cb_dentista.getItemAt(cb_dentista.getSelectedIndex()));

		lbl_qtdtotal.setText("0");
		lbl_qtdparticular.setText("0");
		lbl_qtdvip.setText("0");
		lbl_qtdatendimentoplano.setText("0");

		if (cb_dentista.getSelectedIndex() != 0) {

			lbl_qtdtotal.setText(String.valueOf(gerenteservice.numConsultasTotal(dentistas)));
			lbl_qtdparticular.setText(String.valueOf(gerenteservice.numConsultaParticular(dentistas)));
			lbl_qtdvip.setText(String.valueOf(gerenteservice.numConsultasVip(dentistas)));
			lbl_qtdatendimentoplano.setText(String.valueOf(gerenteservice.numConsultasPlano(dentistas)));
		} else
			JOptionPane.showMessageDialog(null, "Selecione uma opção válida");

	}

}
