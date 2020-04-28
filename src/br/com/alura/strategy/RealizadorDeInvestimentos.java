package br.com.alura.strategy;

public class RealizadorDeInvestimentos {

	public double realizaInvestimento(double valorInvestimento, Investimento investimento) {
		return investimento.calcula(valorInvestimento);
	}

}