/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dentedeouro.interfaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.dentedeouro.io.LerArquivoTxt;
import com.dentedeouro.modelo.Usuario;
import com.dentedeouro.service.UsuarioService;
import com.dentedeouro.visao.Principal;

/**
 * Interface de Cadastro dos usuarios que utilizam o sistema
 * @author igor e jose luiz
 */
public class InterfaceCadastroUsuarios extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Cria novo formulario de cadastro de usuarios
     */
    public InterfaceCadastroUsuarios() {
        
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     *Este metodo instancia e cria os componentes presentes na interface
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pnl_titulopacientes = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        img_cadastro = new javax.swing.JLabel();
        pnl_conteudo = new javax.swing.JPanel();
        lbl_nome = new javax.swing.JLabel();
        btn_cadastrar = new javax.swing.JButton();
        edt_nome = new javax.swing.JTextField();
        edt_senha = new javax.swing.JTextField();
        lbl_senha = new javax.swing.JLabel();
        edt_usuario = new javax.swing.JTextField();
        lbl_usuario = new javax.swing.JLabel();

        getContentPane().setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

        pnl_titulopacientes.setBackground(new java.awt.Color(41, 98, 255));
        pnl_titulopacientes.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Cadastrar Usuários");
        pnl_titulopacientes.add(lbl_titulo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(40, 20, 400, 40));

        img_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dentedeouro/interfaces/imagens/icons8_User_24px_1.png"))); // NOI18N
        pnl_titulopacientes.add(img_cadastro, new com.dentedeouro.bibliotecas.AbsoluteConstraints(10, 30, 30, 30));

        getContentPane().add(pnl_titulopacientes, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 0, 570, 80));

        pnl_conteudo.setBackground(new java.awt.Color(255, 255, 255));
        pnl_conteudo.setLayout(new com.dentedeouro.bibliotecas.AbsoluteLayout());

        lbl_nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_nome.setText("Nome: ");
        pnl_conteudo.add(lbl_nome, new com.dentedeouro.bibliotecas.AbsoluteConstraints(18, 10, 120, -1));

        btn_cadastrar.setText("CADASTRAR");
        btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					btn_cadastrarMouseClicked(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        pnl_conteudo.add(btn_cadastrar, new com.dentedeouro.bibliotecas.AbsoluteConstraints(200, 240, 150, 50));
        pnl_conteudo.add(edt_nome, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 40, 530, 30));
        pnl_conteudo.add(edt_senha, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 180, 530, 30));

        lbl_senha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_senha.setText("Senha:");
        pnl_conteudo.add(lbl_senha, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 150, -1, -1));
        pnl_conteudo.add(edt_usuario, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 110, 530, 30));

        lbl_usuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_usuario.setText("Usuário:");
        pnl_conteudo.add(lbl_usuario, new com.dentedeouro.bibliotecas.AbsoluteConstraints(20, 80, 120, -1));

        getContentPane().add(pnl_conteudo, new com.dentedeouro.bibliotecas.AbsoluteConstraints(0, 80, 570, 320));

        pack();
    }// </editor-fold>                        

    /**
     * Controla o evento de click do botao cadastro
     * @param args the command line arguments
     * @throws IOException 
     */
    
    private void btn_cadastrarMouseClicked(java.awt.event.MouseEvent evt) throws IOException {    
    	Usuario user = new Usuario();
    	UsuarioService service = new UsuarioService();
    	
    	user.setNome(edt_nome.getText());
    	user.setSenha(edt_senha.getText());
    	user.setUsuario(edt_usuario.getText());
    	
    	int resultado = service.salvarUsuarioTxt(user);
    	

		if (resultado == 0) {
			JOptionPane.showMessageDialog(null, "Usuario Cadastrado com Sucesso!");
			Principal.lerusuarios = new LerArquivoTxt("usuarios.txt");
    		Principal.lerusuarios.lerArquivoUsuario();

			InterfaceCadastroUsuarios.this.dispose();
		
		}
		if (resultado == -1)
			JOptionPane.showMessageDialog(null, "Preencha todas as informações obrigatórias");
		if (resultado == 1)
			JOptionPane.showMessageDialog(null, "ERRO ao salvar !");

        
    }     
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCadastroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCadastroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JTextField edt_nome;
    private javax.swing.JTextField edt_senha;
    private javax.swing.JTextField edt_usuario;
    private javax.swing.JLabel img_cadastro;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_senha;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPanel pnl_conteudo;
    private javax.swing.JPanel pnl_titulopacientes;
    // End of variables declaration                   
}
