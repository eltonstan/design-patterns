package br.com.alura.strategy;

public class Conservador implements Investimento {

	@Override
	public double calcula(double valorInvestimento) {
		return valorInvestimento * 0.08;
	}


}
