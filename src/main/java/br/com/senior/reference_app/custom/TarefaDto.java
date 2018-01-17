package br.com.senior.reference_app.custom;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class TarefaDTO {

	private Long id;
	/**
	 * T�tulo do evento, uma descri��o curta
	 */
	private String titulo;
	/**
	 * A data e hora do evento
	 */
	private java.util.Date data;
	/**
	 * Descri��o da tarefa
	 */
	private  String description;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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

	
	
}
