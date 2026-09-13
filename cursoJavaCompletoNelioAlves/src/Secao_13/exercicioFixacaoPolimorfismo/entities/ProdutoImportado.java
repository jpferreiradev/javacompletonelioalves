package Secao_13.exercicioFixacaoPolimorfismo.entities;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandega;

    public ProdutoImportado() {

    }

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String etiquetaDePreco() {
        return super.etiquetaDePreco();
    }

    public double precoTotal() {
        return taxaAlfandega + super.getPreco();
    }

    @Override
    public String toString() {
        return super.getNome() + "R$:" + String.format("%.2f",precoTotal()) + "(Taxa alfandega: R$: " + String.format("%.2f",taxaAlfandega);
    }
}
