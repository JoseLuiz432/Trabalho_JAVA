package com.dentedeouro.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.service.ConsultaService;
import com.dentedeouro.service.DentistaService;
import com.dentedeouro.service.PacienteService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Classe que exporta os objetos escolhidos pelo usuario
 * 
 * @author igor e jose luiz
 *
 */
public class ExportJson {
	private Gson json;
	private Writer writer;

	/**
	 * Cria o json
	 */
	public ExportJson() {
		json = new GsonBuilder().setPrettyPrinting().create();
		;

	}

	/**
	 * Exporta os dentistas cadastrados no consultório
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public boolean deDentistatoJson(String path) throws IOException {
		DentistaService dentistas = new DentistaService();
		writer = new FileWriter(path + ".json");

		List<Dentista> lista = dentistas.array();
		PrintWriter print = new PrintWriter(writer);
		String gson;

		gson = json.toJson(lista);
		print.print(gson);

		writer.close();
		return true;

	}

	/**
	 * Exporta os pacientes cadastrados no consultório
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */

	public boolean dePacientetoJson(String path) throws IOException {
		PacienteService pacientes = new PacienteService();
		writer = new FileWriter(path + ".json");

		List<Paciente> lista = pacientes.array();
		PrintWriter print = new PrintWriter(writer);
		String gson;

		gson = json.toJson(lista);
		print.print(gson);

		writer.close();
		return true;

	}

	/**
	 * Exporta as consultas cadastradas no sistema
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public boolean deConsultatoJson(String path) throws IOException {
		ConsultaService gerente = new ConsultaService();
		writer = new FileWriter(path + ".json");

		List<Consulta> lista = gerente.array();
		PrintWriter print = new PrintWriter(writer);
		String gson;

		gson = json.toJson(lista);
		print.print(gson);

		writer.close();
		return true;
	}

}
