package br.com.alura.state;

class Reprovado implements EstadoDeUmOrcamento {
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser aprovados");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos reprovados não podem ser finalizados");
	}
}