package com.dentedeouro.interfaces;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;

import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.ConsultaTableModelo;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.service.ConsultaService;
import com.dentedeouro.service.PacienteService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import java.awt.Color;
import com.dentedeouro.dao.DentistaDAO;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 * Interface que mostra as consultas cadastradas
 * 
 * @author igor
 *
 */
public class InterfaceMostrarConsultas extends JFrame {

	private static final long serialVersionUID = 1L;
	private javax.swing.JLabel img_alterar;
	private javax.swing.JLabel img_apagar;
	private javax.swing.JLabel img_janela;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JLabel lbl_alterar;
	private javax.swing.JLabel lbl_apagar;
	private javax.swing.JLabel lbl_titulo;
	private javax.swing.JPanel pnl_alterar;
	private javax.swing.JPanel pnl_apagar;
	private javax.swing.JPanel pnl_atualizar;
	private javax.swing.JPanel pnl_conteudo;
	private javax.swing.JPanel pnl_menu;
	private javax.swing.JPanel pnl_titulo;
	private javax.swing.JTable tbl_dados;
	private javax.swing.JComboBox<String> cb_dentistas;
	private javax.swing.JComboBox<String> cb_planos;
	private javax.swing.JPanel pnl_filtrar;
	private Date dataJanela = new Date();
	private DentistaDAO dentistadao = new DentistaDAO();
	private static List<Consulta> consultas = new ArrayList<>();
	private static List<Paciente> pacientes = new ArrayList<>();
	private PacienteService servicopaciente = new PacienteService();
	private ConsultaService consultaservice = new ConsultaService();
	private JLabel lbl_atualizar;
	private JLabel lbl_procurar;

	/**
	 * Cria a interface de Consultas
	 */
	public InterfaceMostrarConsultas() {

		initComponents();
		setLocationRelativeTo(null);
		carregarComboBox();
	}

	/**
	 * Mostra as consultas cadastradas
	 * 
	 * @param data
	 */

	public InterfaceMostrarConsultas(Date data) {

		initComponents();
		dadosTable("all", null, data);
		this.dataJanela = data;
		carregarComboBox();
		setLocationRelativeTo(null);
	}

	/**
	 * Seta o tipo de tabela e carrega os dados cadastrados
	 * 
	 * @param dentista
	 * @param tipo
	 * @param data
	 */

	private void dadosTable(String dentista, String tipo, Date data) {

		consultas = consultaservice.array(); // add o array dos dentistas
		ConsultaTableModelo modelo = new ConsultaTableModelo(dentista, consultas, tipo, data);

		tbl_dados.setModel(modelo);

	}

	/**
	 * Inicializa os componetes presentes na interface
	 */
	private void initComponents() {
		pnl_conteudo = new javax.swing.JPanel();
		pnl_menu = new javax.swing.JPanel();
		pnl_alterar = new javax.swing.JPanel();
		pnl_alterar.setBounds(0, 0, 140, 30);
		img_alterar = new javax.swing.JLabel();
		lbl_alterar = new javax.swing.JLabel();
		pnl_apagar = new javax.swing.JPanel();
		pnl_apagar.setBounds(138, 0, 125, 30);
		img_apagar = new javax.swing.JLabel();
		lbl_apagar = new javax.swing.JLabel();
		cb_dentistas = new JComboBox<String>();
		cb_planos = new JComboBox<String>();
		pnl_atualizar = new javax.swing.JPanel();
		pnl_atualizar.setBounds(670, 0, 30, 30);
		pnl_titulo = new javax.swing.JPanel();
		lbl_titulo = new javax.swing.JLabel();

		img_janela = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tbl_dados = new javax.swing.JTable();
		getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
		// pnl_conteudo.setMaximumSize(new java.awt.Dimension(930, 610));
		pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		pnl_menu.setBackground(new java.awt.Color(21, 101, 192));
		pnl_menu.setLayout(null);
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
		pnl_menu.add(pnl_alterar);
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
		pnl_menu.add(pnl_apagar);
		pnl_atualizar.setBackground(new java.awt.Color(21, 101, 192));

		lbl_atualizar = new JLabel();
		lbl_atualizar.setIcon(new ImageIcon(
				InterfaceMostrarConsultas.class.getResource("/com/dentedeouro/interfaces/imagens/refresh-arrow.png")));
		javax.swing.GroupLayout pnl_atualizarLayout = new javax.swing.GroupLayout(pnl_atualizar);
		pnl_atualizarLayout.setHorizontalGroup(pnl_atualizarLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lbl_atualizar, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));
		pnl_atualizarLayout.setVerticalGroup(pnl_atualizarLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lbl_atualizar, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));
		pnl_atualizar.setLayout(pnl_atualizarLayout);
		pnl_menu.add(pnl_atualizar);
		pnl_conteudo.add(pnl_menu, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 950, 30));

		pnl_filtrar = new JPanel();
		pnl_filtrar.setBackground(new Color(21, 101, 192));
		pnl_filtrar.setBounds(265, 0, 350, 30);
		pnl_menu.add(pnl_filtrar);
		pnl_filtrar.setLayout(null);

		pnl_atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_atualizarMouseClicked(evt);
			}
		});

		cb_dentistas.setBounds(0, 0, 150, 30);
		cb_dentistas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dentistas" }));
		pnl_filtrar.add(cb_dentistas);

		cb_planos.setBounds(170, 0, 150, 30);
		cb_planos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipos" }));
		pnl_filtrar.add(cb_planos);

		pnl_filtrar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_filtrarMouseClicked(evt);
			}
		});

		lbl_procurar = new JLabel("New label");
		lbl_procurar.setIcon(new ImageIcon(InterfaceMostrarConsultas.class
				.getResource("/com/dentedeouro/interfaces/imagens/musica-searcher.png")));
		lbl_procurar.setBounds(325, 0, 29, 30);
		pnl_filtrar.add(lbl_procurar);

		JPanel pnl_pacientes = new JPanel();
		pnl_pacientes.setBackground(new Color(21, 101, 192));
		pnl_pacientes.setBounds(628, 0, 30, 30);
		pnl_menu.add(pnl_pacientes);

		JLabel lbl_pacientes = new JLabel();
		lbl_pacientes.setIcon(new ImageIcon(InterfaceMostrarConsultas.class
				.getResource("/com/dentedeouro/interfaces/imagens/icons8_User_24px_1.png")));
		GroupLayout gl_pnl_pacientes = new GroupLayout(pnl_pacientes);
		gl_pnl_pacientes.setHorizontalGroup(
				gl_pnl_pacientes.createParallelGroup(Alignment.LEADING).addGap(0, 30, Short.MAX_VALUE)
						.addComponent(lbl_pacientes, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));
		gl_pnl_pacientes.setVerticalGroup(
				gl_pnl_pacientes.createParallelGroup(Alignment.LEADING).addGap(0, 30, Short.MAX_VALUE).addComponent(
						lbl_pacientes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE));
		pnl_pacientes.setLayout(gl_pnl_pacientes);

		pnl_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				pnl_pacientesMouseClicked(evt);
			}
		});

		pnl_titulo.setBackground(new java.awt.Color(41, 98, 255));
		pnl_titulo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());
		lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
		lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
		lbl_titulo.setText("Consultas");
		pnl_titulo.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 300, 40));

		img_janela.setIcon(new javax.swing.ImageIcon(
				getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_Medical_Doctor_24px.png"))); // NOI18N
		pnl_titulo.add(img_janela, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));
		pnl_conteudo.add(pnl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 950, 80));
		jScrollPane1.setViewportView(tbl_dados);
		pnl_conteudo.add(jScrollPane1, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 110, 700, 490));
		getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, -7, 700, 600));
		pack();
	}

	/**
	 * Controle o evento de clique do botao de alterara
	 * 
	 * @param evt
	 */
	private void pnl_alterarMouseClicked(final java.awt.event.MouseEvent evt) {

		if (tbl_dados.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione uma consulta");
		} else {
			int linha = tbl_dados.getSelectedRow();

			String codigo = (String) tbl_dados.getValueAt(linha, 0);
			String data = (String) tbl_dados.getValueAt(linha, 1);
			String paciente = (String) tbl_dados.getValueAt(linha, 2);
			String dentista = (String) tbl_dados.getValueAt(linha, 3);
			String horario = (String) tbl_dados.getValueAt(linha, 4);

			InterfaceCadastroConsulta cadastro = new InterfaceCadastroConsulta(codigo, data, paciente, dentista,
					horario);

			cadastro.setVisible(true);

			consultaservice.remove(Integer.parseInt(codigo));

		}

	}

	/**
	 * Lista os pacientes cadastrados em um determinado dia
	 * 
	 * @param evt
	 */

	private void pnl_pacientesMouseClicked(final java.awt.event.MouseEvent evt) {

		String[] nomes = new String[tbl_dados.getRowCount()];

		StringBuilder builder = new StringBuilder();

		pacientes = servicopaciente.array();

		if (cb_planos.getSelectedIndex() == 0) {

			for (int i = 0; i < tbl_dados.getRowCount(); i++) {
				nomes[i] = (String) tbl_dados.getValueAt(i, 2);

				for (int j = 0; j < pacientes.size(); j++) {
					if (nomes[i].equals(pacientes.get(j).getNome())) {
						builder.append("\n-----------------------------------------------\n");
						builder.append("NOME: ");
						builder.append(nomes[i]);
						builder.append("\n CPF: ");
						builder.append(pacientes.get(j).getCpf());
						builder.append("\n TELEFONE: ");
						builder.append(pacientes.get(j).getTelefone());
						builder.append("\n-------------------------------------------------");//

					}
				}

			}
			JOptionPane.showMessageDialog(null, builder);
		} else {
			String[] tipo = new String[tbl_dados.getRowCount()];
			for (int i = 0; i < tbl_dados.getRowCount(); i++) {
				nomes[i] = (String) tbl_dados.getValueAt(i, 2);
				tipo[i] = (String) tbl_dados.getValueAt(i, 7);
				for (int j = 0; j < pacientes.size(); j++) {
					if (nomes[i].equals(pacientes.get(j).getNome())
							&& tipo[i].equals(cb_planos.getItemAt(cb_planos.getSelectedIndex()))) {
						builder.append("\n-----------------------------------------------\n");
						builder.append("NOME: ");
						builder.append(nomes[i]);
						builder.append("\n CPF: ");
						builder.append(pacientes.get(j).getCpf());
						builder.append("\n TELEFONE: ");
						builder.append(pacientes.get(j).getTelefone());
						builder.append("\n-------------------------------------------------");//

					}

				}
			}
			JOptionPane.showMessageDialog(null, builder);
		}

	}

	/**
	 * Apaga a consulta selecionada na Table
	 * 
	 * @param indice
	 * @return
	 */

	private boolean apagarConsulta(int indice) {
		if (indice != -1) {
			try {
				consultaservice.remove(indice);
				return true;
			} catch (Exception e) {
				return false;
			}

		} else {
			return false;
		}

	}

	/**
	 * Carrega o combobox com os dados dos planos e dos dentistas
	 */

	private void carregarComboBox() {

		// Recebendo os dentistas cadastrados
		String[] dentista = dentistadao.getDentista();

		// Preenchendo o combobox de Dentistas
		for (int i = 0; i < dentistadao.qtdDentista(); i++) {
			cb_dentistas.insertItemAt(dentista[i], i + 1);
		}

		cb_planos.insertItemAt("Particular", 1);
		cb_planos.insertItemAt("Vip", 2);
		cb_planos.insertItemAt("Plano de Saúde", 3);

	}

	/**
	 * Apaga a consulta selecionada na tables
	 * 
	 * @param evt
	 */

	private void pnl_apagarMouseClicked(final java.awt.event.MouseEvent evt) {

		if (apagarConsulta(tbl_dados.getSelectedRow()))
			JOptionPane.showMessageDialog(null, "Consulta Apagada");
		else
			JOptionPane.showMessageDialog(null, "Erro ao apagar");

	}

	/**
	 * Abre o formulario de editar consultas
	 * 
	 * @param evt
	 */

	private void pnl_atualizarMouseClicked(final java.awt.event.MouseEvent evt) {
		dadosTable("all", null, dataJanela);
	}

	private void pnl_filtrarMouseClicked(final java.awt.event.MouseEvent evt) {

		if (cb_dentistas.getSelectedIndex() != 0 && cb_planos.getSelectedIndex() == 0) {
			dadosTable(cb_dentistas.getItemAt(cb_dentistas.getSelectedIndex()), null, dataJanela);

		}

		if (cb_dentistas.getSelectedIndex() != 0 && cb_planos.getSelectedIndex() != 0) {
			dadosTable(cb_dentistas.getItemAt(cb_dentistas.getSelectedIndex()),
					cb_planos.getItemAt(cb_planos.getSelectedIndex()), dataJanela);

		}

		if (cb_dentistas.getSelectedIndex() == 0) {
			dadosTable("all", null, dataJanela);

		}

	}
}
