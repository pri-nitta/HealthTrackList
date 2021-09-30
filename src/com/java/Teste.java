package com.java;

import java.util.List;

/**
 * Classe que testa e exibe as informacoes
 * 
 * @author grupo Jarvis
 * @version 1.0
 */

public class Teste {

	public static void main(String[] args) {
		
		/**
		 * Exibe o titulo do historico de corridas
		 */
		
		System.out.println("HISTORICO DE CORRIDAS");
		System.out.println("==================================");
		
		/**
		 * Instancia a lista e chama o metodo para obter os dados da lista
		 */
		List<Corrida> listaCorridas = new CorridaDAO().getAll();

		/**
		 * Exibe os dados da lista
		 */
		for (Corrida corrida: listaCorridas) {
			System.out.println("CORRIDA " + (listaCorridas.indexOf(corrida)+1) + "\n" + corrida);
		}
	}

}
