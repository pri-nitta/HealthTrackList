package com.java;

import java.io.Serializable;

/**
 * Super Classe que abstrai uma atividade fisica
 * 
 * @author grupo Jarvis
 * @version 1.0
 */

public class AtividadeFisica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Data em que foi feita a atividade
	 */
	private String data;

	/**
	 * Tempo gasto ao fazer a atividade fisica
	 */
	private double duracao;

	/**
	 * Intensidade da atividade fisica
	 */
	private String intensidade;

	/**
	 * Quantidade de calorias gastas durante a atividade fisica
	 */
	private int caloriasGastas;

	/**
	 * Construtor padrao
	 */
	public AtividadeFisica() {

	}

	/**
	 * Constructor Atividade Fisica
	 * 
	 * @param data
	 * @param duracao
	 * @param intensidade
	 * @param caloriasGastas
	 */
	public AtividadeFisica(String data, double duracao, String intensidade, int caloriasGastas) {
		this.data = data;
		this.duracao = duracao;
		this.intensidade = intensidade;
		this.caloriasGastas = caloriasGastas;
	}

	/**
	 * Verifica a duracao da atividade fisica
	 * 
	 * @return duracao
	 */
	public double getDuracao() {
		return duracao;
	}

	/**
	 * Altera a duracao da atividade fisica
	 * 
	 * @param duracao
	 */
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	/**
	 * Verifica a intensidade da atividade fisica
	 * 
	 * @return intensidade
	 */
	public String getIntensidade() {
		return intensidade;
	}

	/**
	 * Altera a intensidade da atividade fisica
	 * 
	 * @param intensidade
	 */
	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	/**
	 * Verifica as calorias gastas durante a atividade fisica
	 * 
	 * @return caloriasGastas
	 */
	public int getCaloriasGastas() {
		return caloriasGastas;
	}

	/**
	 * Altera as calorias gastas durante a atividade fisica
	 * 
	 * @param caloriasGastas
	 */
	public void setCaloriasGastas(int caloriasGastas) {
		this.caloriasGastas = caloriasGastas;
	}

	/**
	 * Verifica a data
	 * 
	 * @return data
	 */
	public String getData() {
		return data;
	}

	/**
	 * Altera a data
	 * 
	 * @param data
	 */
	public void setData(String data) {
		this.data = data;
	}

}
