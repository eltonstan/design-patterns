package br.com.alura.strategy;

public class Conta {
	
	public double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void addSaldo(double saldo) {
		this.saldo += saldo;
	}
	
}
