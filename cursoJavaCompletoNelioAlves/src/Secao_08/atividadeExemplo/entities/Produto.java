package Secao_08.atividadeExemplo.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double precoTotal() {
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade) {
        this.quantidade += quantidade; // entrada de produtos
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade; // saida de produtos
    }

    public String toString() {
        return nome
                + ", R$ "
                + String.format("%.2f", preco)
                + ", "
                + quantidade
                + " unidades, total: R$ "
                + String.format("%.2f", precoTotal());
    }
}
