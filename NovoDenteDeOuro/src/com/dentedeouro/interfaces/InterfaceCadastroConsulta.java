/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import com.dentedeouro.dao.DentistaDAO;
import com.dentedeouro.dao.PacienteDAO;
import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.modelo.StatusConsulta;
import com.dentedeouro.service.ConsultaService;
import com.dentedeouro.service.DentistaService;
import com.dentedeouro.service.PacienteService;
import com.dentedeouro.utils.ConversaoDate;

/**
 * Interface responsavel por cadastras as consultas do consultorio
 * 
 * @author igor
 *
 */

public class InterfaceCadastroConsulta extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
	private DentistaService dentistaservice;
	private PacienteService pacienteservice;
	private ConsultaService consultaservice;
	private ConversaoDate conversao;
	private Dentista dentista;
	private Paciente paciente;
	private String nomedentista;
	private Date horario;
	private int codigo;
	StatusConsulta statusconsulta;
	private Date data;
	private Consulta consulta;

	/**
	 * Chama as funcoes que inicializa os componentes da tela, carrega os combobox e
	 * instancia os objetos utilizados na interface
	 */
	public InterfaceCadastroConsulta() {

		// INICIALIZAR OS COMPONENTES
		initComponents(); // Inicialziar os Componentes da tela
		carregarComboBox(); // Carregar o combobox com os nomes dos dentistas e pacientes cadastrados
		setLocationRelativeTo(null); // Centralizar Formulario

		// INSTANCIAR OBJETOS DECLARADOS
		dentistaservice = new DentistaService(); // Instanciar o objeto dentistaservice
		pacienteservice = new PacienteService(); // Instanciar o objeto pacienteservice
		conversao = new ConversaoDate(); // Instanciar o objeto conversao
		consultaservice = new ConsultaService(); // Instanciar o objeto consultaservice
		data = new Date(); // Instanciar o objeto date
		dentista = new Dentista(); // Instanciar o objeto dentista
		// paciente = new Paciente("", ""); // Instanciar o objeto paciente

		nomedentista = "Não Informado";
	}

	/**
	 * Construtor que carrega os dados para editar as consultas do consultorio
	 * 
	 * @param codigo
	 * @param datap
	 * @param pacientep
	 * @param dentistap
	 * @param horario
	 */
	public InterfaceCadastroConsulta(String codigo, String datap, String pacientep, String dentistap, String horario) {

		// INICIALIZAR OS COMPONENTES
		initComponents(); // Inicialziar os Componentes da tela
		carregarComboBox(); // Carregar o combobox com os nomes dos dentistas e pacientes cadastrados
		setLocationRelativeTo(null); // Centralizar Formulario

		// INSTANCIAR OBJETOS DECLARADOS
		dentistaservice = new DentistaService(); // Instanciar o objeto dentistaservice
		pacienteservice = new PacienteService(); // Instanciar o objeto pacienteservice
		conversao = new ConversaoDate(); // Instanciar o objeto conversao
		consultaservice = new ConsultaService(); // Instanciar o objeto consultaservice
		data = new Date(); // Instanciar o objeto date
		dentista = new Dentista(); // Instanciar o objeto dentista
		// paciente = new Paciente("", ""); // Instanciar o objeto paciente

		int index = 0;

		index = procurarDentistaCb(dentistap); // Procurar index que o dentista passado por parametro se encontra
		cb_dentistas.setSelectedIndex(index); // Setar o index do dentista

		index = procurarPacienteCb(pacientep); // Procurar index que o paciente passado por parametro se encontra
		cb_paciente.setSelectedIndex(index); // Setar o index do paciente

		// dt_data.setDate(conversao.strToDate(data));

		edt_horario.setText(horario);

	}

	/**
	 * Procura os dentistas que estao cadastrados no ComboBox
	 * 
	 * @param nome
	 * @return
	 */
	private int procurarDentistaCb(String nome) {
		int index = 0;
		for (int i = 0; i < cb_dentistas.getItemCount(); i++) {
			if (cb_dentistas.getItemAt(i).equals(nome)) {
				index = i;

			}
		}

		return index;
	}
	
	/**
	 * Procura os pacientes cadastrados no combobox de pacientes
	 * @param nome
	 * @return
	 */

	private int procurarPacienteCb(String nome) {
		int index = 0;
		for (int i = 0; i < cb_paciente.getItemCount(); i++) {
			if (cb_paciente.getItemAt(i).equals(nome))
				index = i;
		}
		return index;

	}
	
	/**
	 * Cadastra as consultas
	 * @param evt
	 */

	private void btn_cadastrarMouseClicked(final java.awt.event.MouseEvent evt) {

		// Se o combobox estiver selecionado, ou seja � diferende de 0..
		if (cb_dentistas.getSelectedIndex() != 0) {

			// Obtendo o nome selecionado no combobox
			nomedentista = cb_dentistas.getItemAt(cb_dentistas.getSelectedIndex());

			// Procurando esse nome
			dentista = dentistaservice.procurarDentista(nomedentista);

			// Se o combobox estiver selecionado, ou seja pe diferente de 0...
			int index = cb_paciente.getSelectedIndex();
			if (index != 0) {

				cb_paciente.getItemAt(index);

				// Procurando esse nome
				paciente = pacienteservice.procurarPaciente(lista_cpf.get(index - 1));

				// Recebendo a data informada pelo usuario
				data = dt_data.getDate();

				// Rececbendo e convertendo o horario informado pelo usuario
				horario = conversao.strToHoras(edt_horario.getText());

				// Obtendo o codigo da consulta
				codigo = consultaservice.getCodigo();

				// Obter o status da consulta
				if (cb_status.getSelectedIndex() == 1) {
					statusconsulta = StatusConsulta.CONFIRMADA;
				} else if (cb_status.getSelectedIndex() == 2) {
					statusconsulta = StatusConsulta.CANCELADA;

				} else if (cb_status.getSelectedIndex() == 3) {
					statusconsulta = StatusConsulta.AUSENTE;
				}

				if (cb_status.getSelectedIndex() != 0) {

					if (dt_data.getDate() != null) {

						consulta = new Consulta(codigo, dentista, data, paciente, horario, statusconsulta, null,
								paciente.getTipo());
						int resultado = consultaservice.inserir(consulta);
						if (resultado == 0) {

							// Mostrar Mensagem de Cadastro
							JOptionPane.showMessageDialog(null, "Consulta Cadastrada");

							// Fechar janela ap�s o cadastro
							InterfaceCadastroConsulta.this.dispose();
						} else {
							if (resultado == -5) {
								JOptionPane.showMessageDialog(null, "Dentista ocupado no Horatio");// Dentista ocupado
																									// no horario
							}
						}

					} else
						JOptionPane.showMessageDialog(null, "Digite uma data");
				}

				else
					JOptionPane.showMessageDialog(null, "Selecione um Status Válido");
				// Inserir a consulta no vetor de consultas

			} else {
				// Mostrar essa mensagem quando o usuario selecionar um paciente invalido
				JOptionPane.showMessageDialog(null, "Escolha um paciente válido");
			}

		} else {
			// Mostrar essa mensagem quando o usuario selecionar um dentista invalidos
			JOptionPane.showMessageDialog(null, "Escolha um dentista válido");

		}

	}

	// A fun��o a seguir � responsavel por listar os pacientes e dentistas
	// cadastrados no combobox
	private void carregarComboBox() {
		int i = 1;
		// Recebendo os pacientes cadastrados
		List<Paciente> pacientes = pacientedao.arrayPaciente();

		// Recebendo os dentistas cadastrados
		String[] dentista = dentistadao.getDentista();

		// Preenchendo o combobox de pacientes
		for (Paciente paciente : pacientes) {
			lista_cpf.add(paciente.getCpf());
			cb_paciente.insertItemAt(paciente.getNome(), i);
			i++;
		}

		// Preenchendo o combobox de Dentistas
		for (i = 0; i < dentistadao.qtdDentista(); i++) {
			cb_dentistas.insertItemAt(dentista[i], i + 1);
		}

	}
	
	/**
	 * Incializa os componentes presentes na interface
	 */

	// A fun��o Abaixo inicializa os componentes na tela

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		pnl_titulopacientes = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();
		img_cadastro = new javax.swing.JLabel();
		pnl_conteudo = new javax.swing.JPanel();
		lbl_dentista = new javax.swing.JLabel();
		btn_cadastrar = new javax.swing.JButton();
		cb_dentistas = new javax.swing.JComboBox<>();
		lbl_horario = new javax.swing.JLabel();
		dt_data = new com.toedter.calendar.JDateChooser();
		lbl_paciente = new javax.swing.JLabel();
		lbl_data = new javax.swing.JLabel();
		edt_horario = new javax.swing.JTextField();
		lbl_horario1 = new javax.swing.JLabel();
		cb_status = new javax.swing.JComboBox<>();
		cb_paciente = new javax.swing.JComboBox<>();

		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		pnl_titulopacientes.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulopacientes.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Cadastrar Consulta");
		pnl_titulopacientes.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 400, 40));

		img_cadastro.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Calendar_24px.png"))); // NOI18N
		pnl_titulopacientes.add(img_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

		getContentPane().add(pnl_titulopacientes, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 570, 80));

		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

		lbl_dentista.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_dentista.setText("Dentista:");
		pnl_conteudo.add(lbl_dentista, new com.dentedeouro.bibliotecas.AbsoluteConstraints(18, 10, 120, -1));

		btn_cadastrar.setText("CADASTRAR");

		btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btn_cadastrarMouseClicked(evt);
			}
		});
		pnl_conteudo.add(btn_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(200, 240, 150, 50));

		cb_dentistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
		cb_dentistas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cb_dentistasActionPerformed(evt);
			}
		});
		pnl_conteudo.add(cb_dentistas, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 40, 530, 30));

		lbl_horario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_horario.setText("Status:");
		pnl_conteudo.add(lbl_horario, new com.dentedeouro.bibliotecas.AbsoluteConstraints(350, 160, 120, -1));
		pnl_conteudo.add(dt_data, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 190, 190, 30));

		lbl_paciente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_paciente.setText("Paciente:");
		pnl_conteudo.add(lbl_paciente, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 80, 120, -1));

		lbl_data.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_data.setText("Data:");
		pnl_conteudo.add(lbl_data, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 160, 120, -1));
		pnl_conteudo.add(edt_horario, new com.dentedeouro.bibliotecas.AbsoluteConstraints(230, 190, 90, 30));

		lbl_horario1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		lbl_horario1.setText("Horário:");
		pnl_conteudo.add(lbl_horario1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(230, 160, 120, -1));

		cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(
				new String[] { "Selecionar", "Confirmada", "Cancelada", "Ausente" }));
		cb_status.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				// cb_statusActionPerformed(evt);
			}
		});
		pnl_conteudo.add(cb_status, new com.dentedeouro.bibliotecas.AbsoluteConstraints(350, 190, 200, 30));

		cb_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
		cb_paciente.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cb_pacienteActionPerformed(evt);
			}
		});
		pnl_conteudo.add(cb_paciente, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 110, 530, 30));

		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 570, 380));

		pack();
	}// </editor-fold> // </editor-fold>//GEN-END:initComponents

	private void cb_dentistasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cb_dentistasActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cb_dentistasActionPerformed

	private void cb_pacienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cb_pacienteActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_cb_pacienteActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btn_cadastrar;
	private javax.swing.JComboBox<String> cb_dentistas;
	private javax.swing.JComboBox<String> cb_paciente;
	private javax.swing.JComboBox<String> cb_status;
	private com.toedter.calendar.JDateChooser dt_data;
	private javax.swing.JTextField edt_horario;
	private javax.swing.JLabel img_cadastro;
	private javax.swing.JLabel lbl_data;
	private javax.swing.JLabel lbl_dentista;
	private javax.swing.JLabel lbl_horario;
	private javax.swing.JLabel lbl_horario1;
	private javax.swing.JLabel lbl_paciente;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_titulopacientes;
	private List<String> lista_cpf = new ArrayList<>();
	PacienteDAO pacientedao = new PacienteDAO();
	DentistaDAO dentistadao = new DentistaDAO();

	// End of variables declaration//GEN-END:variables
}
