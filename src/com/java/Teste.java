package com.java;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
		System.out.println("HISTORICO DE CORRIDAS");
		System.out.println("==================================");
		
		List<Corrida> listaCorridas = new CorridaDAO().getAll();

		for (Corrida corrida: listaCorridas) {
			System.out.println("CORRIDA " + listaCorridas.indexOf(listaCorridas) + "\n" + corrida);
		}
	}

}
