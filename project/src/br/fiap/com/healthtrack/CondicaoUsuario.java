package br.fiap.com.healthtrack;

import java.util.Date;
/**
 * Classe CondicaoUsuario
 * @author Grupo 8
 * @version 1.0
 */
public class CondicaoUsuario extends Usuario {
/*
 *  Atributos da Classe	
 */	
	private int id;
	private Usuario usuario;
	private double peso;	
	private double gorduraCorporal;
	private Date data;
/** Construtor de Classes
 * Classe CondicaoUsuario
 * @param Id da Condi��o do Usuario
 */	
	public CondicaoUsuario(Usuario usuario) {
		super(usuario.getId());		
		this.usuario = usuario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getGorduraCorporal() {
		return gorduraCorporal;
	}
	public void setGorduraCorporal(double gorduraCorporal) {
		this.gorduraCorporal = gorduraCorporal;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getIMC() {
		return this.peso / (this.getAltura() * this.getAltura());
	}
	public String resultadoIMC() {
		
		double imc = this.getIMC();
/**
 * Diferentes niveis do IMC, dependendo do resultado ele retorna um nivel especifico		
 */
		if( imc > 30 ) {
			return "Obesidade";
		} else if (imc > 25) {
			return "Acima do peso normal";
		} else if (imc > 18.5) {
			return "Peso normal";
		} else {
			return "Abaixo do peso normal";
		}
			
					
	}
	

}
