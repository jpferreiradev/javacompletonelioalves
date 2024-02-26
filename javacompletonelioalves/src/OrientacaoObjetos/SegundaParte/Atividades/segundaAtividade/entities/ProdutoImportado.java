package OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities;

public class ProdutoImportado extends Produto {

    private Double taxaDaAlfandega;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double taxaDaAlfandega) {
        super(nome, preco);
        this.taxaDaAlfandega = taxaDaAlfandega;
    }

    public Double getTaxaDaAlfandega() {
        return taxaDaAlfandega;
    }

    public void setTaxaDaAlfandega(Double taxaDaAlfandega) {
        this.taxaDaAlfandega = taxaDaAlfandega;
    }

    @Override
    public String etiquetaDePreco() {
        return super.etiquetaDePreco() + "(Taxa da Alfândega $" + taxaDaAlfandega + ")";
    }

    public Double precoTotal(){
        return taxaDaAlfandega + super.getPreco();
    }
}
