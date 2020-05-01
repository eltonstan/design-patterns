package br.com.alura.state;

class Finalizado implements EstadoDeUmOrcamento { 
    public void aplicaDescontoExtra(Orcamento orcamento) {
      throw new RuntimeException("Or�amentos finalizados n�o recebem desconto extra!");
    }

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o podem ser aprovados");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or�amentos finalizados n�o podem ser finalizados");
	}
}