package com.java;

/**
 * Classe que abstrai uma corrida
 * 
 * @author grupo Jarvis
 * @version 1.0
 */

public class Corrida extends AtividadeFisica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Ritmo medio do tempo por cada km
	 */
	private double pace;

	/**
	 * Distancia total percorrida
	 */
	private int distancia;

	/**
	 * Tipo de pista da corrida
	 */
	private String tipoDePista;

	/**
	 * Construtor padrao
	 */
	public Corrida() {

	}

	/**
	 * Construtor corrida
	 * 
	 * @param data dia, mes e ano que foi feita a corrida
	 * @param duracao tempo da corrida
	 * @param intensidade mede o esforco durante a corrida
	 * @param caloriasGastas quanto de energia em kcal o corredor gastou
	 * @param distancia quantos kms o corredor percorreu
	 * @param tipoDePista como era o local onde o corredor correu
	 */
	public Corrida(String data, double duracao, String intensidade, int caloriasGastas, int distancia,
			String tipoDePista) {
		super(data, duracao, intensidade, caloriasGastas);
		this.distancia = distancia;
		this.tipoDePista = tipoDePista;
	}

	/**
	 * Verifica o pace
	 * 
	 * @return pace
	 */
	public double getPace() {
		return super.getDuracao() / distancia;
	}

	/**
	 * Altera o pace
	 * 
	 * @param pace tempo gasto por cada km corrido
	 */
	public void setPace(double pace) {
		this.pace = pace;
	}

	/**
	 * Verifica a distancia percorrida
	 * 
	 * @return distancia
	 */
	public int getDistancia() {
		return distancia;
	}

	/**
	 * Altera a distancia percorrida
	 * 
	 * @param distancia quantos kms o corredor percorreu
	 */
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	/**
	 * Verifica o tipo de pista
	 * 
	 * @return tipoDePista
	 */
	public String getTipoDePista() {
		return tipoDePista;
	}

	/**
	 * Altera o tipo de pista
	 * 
	 * @param tipoDePista como era o local onde o corredor correu
	 */
	public void setTipoDePista(String tipoDePista) {
		this.tipoDePista = tipoDePista;
	}

	/**
	 * Auxilia a impressao da informacao formatada
	 */
	@Override
	public String toString() {
		return "Data: " + getData() + "\n" + "Duração: " + getDuracao() + " min\n" + "Calorias Gastas: "
				+ getCaloriasGastas() + " kcal\n" + "Intensidade: " + getIntensidade() + "\n" + "Distância: "
				+ distancia + " km\n" + "Tipo de pista: " + tipoDePista + "\n" + "Pace: " + getPace() + " min/km \n"
				+ "----------------------------------";

	}
}
