package br.com.alura.Decorator;

public class TesteDeImpostosComplexos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(500.0);
		
		Imposto iss = new ISS();
		double valor2 = iss.calcula(orcamento);
		System.out.println("ISS: " + valor2);
		
		Imposto icms = new ICMS();
		double valor3 = icms.calcula(orcamento);
		System.out.println("ICMS: " + valor3);
		
		Imposto issComIcms = new ISS(new ICMS());
		double valor = issComIcms.calcula(orcamento);
		System.out.println("ISS com ICMS: " + valor);
		
	}
}
