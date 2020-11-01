package br.fiap.com.healthtrack;
/**
 * Classe Objetivo
 * @author Grupo 8
 * @version 1.0
 */
public class Objetivo {
/*
 *  Atributos da Classe	
 */	
	private int id;
	private String titulo;


	public Objetivo(int id,String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
