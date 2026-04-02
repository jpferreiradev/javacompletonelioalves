package OrientacaoObjetos.atividadeExemplo.entities;

public class Produto {

    public String nome;
    public Double preco;
    public Integer quantidade;

    public Produto(){

    }

    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Double valorTotalProduto(){
        return preco * quantidade;
    }

    public void adicionarQuantidade(Integer quantidade){
        this.quantidade += quantidade;
    }
    public void removerQuantidade(Integer quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", preco)
                + ","
                + quantidade
                + " unidades, total: R$ "
                + String.format("%.2f", valorTotalProduto());

    }
}
