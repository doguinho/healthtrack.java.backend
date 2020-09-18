package br.fiap.com.healthtrack;
/**
 * Classe Usuario
 * @author Grupo 8
 * @version 1.0
 */
public class Usuario extends PreferenciaUsuario {
/*
 * Usuario(subclasse) é uma classe derivada da classe PreferenciaUsuario(superclasse)
 */
	private int id;
	private String nome;
	
	Usuario(int id, String nome){
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
