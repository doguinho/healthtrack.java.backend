package br.fiap.com.healthtrack;
/**
 * Classe Atividade
 * @author Grupo 8
 * @version 1.0
 */
public class Atividade {
/*
 *  Atributos da Classe
 */
	private int id;
	private String nome;
	private double caloriasPorMinuto;
/** Construtor de Classes
 * Classe Atividade
 * @param id da Atividade
 * @param nome da Atividade
 */
	public Atividade(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Atividade(String nome, double caloriasPorMinuto) {
		this.nome = nome;
		this.caloriasPorMinuto = caloriasPorMinuto;
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

	public double getCaloriasPorMinuto() {
		return caloriasPorMinuto;
	}

	public void setCaloriasPorMinuto(double caloriasPorMinuto) {
		this.caloriasPorMinuto = caloriasPorMinuto;
	}
	
	

}
