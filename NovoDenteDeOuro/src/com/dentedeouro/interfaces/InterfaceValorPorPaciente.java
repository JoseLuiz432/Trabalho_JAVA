package com.dentedeouro.interfaces;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.dentedeouro.dao.PacienteDAO;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.service.GerenteService;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Font;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

/**
 * Interface que mostra o valor devido por um determinado paciente
 * 
 * @author igor e jose luiz
 *
 */
public class InterfaceValorPorPaciente extends JFrame {

	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel img_janela;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_titulo;
	private JPanel pnl_dados;
	private JComboBox<String> cb_valorpacientes;
	private JLabel lblEscolhaUmPaciente;
	private JButton btn_calcular;
	private JLabel lbl_resultado;
	private GerenteService servicegerencia;
	private PacienteDAO pacientedao = new PacienteDAO();
	private List<Paciente> pacientes = pacientedao.arrayPaciente();

	/**
	 * Cria a interface
	 */
	public InterfaceValorPorPaciente() {
		initComponents();
		carregarComboBox();
		servicegerencia = new GerenteService();
		setLocationRelativeTo(null);
	}

	/**
	 * Carrega o combobox com os pacientes cadastrados
	 */
	private void carregarComboBox() {
		int i = 1;
		// Recebendo os pacientes cadastrados

		// Preenchendo o combobox de pacientes
		for (Paciente paciente : pacientes) {
			cb_valorpacientes.insertItemAt(paciente.getNome(), i);
			i++;
		}
	}

	/**
	 * Inicializa os componentes presentes na interface
	 */

	private void initComponents() {

		pnl_conteudo = new javax.swing.JPanel();
		pnl_menu = new javax.swing.JPanel();
		pnl_menu.setBounds(0, 80, 950, 30);
		pnl_titulo = new javax.swing.JPanel();
		pnl_titulo.setBounds(0, 0, 950, 80);
		lbl_titulo = new javax.swing.JLabel();

		img_janela = new javax.swing.JLabel();
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setLayout(null);
		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));
		pnl_menu.setLayout(null);
		pnl_conteudo.add(pnl_menu);

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Pacientes");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 210, 40));

		img_janela.setIcon(new ImageIcon(InterfaceValorPorPaciente.class
				.getResource("/com/dentedeouro/interfaces/imagens/icons8_User_24px_1.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));
		pnl_conteudo.add(pnl_titulo);
		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 500, 500));

		pnl_dados = new JPanel();
		pnl_dados.setBounds(0, 110, 500, 390);
		pnl_conteudo.add(pnl_dados);
		pnl_dados.setLayout(null);

		cb_valorpacientes = new JComboBox<String>();
		cb_valorpacientes.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		cb_valorpacientes.setModel(new DefaultComboBoxModel<String>(new String[] { "Selecionar" }));
		cb_valorpacientes.setBounds(65, 78, 359, 42);
		pnl_dados.add(cb_valorpacientes);

		lblEscolhaUmPaciente = new JLabel("Escolha um paciente:");
		lblEscolhaUmPaciente.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblEscolhaUmPaciente.setBounds(65, 40, 190, 25);
		pnl_dados.add(lblEscolhaUmPaciente);

		btn_calcular = new JButton("CALCULAR");
		btn_calcular.setBounds(138, 133, 206, 25);
		pnl_dados.add(btn_calcular);

		btn_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_calcularMouseClicked(evt);
			}
		});

		lbl_resultado = new JLabel("R$00,00");
		lbl_resultado.setFont(new Font("Segoe UI", Font.BOLD, 50));
		lbl_resultado.setBounds(138, 269, 250, 108);
		pnl_dados.add(lbl_resultado);
		pack();
	}

	/**
	 * Mostra o valor que o paciente esta devendo
	 * 
	 * @param evt
	 */

	private void btn_calcularMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pnl_cadastrarMouseClicked

		Paciente paciente;

		paciente = pacientedao.procurarPaciente(pacientes.get(cb_valorpacientes.getSelectedIndex() - 1).getCpf());

		lbl_resultado.setText("R$" + String.valueOf(servicegerencia.conta(paciente)));

	}

}
