package br.com.alura.strategy;

public class TesteDeInvestimentos {

	public static void main(String[] args) {
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();

		Conta conta = new Conta(0.0);
		
		RealizadorDeInvestimentos realizaInvestimentos = new RealizadorDeInvestimentos();
		
		double valorConservador = realizaInvestimentos.realizaInvestimento(50.0, conservador);
		conta.addSaldo(valorConservador);
		System.out.println(conta.getSaldo());
		
		double valorModerado = realizaInvestimentos.realizaInvestimento(50.0, moderado);
		conta.addSaldo(valorModerado);
		System.out.println(conta.getSaldo());
		
		double valorArrojado = realizaInvestimentos.realizaInvestimento(50.0, arrojado);
		conta.addSaldo(valorArrojado);
		System.out.println(conta.getSaldo());

	}
}
