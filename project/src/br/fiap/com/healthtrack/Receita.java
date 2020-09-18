package br.fiap.com.healthtrack;

import java.util.List;
/**
 * Classe Receita
 * @author Grupo 8
 * @version 1.0
 */
public class Receita {
			
	private int id;
	private String titulo;
	private byte foto;
	private String preparo;
	private List<Alimento> alimentos;
	
	Receita(int id, String titulo){
		this.id = id;
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public byte getFoto() {
		return foto;
	}

	public void setFoto(byte foto) {
		this.foto = foto;
	}

	public String getPreparo() {
		return preparo;
	}

	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}
	
	public void addAlimento(Alimento a) {
		this.alimentos.add(a);
	}

}
