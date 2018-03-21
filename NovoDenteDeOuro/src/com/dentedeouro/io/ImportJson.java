package com.dentedeouro.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;


import com.dentedeouro.modelo.Consulta;
import com.dentedeouro.modelo.Dentista;
import com.dentedeouro.modelo.Paciente;
import com.dentedeouro.service.ConsultaService;
import com.dentedeouro.service.DentistaService;
import com.dentedeouro.service.PacienteService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/**
 * Importa os dados cadastrados no sistema
 * @author igor
 *
 */
public class ImportJson {
	private Reader reader;

	/**
	 * Instancia o objeto Gson
	 */
	public ImportJson() {
		new Gson();
		
	}

	/**
	 * Importa os dentistas
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */
	public boolean deJsontoDentista(String path) throws FileNotFoundException{
		DentistaService service = new DentistaService();
		
		reader = new FileReader(new File(path));
		
		Type type = new TypeToken<List<Dentista>>() {
		}.getType();
		List<Dentista> inpList = new Gson().fromJson(reader, type);
		for (Dentista dentista : inpList) {
			service.inserir(dentista);
		}

		return true;
	}
	/**
	 * Importa os pacientes
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */

	public boolean deJsontoPaciente(String path) throws FileNotFoundException {
		PacienteService service = new PacienteService();
		
		reader = new FileReader(new File(path));
		Gson gsontipo = new GsonBuilder().registerTypeAdapter(Paciente.class, new DeJsonConsulta()).create();

		Type type = new TypeToken<List<Paciente>>(){}.getType();
		List<Paciente> inpList = gsontipo.fromJson(reader, type);
		for (Paciente paciente : inpList) {
			service.inserir(paciente);		
		}
		return true;
	}
	
	/**
	 * Importa as consultas
	 * @param path
	 * @return
	 * @throws FileNotFoundException
	 */

	public boolean deJsontoConsulta(String path) throws FileNotFoundException{
		ConsultaService service = new ConsultaService();
		reader = new FileReader(new File(path));
		Gson gsontipo = new GsonBuilder().registerTypeAdapter(Paciente.class, new DeJsonConsulta()).create();
		Type type = new TypeToken<List<Consulta>>() {
		}.getType();
		List<Consulta> inpList = gsontipo.fromJson(reader, type);
		for (Consulta consulta : inpList) {
			service.inserir(consulta);
		}
		return true;
	} 
	
	/**
	 * Classe que controla os pacientes de uma determinada consulta
	 * @author igor e jose luiz
	 *
	 */
	
	public class DeJsonConsulta implements JsonDeserializer<Paciente>{
		@Override
		public Paciente deserialize(JsonElement element, Type type,
	            JsonDeserializationContext context) throws JsonParseException{
			JsonObject jsonobject = element.getAsJsonObject();
			String tipo = jsonobject.get("tipo").getAsString();
			Gson gson = new Gson();
			if (tipo.equals("Plano de Saúde")) {           
		        try {
					return (Paciente) gson.fromJson(jsonobject, Class.forName("com.dentedeouro.modelo.Paciente_Plano"));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				    
			}else if(tipo.equals("Vip")) {
				try {
					return (Paciente) gson.fromJson(jsonobject, Class.forName("com.dentedeouro.modelo.Paciente_VIP"));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				    
			}else {
				try {
					return (Paciente) gson.fromJson(jsonobject, Class.forName("com.dentedeouro.modelo.Paciente_Particular"));
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				    
			}
			return null;
		}
	}
}
