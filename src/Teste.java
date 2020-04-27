
public class Teste {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500.0);

		Imposto novoImposto = new ICCC();
		System.out.println(novoImposto.calcula(reforma));
		
		Orcamento reforma2 = new Orcamento(1500.0);
		Imposto novoImposto2 = new ICCC();
		System.out.println(novoImposto2.calcula(reforma2));
		
		Orcamento reforma3 = new Orcamento(4000.0);
		Imposto novoImposto3 = new ICCC();
		System.out.println(novoImposto3.calcula(reforma3));
	}

}
