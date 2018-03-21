/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

public class InterfacePrincipal extends javax.swing.JFrame {


	private static final long serialVersionUID = 1L;


	InterfaceDentista dentistas;
	InterfacePainel painel;
	InterfacePaciente paciente;
	InterfaceAgenda agenda;
	InterfaceConfiguracoes configuracoes;
	InterfaceRelatorios relatorios;
	InterfaceUsuarios usuarios;

	public InterfacePrincipal() {

		dentistas = new InterfaceDentista();
		painel = new InterfacePainel();
		paciente = new InterfacePaciente();
		agenda = new InterfaceAgenda();
		configuracoes = new InterfaceConfiguracoes();
		relatorios = new InterfaceRelatorios();
		usuarios = new InterfaceUsuarios();
		setLocationRelativeTo(null);

		initComponents();

	}


	private void initComponents() {

		menulateral = new javax.swing.JPanel();
		pnl_relatorios = new javax.swing.JPanel();
		img_relatorio = new javax.swing.JLabel();
		lbl_relatorio = new javax.swing.JLabel();
		btn_dentistas = new javax.swing.JPanel();
		img_dentista = new javax.swing.JLabel();
		lbl_dentista = new javax.swing.JLabel();
		btn_pacientes = new javax.swing.JPanel();
		img_paciente = new javax.swing.JLabel();
		lbl_pacientes = new javax.swing.JLabel();
		btn_cadastro = new javax.swing.JPanel();
		img_cadastro = new javax.swing.JLabel();
		lbl_cadastro = new javax.swing.JLabel();
		btn_painel = new javax.swing.JPanel();
		img_painel = new javax.swing.JLabel();
        btn_usuarios = new javax.swing.JPanel();
        img_usuarios = new javax.swing.JLabel();
        lbl_usuarios = new javax.swing.JLabel();
		lbl_painel = new javax.swing.JLabel();
		lbl_logo = new javax.swing.JLabel();
		btn_configuracoes1 = new javax.swing.JPanel();
		img_config1 = new javax.swing.JLabel();
		lbl_config1 = new javax.swing.JLabel();
		btn_agenda1 = new javax.swing.JPanel();
		img_agenda1 = new javax.swing.JLabel();
		lbl_agenda1 = new javax.swing.JLabel();
		lbl_fechar = new javax.swing.JLabel();
		pnl_principal = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setMaximumSize(new java.awt.Dimension(1200, 650));
		setUndecorated(true);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		menulateral.setBackground(new java.awt.Color(13, 71, 161));
		menulateral.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_relatorios.setBackground(new java.awt.Color(25, 118, 210));

		pnl_relatorios.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_relatorio.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/progress-report.png"))); // NOI18N
		pnl_relatorios.add(img_relatorio, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_relatorio.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_relatorio.setForeground(new java.awt.Color(255, 255, 255));
		lbl_relatorio.setText("Relatórios");
		pnl_relatorios.add(lbl_relatorio, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 140, 40));

		pnl_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_relatoriosMouseClicked(evt);
			}
		});
		menulateral.add(pnl_relatorios, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 480, 280, 60));

		btn_dentistas.setBackground(new java.awt.Color(21, 101, 192));
		btn_dentistas.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_dentistasMouseClicked(evt);
			}
		});
		btn_dentistas.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_dentista.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_24px.png"))); // NOI18N
		btn_dentistas.add(img_dentista, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_dentista.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_dentista.setForeground(new java.awt.Color(255, 255, 255));
		lbl_dentista.setText("Dentistas");
		btn_dentistas.add(lbl_dentista, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 140, 40));

		menulateral.add(btn_dentistas, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 300, 280, 60));

		btn_pacientes.setBackground(new java.awt.Color(21, 101, 192));
		btn_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_pacientesMouseClicked(evt);
			}
		});
		btn_pacientes.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_paciente.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_User_24px_1.png"))); // NOI18N
		btn_pacientes.add(img_paciente, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_pacientes.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_pacientes.setForeground(new java.awt.Color(255, 255, 255));
		lbl_pacientes.setText("Pacientes");
		btn_pacientes.add(lbl_pacientes, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 140, 40));

		menulateral.add(btn_pacientes, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 360, 280, 60));

		btn_cadastro.setBackground(new java.awt.Color(25, 118, 210));
		btn_cadastro.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Form_24px.png"))); // NOI18N
		btn_cadastro.add(img_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_cadastro.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_cadastro.setForeground(new java.awt.Color(255, 255, 255));
		lbl_cadastro.setText("Cadastro e Consultas");
		btn_cadastro.add(lbl_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 280, 40));

		menulateral.add(btn_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 180, 280, 60));

		btn_painel.setBackground(new java.awt.Color(25, 118, 210));
		btn_painel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_painelMouseClicked(evt);
			}
		});
		btn_painel.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_painel.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Home_24px.png"))); // NOI18N
		btn_painel.add(img_painel, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_painel.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_painel.setForeground(new java.awt.Color(255, 255, 255));
		lbl_painel.setText("Painel");
		btn_painel.add(lbl_painel, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 140, 40));

		menulateral.add(btn_painel, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 120, 280, 60));

		lbl_logo.setIcon(
				new javax.swing.ImageIcon(getClass().getResource("/com/dentedeouro/interfaces/imagens/logoouro.png"))); // NOI18N
		menulateral.add(lbl_logo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 200, 80));

		btn_configuracoes1.setBackground(new java.awt.Color(25, 118, 210));
		btn_configuracoes1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				// btn_configuracoes1MouseClicked(evt);
			}
		});
		btn_configuracoes1.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		
		img_config1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/config.png"))); // NOI18N
		btn_configuracoes1.add(img_config1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_config1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_config1.setForeground(new java.awt.Color(255, 255, 255));
		lbl_config1.setText("Configurações");
		btn_configuracoes1.add(lbl_config1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 280, 40));

		btn_configuracoes1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_configuracoesMouseClicked(evt);
			}
		});
		menulateral.add(btn_configuracoes1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 540, 280, 60));

		btn_agenda1.setBackground(new java.awt.Color(21, 101, 192));
		btn_agenda1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_agendaMouseClicked(evt);
			}
		});
		btn_agenda1.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		img_agenda1.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Calendar_24px.png"))); // NOI18N
		btn_agenda1.add(img_agenda1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 30, 40));

		lbl_agenda1.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
		lbl_agenda1.setForeground(new java.awt.Color(255, 255, 255));
		lbl_agenda1.setText("Agenda");
		btn_agenda1.add(lbl_agenda1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 140, 40));

		menulateral.add(btn_agenda1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 420, 280, 60));

		getContentPane().add(menulateral, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 280, 650));

		lbl_fechar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		lbl_fechar.setForeground(new java.awt.Color(0, 51, 255));
		lbl_fechar.setText("X");
		lbl_fechar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				lbl_fecharMouseClicked(evt);
			}
		});
		
		
		btn_usuarios.setBackground(new java.awt.Color(21, 101, 192));
        btn_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usuariosMouseClicked(evt);
            }
        });
        btn_usuarios.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

        img_usuarios.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_User_24px_1.png")));
        btn_usuarios.add(img_usuarios, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 10, 40, 40));

        lbl_usuarios.setFont(new java.awt.Font("Segoe UI", 0, 21)); // NOI18N
        lbl_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usuarios.setText("Usuários");
        btn_usuarios.add(lbl_usuarios, new com.dentedeouro.bibliotecas.AbsoluteConstraints(50, 10, 140, 40));

        menulateral.add(btn_usuarios, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 240, 280, 60));
		
		
		
		getContentPane().add(lbl_fechar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(1210, 0, -1, -1));

		pnl_principal.setMaximumSize(new java.awt.Dimension(930, 610));
		pnl_principal.setMinimumSize(new java.awt.Dimension(930, 610));

		javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
		pnl_principal.setLayout(pnl_principalLayout);
		pnl_principalLayout.setHorizontalGroup(pnl_principalLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 950, Short.MAX_VALUE));
		pnl_principalLayout.setVerticalGroup(pnl_principalLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 610, Short.MAX_VALUE));

		getContentPane().add(pnl_principal, new com.dentedeouro.bibliotecas.AbsoluteConstraints(280, 40, 950, 610));

		setSize(new java.awt.Dimension(1229, 650));
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btn_agendaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_agendaMouseClicked
		pnl_principal.add(agenda);
		dentistas.setVisible(false);
		usuarios.setVisible(false);
		paciente.setVisible(false);
		painel.setVisible(false);
		relatorios.setVisible(false);
		configuracoes.setVisible(false);
		agenda.setVisible(true);
	}

	private void btn_dentistasMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_dentistasMouseClicked
		pnl_principal.add(dentistas);
		painel.setVisible(false);
		usuarios.setVisible(false);
		paciente.setVisible(false);
		agenda.setVisible(false);
		relatorios.setVisible(false);
		configuracoes.setVisible(false);
		dentistas.setVisible(true);
	}
	
    private void btn_usuariosMouseClicked(java.awt.event.MouseEvent evt) {                                          
		pnl_principal.add(usuarios);
		paciente.setVisible(false);
		agenda.setVisible(false);
		dentistas.setVisible(false);
		configuracoes.setVisible(false);
		painel.setVisible(false);
		relatorios.setVisible(false);
		usuarios.setVisible(true);
    }                                         


	private void btn_pacientesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_pacientesMouseClicked
		pnl_principal.add(paciente);
		dentistas.setVisible(false);
		painel.setVisible(false);
		usuarios.setVisible(false);
		agenda.setVisible(false);
		configuracoes.setVisible(false);
		relatorios.setVisible(false);
		paciente.setVisible(true);
		
	}

	private void btn_painelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_painelMouseClicked
		pnl_principal.add(painel);
		dentistas.setVisible(false);
		paciente.setVisible(false);
		agenda.setVisible(false);
		configuracoes.setVisible(false);
		usuarios.setVisible(false);
		relatorios.setVisible(false);
		painel.setVisible(true);

	
	}

	private void lbl_fecharMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_lbl_fecharMouseClicked
		System.exit(0); 
	}

	private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
	
		pnl_principal.add(painel);
		paciente.setVisible(false);
		relatorios.setVisible(false);
		agenda.setVisible(false);
		dentistas.setVisible(false);
		usuarios.setVisible(false);
		configuracoes.setVisible(false);
		painel.setVisible(true);
	}

	private void btn_configuracoesMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_configuracoesMouseClicked
		pnl_principal.add(configuracoes);
		paciente.setVisible(false);
		agenda.setVisible(false);
		dentistas.setVisible(false);
		relatorios.setVisible(false);
		usuarios.setVisible(false);
		painel.setVisible(false);
		configuracoes.setVisible(true);

	}

	private void pnl_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_configuracoesMouseClicked
		pnl_principal.add(relatorios);
		paciente.setVisible(false);
		agenda.setVisible(false);
		dentistas.setVisible(false);
		configuracoes.setVisible(false);
		painel.setVisible(false);
		usuarios.setVisible(false);
		relatorios.setVisible(true);

	}


	private javax.swing.JPanel btn_agenda1;
	private javax.swing.JPanel btn_cadastro;
	private javax.swing.JPanel btn_configuracoes1;
	private javax.swing.JPanel btn_dentistas;
	private javax.swing.JPanel btn_pacientes;
	private javax.swing.JPanel btn_painel;
	private javax.swing.JLabel img_agenda1;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel img_config1;
	private javax.swing.JLabel img_dentista;
	private javax.swing.JLabel img_paciente;
	private javax.swing.JLabel img_painel;
	private javax.swing.JLabel img_relatorio;
	private javax.swing.JLabel lbl_agenda1;
	private javax.swing.JLabel lbl_cadastro;
	private javax.swing.JLabel lbl_config1;
	private javax.swing.JLabel lbl_dentista;
	private javax.swing.JLabel lbl_fechar;
	private javax.swing.JLabel lbl_logo;
	private javax.swing.JLabel lbl_pacientes;
	private javax.swing.JLabel lbl_painel;
	private javax.swing.JLabel lbl_relatorio;
	private javax.swing.JPanel menulateral;
	private javax.swing.JPanel pnl_principal;
    private javax.swing.JLabel img_usuarios;
    private javax.swing.JLabel lbl_usuarios;
    private javax.swing.JPanel btn_usuarios;
	private javax.swing.JPanel pnl_relatorios;

}
