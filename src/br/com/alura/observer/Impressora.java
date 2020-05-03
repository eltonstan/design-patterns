package br.com.alura.observer;

public class Impressora implements AcaoAposGerarNota {
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("imprimindo notaFiscal");
	}
}