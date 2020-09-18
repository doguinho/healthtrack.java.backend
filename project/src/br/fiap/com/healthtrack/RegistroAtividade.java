package br.fiap.com.healthtrack;

import java.util.Date;
/**
 * Classe RegistroAtividade
 * @author Grupo 8
 * @version 1.0
 */
public class RegistroAtividade {
	
	private int id;
	private Atividade atividade;
	private Usuario usuario;
	private double passos;
	private double minBatimentos;
	private double maxBatimentos;
	private Date datainicio;
	private Date dataFim;
	private double caloriasGastas;
	
	RegistroAtividade(int id, Atividade atividade, Usuario usuario) {
		this.id = id;
		this.atividade = atividade;
		this.usuario = usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public double getPassos() {
		return passos;
	}

	public void setPassos(double passos) {
		this.passos = passos;
	}

	public double getMinBatimentos() {
		return minBatimentos;
	}

	public void setMinBatimentos(double minBatimentos) {
		this.minBatimentos = minBatimentos;
	}

	public double getMaxBatimentos() {
		return maxBatimentos;
	}

	public void setMaxBatimentos(double maxBatimentos) {
		this.maxBatimentos = maxBatimentos;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public double getCaloriasGastas() {
		return caloriasGastas;
	}

	public void setCaloriasGastas(double caloriasGastas) {
		this.caloriasGastas = caloriasGastas;
	}

}
