package com.dentedeouro.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.dentedeouro.modelo.Usuario;
import com.dentedeouro.service.UsuarioService;

/**
 * Ler arquivos no formato TXT
 * 
 * @author igor
 *
 */
public class LerArquivoTxt {

	private File file;
	private Scanner scanner;
	private String diretorio;
	private StringTokenizer st;

	/**
	 * Ler Arquivo do diretorio passado
	 * 
	 * @param diretorio
	 */
	public LerArquivoTxt(String diretorio) {

		this.diretorio = diretorio;
		file = new File(diretorio);

	}

	/**
	 * Ler Arquivo que contem os dados do usuario
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	public boolean lerArquivoUsuario() throws FileNotFoundException {

		Usuario usuario = new Usuario();
		UsuarioService service = new UsuarioService();

		scanner = new Scanner(file);

		while (scanner.hasNextLine()) {

			st = new StringTokenizer(scanner.nextLine());
			usuario.setNome(st.nextToken("*"));
			usuario.setUsuario(st.nextToken("*"));
			usuario.setSenha(st.nextToken("*"));
		}
		service.inserirUsuario(usuario);
		return true;

	}

	/**
	 * Retorna o diretorio do objeto
	 * 
	 * @return
	 */

	public String getDiretorio() {
		return diretorio;
	}

}
