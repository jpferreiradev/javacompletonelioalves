package Secao_13.exemploPolimorfismo.entities;

public class ContaPoupanca extends Conta {

    private Double taxaDeJuro;

    public ContaPoupanca(Double taxaDeJuro) {
        super();
    }

    public ContaPoupanca(Integer numero, String titular, Double saldoDaConta, Double taxaDeJuro) {
        super(numero, titular, saldoDaConta);
        this.taxaDeJuro = taxaDeJuro;
    }

    public Double getTaxaDeJuro() {
        return taxaDeJuro;
    }

    public void setTaxaDeJuro(Double taxaDeJuro) {
        this.taxaDeJuro = taxaDeJuro;
    }

    public void atualizaSaldo() {
        saldoDaConta += saldoDaConta * taxaDeJuro;
    }

    @Override
    public void saque(double saldo) {
        saldoDaConta -= saldo;
    }
}
