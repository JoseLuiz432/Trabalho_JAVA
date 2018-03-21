package com.dentedeouro.io;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.dentedeouro.modelo.Usuario;

/**
 * Salva determinados dados em um arquivo text
 * @author igor e jose luiz
 *
 */
public class GravarArquivoTxt {
	
	
	private File arquivo;
	private FileWriter fileWriter;
	private PrintWriter printWriter;
	
	/**
	 * Instacia e inicializa os objetos necessários
	 * @throws IOException
	 */
	public GravarArquivoTxt() throws IOException{
	
		arquivo = new File("usuarios.txt");
		
		if(arquivo.exists()) {
			fileWriter = new FileWriter(arquivo,true);
			printWriter = new PrintWriter(fileWriter);
		} else {
			fileWriter = new FileWriter(arquivo,false);
			printWriter= new PrintWriter(fileWriter);
		}
	
	}

	/**
	 * Grava o arquivo TXT
	 * @param user
	 */
	public void gravarTxt(Usuario user) {
	printWriter.println(user.getNome()+"*"+user.getUsuario()+"*"+user.getSenha()+"*");
	printWriter.close();	
	}
	
	

}
