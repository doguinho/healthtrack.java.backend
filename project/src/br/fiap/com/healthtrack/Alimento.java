package br.fiap.com.healthtrack;
/**
 * Classe Alimento
 * @author Grupo 8
 * @version 1.0
 */ 
public class Alimento {
/*
 *  Atributos da Classe	
 */
	private int id;
	private String nome;
	private double calorias;
	private double proteinas;
	private double carboidratos;
	private double gorduras;
	private double fibras;
/** Construtor de Classes
 * Classe Atividade
 * @param id do Alimento
 * @param nome do Alimento
 */
	Alimento(int id,String nome){
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

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getCarboidratos() {
		return carboidratos;
	}

	public void setCarboidratos(double carboidratos) {
		this.carboidratos = carboidratos;
	}

	public double getGorduras() {
		return gorduras;
	}

	public void setGorduras(double gorduras) {
		this.gorduras = gorduras;
	}

	public double getFibras() {
		return fibras;
	}

	public void setFibras(double fibras) {
		this.fibras = fibras;
	}
	
}
