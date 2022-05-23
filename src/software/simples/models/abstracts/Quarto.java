package software.simples.models.abstracts;

import software.simples.exceptions.QuartoOcupadoException;
import software.simples.exceptions.QuartoVazioException;
import software.simples.models.*;

public abstract class Quarto {
	protected String nome;
	protected String descricao;
	protected Hospede hospede = null;
	
	//criarConstrutor
		public  Quarto(String nome,String descricao) {		
			 this.nome = nome;
			 this.descricao = descricao;
		}
	
		public  void adicionarHospede(Hospede h) throws QuartoOcupadoException{	
			if(this.isOcupado() == true) {
				throw new QuartoOcupadoException(); 
			}else {
				this.hospede = h;
			}	
		}
		
		public void removerHospede() throws QuartoVazioException{
			
			if(this.isVazio() == true) {
				throw new QuartoVazioException(); 
			}else {
				this.hospede = null;
			}
		}
		
		public boolean isOcupado() {
			if(this.hospede != null) {
				  return true;
			  }else {
				  return false;
			  }  
		}
		
		public boolean isVazio() {
			if(this.hospede == null) {
				  return true;
			  }else {
				  return false;
			  } 
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public Hospede getHospede() {
			return hospede;
		}

		public void setHospede(Hospede hospede) {
			this.hospede = hospede;
		}
	
		
		//sobrescrevendo o método toString
		public String toString() {
			return "Nome: "+getNome() + " Descrição: " + getDescricao() + " Hóspede: " + getHospede(); 
		}
	
	
	

}
