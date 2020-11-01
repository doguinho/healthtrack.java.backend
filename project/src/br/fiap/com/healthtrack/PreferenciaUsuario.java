package br.fiap.com.healthtrack;
/**
 * Classe PreferenciaUsuario
 * @author Grupo 8
 * @version 1.0
 */
public abstract class PreferenciaUsuario {
/**
 *  Atributos da Classe	
 */
	/*
	 * PreferenciaUsuario(superclasse) vai passar seus atributos ecomportamento a classe Usuario(subclasse)
	 */
	private boolean vegetariano;
	private boolean vegano;
	private boolean cardiaco;
	private double pesoAlvo;
	private Objetivo objetivo;
/**
 * 	
 * @return se o usuario é vegetariano
 */
	public boolean isVegetariano() {
		return vegetariano;
	}
	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}
/**
 * 
 * @return se o usuario é vegano
 */
	public boolean isVegano() {
		return vegano;
	}
	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}
/**
 * 
 * @return se o usuario tem complicações cardíacas
 */
	public boolean isCardiaco() {
		return cardiaco;
	}
	public void setCardiaco(boolean cardiaco) {
		this.cardiaco = cardiaco;
	}

	public double getPesoAlvo() {
		return pesoAlvo;
	}
	public void setPesoAlvo(double pesoAlvo) {
		this.pesoAlvo = pesoAlvo;
	}
	public Objetivo getObjetivo() {
		return objetivo;
	}
	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
	
	

}
