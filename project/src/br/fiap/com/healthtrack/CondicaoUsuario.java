package br.fiap.com.healthtrack;

import java.util.Date;
/**
 * Classe CondicaoUsuario
 * @author Grupo 8
 * @version 1.0
 */
public class CondicaoUsuario {
/*
 *  Atributos da Classe	
 */	
	private int id;
	private Usuario usuario;
	private double peso;
	private double altura;
	private double gorduraCorporal;
	private Date data;
/** Construtor de Classes
 * Classe CondicaoUsuario
 * @param Id da Condição do Usuario
 */	
	public CondicaoUsuario(Date data, Usuario usuario) {
		this.data = data;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
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
		return this.peso / (this.altura * this.altura);
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
