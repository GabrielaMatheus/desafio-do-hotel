package software.simples.main;

import software.simples.exceptions.*;
import software.simples.models.*;
import software.simples.models.abstracts.*;

public class Principal {
	
	public static void main(String[] agrs) {
		Hotel hotel = new Hotel();
		hotel.setNome("Hotel teste");
		
		Andar andar1 = new Andar(1);
		Andar andar2 = new Andar(2);
		Andar andar3 = new Andar(3);
		
		QuartoSimples quartoSimples1 = new QuartoSimples("Quarto simples 1","desc Quarto simples 1");
		QuartoSimples quartoSimples2 = new QuartoSimples("Quarto simples 2","desc Quarto simples 2");
		QuartoSimples quartoSimples3 = new QuartoSimples("Quarto simples 3","desc Quarto simples 3");
		
		QuartoLuxo quartoLuxo1 = new QuartoLuxo("Quarto luxo 1","desc Quarto luxo 1");
		QuartoLuxo quartoLuxo2 = new QuartoLuxo("Quarto luxo 2","desc Quarto luxo 2");
		QuartoLuxo quartoLuxo3 = new QuartoLuxo("Quarto luxo 3","desc Quarto luxo 3");
		
		
		QuartoCortesia quartoCortesia1 = new QuartoCortesia("Quarto cortesia 1","desc Quarto cortesia 1");
		QuartoCortesia quartoCortesia2 = new QuartoCortesia("Quarto cortesia 2","desc Quarto cortesia 2");
		
		
		Hospede hospede1 = new Hospede("Hospede 1","111.111.111-11");
		Hospede hospede2 = new Hospede("Hospede 2","222.222.222-22");
		Hospede hospede3 = new Hospede("Hospede 3","333.333.333-33");
		Hospede hospede4 = new Hospede("Hospede 4","444.444.444-44");
		Hospede hospede5 = new Hospede("Hospede 5","555.555.555-55");
		
		
		quartoSimples1.adicionarHospede(hospede1);
		quartoSimples2.adicionarHospede(hospede2);
		
		quartoLuxo1.adicionarHospede(hospede4);
		quartoLuxo2.adicionarHospede(hospede3);
		
		//coloca em um quarto que ja tem gente, tratando pra poder continuar o código
		
		try {
			quartoSimples2.adicionarHospede(hospede5);
		}catch(QuartoOcupadoException e) {
			e.getMessage();
		}
		
		//aqui ele tenta remover o hospede desse quarto 
		
		try {
			quartoSimples2.removerHospede();
			
		}catch(QuartoVazioException q) {
			q.getMessage();
		}
		
		//aqui ele tenta adicionar novamente aquele hospede
		try {
			quartoSimples2.adicionarHospede(hospede5);
		}catch(QuartoOcupadoException e) {
			e.getMessage();
		}
		
		
		
		//Adicionando quartos aos andares.
		
		try {
			andar1.adicionarQuarto(1, quartoSimples1) ;
			andar1.adicionarQuarto(1, quartoSimples2);
		}catch(NumeroDoQuartoRepetidoException e) {
			System.out.print(e.getMessage());
		}
		
		
		
		
		try {
			andar2.adicionarQuarto(2, quartoSimples3);
			
			andar2.adicionarQuarto(2, quartoCortesia1);
			andar2.adicionarQuarto(2, quartoCortesia2);
		}catch(NumeroDoQuartoRepetidoException e) {
			System.out.print(e.getMessage());
		}
		

		try {
			andar3.adicionarQuarto(3, quartoLuxo1);
			andar3.adicionarQuarto(3, quartoLuxo2);
			andar3.adicionarQuarto(3, quartoLuxo3);
		}catch(NumeroDoQuartoRepetidoException e) {
			System.out.print(e.getMessage());
		}
		
		//Vinculando andares com o hotel.
		
		hotel.adicionarAndar(andar1);
		hotel.adicionarAndar(andar2);
		hotel.adicionarAndar(andar3);
		
		
		hotel.imprimeDados();
		
		
		//invocar o método pagar da Recepcao
		
		Recepcao.pagar(quartoSimples1, 8);
		Recepcao.pagar(quartoLuxo3, 4);
		
		
	}

}
