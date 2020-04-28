package br.com.alura.strategy;

public class Arrojado implements Investimento {

	@Override
	public double calcula(double valorInvestimento) {
		
		double percentage = new java.util.Random().nextDouble();
		
		if (percentage < 0.20) {
			return valorInvestimento * 0.05;	
		} else if (percentage >= 0.20 && percentage < 0.50) {
			return valorInvestimento * 0.03;
		} else {
			return valorInvestimento * 0.06;
		}
		
		
	}


}
