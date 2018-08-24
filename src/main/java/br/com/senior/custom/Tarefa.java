package br.com.senior.custom;

import com.fasterxml.jackson.databind.JsonNode;

public class Tarefa {

	 private String id;
    /**
     * Título do evento, uma descrição curta
     */
    private String titulo;
    /**
     * A data e hora do evento
     */
    private java.util.Date data;
    /**
     * Descrição da tarefa
     */
    private String description;

    /**
     * Campos customizados 
     * 
     */
    private JsonNode custom;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public java.util.Date getData() {
		return data;
	}

	public void setData(java.util.Date data) {
		this.data = data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public JsonNode getCustom() {
		return custom;
	}

	public void setCustom(JsonNode custom) {
		this.custom = custom;
	}

	
    
    
}
