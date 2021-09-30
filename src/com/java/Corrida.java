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
	 * Constructor Corrida
	 * 
	 * @param pace
	 * @param distancia
	 * @param tipoDePista
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
	 * @param pace
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
	 * @param distancia
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
	 * @param tipoDePista
	 */
	public void setTipoDePista(String tipoDePista) {
		this.tipoDePista = tipoDePista;
	}
	
	@Override
	public String toString() {
		return "Data: "+ getData() +"\n"
				+"Duração: " + getDuracao() + " min\n"
				+"Calorias Gastas: " + getCaloriasGastas() +" kcal\n" 
				+"Intensidade: " + getIntensidade() +"\n"
				+"Distância: " + distancia + " km\n"
				+"Tipo de pista: " + tipoDePista + "\n"
				+"Pace: " + getPace() + " min/km \n"
				+"----------------------------------";	
		
	}
}
