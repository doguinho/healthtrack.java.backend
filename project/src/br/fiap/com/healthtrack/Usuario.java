package br.fiap.com.healthtrack;

import java.sql.Blob;
import java.util.Date;

/**
 * Classe Usuario
 * @author Grupo 8
 * @version 1.0
 */
public class Usuario extends PreferenciaUsuario {
/*
 * Usuario(subclasse) É uma classe derivada da classe PreferenciaUsuario(superclasse)
 */
	private int id;
	private String nome;
	private String sobrenome;
	private String email;
	private Date dataNascimento;
	private char sexo;
	private String senha;
	private Blob foto; 
	private double altura;
	
	public Usuario() {}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public char getSexo() {
		return sexo;
	}

	/**
	 * 
	 * @param sexo 'M' ou 'F'
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Blob getFoto() {
		return foto;
	}

	public void setFoto(Blob foto) {
		this.foto = foto;
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
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}


}
