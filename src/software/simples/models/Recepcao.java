package software.simples.models;

import software.simples.interfaces.*;

public class Recepcao {
	
	
	private Recepcao() {
	}
	
	public static void pagar(Faturavel f, int qtdDeDiarias){
		System.out.println(f.faturar(qtdDeDiarias));
	}
	
	

}
