package br.com.senior.custom;

public class Tarefa {

	 public String id;
    /**
     * Título do evento, uma descrição curta
     */
    public String titulo;
    /**
     * A data e hora do evento
     */
    public java.util.Date data;
    /**
     * Descrição da tarefa
     */
    public String description;

    /**
     * Campos customizados 
     * 
     */
    public String custom;

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

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}
    
    
}
