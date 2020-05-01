package br.com.alura.state;

class Orcamento {
	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual; // veja a mudança aqui

	public Orcamento(double valor) {
		this.estadoAtual = new EmAprovacao();
		this.valor = valor;
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public EstadoDeUmOrcamento getEstadoAtual() {
		return estadoAtual;
	}

	public void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}

}
