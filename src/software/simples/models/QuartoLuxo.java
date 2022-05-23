package software.simples.models;

import software.simples.models.abstracts.*;
import software.simples.interfaces.*;

public class QuartoLuxo extends Quarto implements Faturavel{
	private static final double VALOR_DIARIA = 450.00;

	public QuartoLuxo(String nome,String descricao) {
		super(nome, descricao);
	}

	
	@Override
	public  double faturar(double qtdDias) {
		double valor = (QuartoLuxo.VALOR_DIARIA * qtdDias);
		System.out.print("Valor a pagar: " );
		return valor;
	}
	

	

}
