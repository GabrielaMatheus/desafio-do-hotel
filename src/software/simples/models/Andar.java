package software.simples.models;

import software.simples.models.abstracts.*;
import java.util.*;

import software.simples.exceptions.NumeroDoQuartoRepetidoException;
import software.simples.models.*;

public class Andar {
	private int numero;
	private Map<Integer,Quarto> mapaDeQuartos ;
	
	public Andar(int Andar) {
		this.numero = Andar;
		this.mapaDeQuartos = new HashMap<Integer,Quarto>();
	}
	
	public void adicionarQuarto(Integer numero, Quarto quarto) throws NumeroDoQuartoRepetidoException{
		//this.mapaDeQuartos = new HashMap<Integer,Quarto>();
		
		//verifica se a chave é repetida
		if(mapaDeQuartos.containsKey(quarto)) {
			throw new NumeroDoQuartoRepetidoException(); 
			
		}else {
			this.mapaDeQuartos.put(numero, quarto);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Map<Integer, Quarto> getMapaDeQuartos() {
		return mapaDeQuartos;
	}

	public void setMapaDeQuartos(Map<Integer, Quarto> mapaDeQuartos) {
		this.mapaDeQuartos = mapaDeQuartos;
	}
	
	
	//sobrescrevendo o método toString
	public String toString() {
		return "Número: "+getNumero() ; 
	}



}
