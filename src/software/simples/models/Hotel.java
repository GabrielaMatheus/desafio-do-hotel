package software.simples.models;

import java.util.*;


public class Hotel {
	
	private String nome;
	private List<Andar> andares;
	
	public Hotel() {
		this.andares = new ArrayList<Andar>();
	}
	
	public void adicionarAndar(Andar a) {
		andares.add(a);
	}
	
	public void imprimeDados() {
	   System.out.println("Dados do Hotel:");
 	   System.out.println("Nome: "+this.nome);
 	   for(int aux = 0; aux<andares.size(); aux++) {
 		   System.out.println("Lista de Andares: "+ this.andares.get(aux));   
 	   } 
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Andar> getAndares() {
		return andares;
	}

	public void setAndares(List<Andar> andares) {
		this.andares = andares;
	}
	
	

}
