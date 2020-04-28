package br.com.alura.chainOfResponsability;

public interface Desconto {
	double desconta(Orcamento orcamento);

	void setProximo(Desconto proximo);
}