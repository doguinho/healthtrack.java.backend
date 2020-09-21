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
	private String nomeUsuario;
	
	public Usuario(int id){
		this.id = id;
	}
	
	public Usuario(String nomeUsuario){
		this.nomeUsuario = nomeUsuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


}
