package OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities;

import java.util.Date;

public class ProdutoUsado extends Produto{

    private Date dataDeFabricacao;

    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaDePreco() {
        return super.getNome() + "(Usado) $" + getPreco() +
                "(Dados de fabricação" + new Date() +")";

    }
}
