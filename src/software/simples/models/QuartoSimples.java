package software.simples.models;

import software.simples.models.abstracts.*;
import software.simples.interfaces.*;

public class QuartoSimples extends Quarto implements Faturavel{
	private static final double VALOR_DIARIA = 87.90;
	
	public QuartoSimples(String nome,String descricao) {
		super(nome, descricao);
	}
	

	@Override
	public  double faturar(double qtdDias) {
		double valor = (QuartoSimples.VALOR_DIARIA * qtdDias);
		System.out.print("Valor a pagar: " );
		return valor;
	}
	

}
