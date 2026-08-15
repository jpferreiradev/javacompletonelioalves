package Secao_09.exemploConstrutores.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public Produto() {

    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

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
