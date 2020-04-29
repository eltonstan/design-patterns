package TemplateMethod;

public class TestaDeImpostos {
	
	public static void main(String[] args) {
		
		// Taxa maxima somente ICPP
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionaItem(new Item("CANETA", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		orcamento.adicionaItem(new Item("LAPIS", 100.0));
		
		// Taxa maxima ICPP e IKCV
		Orcamento orcamento2 = new Orcamento(600.0);
		orcamento2.adicionaItem(new Item("CANETA", 300.0));
		orcamento2.adicionaItem(new Item("LAPIS", 300.0));
		
		// Taxa minima ICPP e IKCV
		Orcamento orcamento3 = new Orcamento(500.0);
		orcamento3.adicionaItem(new Item("CANETA", 250.0));
		orcamento3.adicionaItem(new Item("LAPIS", 250.0));
		
		ICPP icpp = new ICPP();
		System.out.println(icpp.calcula(orcamento));
		System.out.println(icpp.calcula(orcamento2));
		System.out.println(icpp.calcula(orcamento3));
		
		IKCV ikcv = new IKCV();
		System.out.println(ikcv.calcula(orcamento));
		System.out.println(ikcv.calcula(orcamento2));
		System.out.println(ikcv.calcula(orcamento3));
		
	}

}
