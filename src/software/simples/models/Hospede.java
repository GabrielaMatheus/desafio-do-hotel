package software.simples.models;

public class Hospede {
	
	private String nome;
	private String rg;
	
	public Hospede(String nome, String rg){
		this.nome = nome;
		this.rg=rg;
		
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	//sobrescrevendo o m�todo toString
	public String toString() {
		return "Nome: "+getNome() + " RG: " + getRg(); 
	}
	
	
		
	

}
