package br.com.alura.strategy;

public class Moderado implements Investimento {

	@Override
	public double calcula(double valorInvestimento) {
		
		boolean escolhido = new java.util.Random().nextDouble() > 0.50;
		
		if (escolhido) {
			return valorInvestimento * 0.08;	
		} else {
			return valorInvestimento * 0.07;
		}
		
		
	}


}
