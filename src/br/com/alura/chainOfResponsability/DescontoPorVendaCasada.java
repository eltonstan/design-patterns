package br.com.alura.chainOfResponsability;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	public double desconta(Orcamento orcamento) {
		if (contemItemDeNome("CANETA", orcamento) && contemItemDeNome("LAPIS", orcamento)) {
			return orcamento.getValor() * 0.05;
		} else {
			return proximo.desconta(orcamento);
		}
	}
	
	public boolean contemItemDeNome(String nomeDoItem, Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if (item.getNome().equals(nomeDoItem)) return true;
        }
        return false;
    }
	
}