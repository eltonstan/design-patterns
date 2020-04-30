package br.com.alura.Decorator;

public class ISS extends Imposto {

    public ISS(Imposto outroImposto) {
        super(outroImposto);
    }
    
    public ISS() {
    }

    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1 + calculoDoOutroImposto(orcamento);
    }

}