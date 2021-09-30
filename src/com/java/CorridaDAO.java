package com.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que simula um Data access object de corrida
 * 
 * @author grupo Jarvis
 * @version 1.0
 */

public class CorridaDAO {
	
	/**
	 * Recupera todos os dados inseridos na lista
	 * @return listaCorridas
	 */
	
	public List<Corrida> getAll(){
		
		List<Corrida> listaCorridas = new ArrayList<>();
		listaCorridas.add(new Corrida("01/09/2021",31.0,"Media", 311, 5,"Rua asfaltada"));
		listaCorridas.add(new Corrida("02/09/2021",29.0,"Media", 360, 5,"Rua de terra"));
		listaCorridas.add(new Corrida("03/09/2021",35.0,"Baixa", 290, 5,"Parque"));
		listaCorridas.add(new Corrida("04/09/2021",28.0,"Alta", 400, 5,"Rua asfaltada"));
		listaCorridas.add(new Corrida("05/09/2021",40.8,"Media", 410, 6,"Rua asfaltada"));
		listaCorridas.add(new Corrida("06/09/2021",32.0,"Media", 370, 5,"Rua de terra"));
		listaCorridas.add(new Corrida("07/09/2021",28.5,"Media", 373, 5,"Rua asfaltada"));
		listaCorridas.add(new Corrida("08/09/2021",27.9,"Media", 375, 5,"Parque"));
		listaCorridas.add(new Corrida("09/09/2021",27.5,"Media", 380, 5,"Rua asfaltada"));
		listaCorridas.add(new Corrida("10/09/2021",26.8,"Alta", 420, 5,"Parque"));
		listaCorridas.add(new Corrida("11/09/2021",25.7,"Alta", 410, 5,"Rua asfaltada"));
		listaCorridas.add(new Corrida("12/09/2021",26.8,"Alta", 400, 5,"Rua asfaltada"));
		
		return listaCorridas;
	}

}
