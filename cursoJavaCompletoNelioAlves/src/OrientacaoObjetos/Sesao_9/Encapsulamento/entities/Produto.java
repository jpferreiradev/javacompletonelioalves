package OrientacaoObjetos.Sesao_9.Encapsulamento.entities;

public class Produto {

    private String nome;
    private Double preco;
    private int quantidade;

    public Produto() {

    }


    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public Double valorTotalProduto() {
        return preco * quantidade;
    }

    // A quantidade dos produtos só podem entrar e sair com os seus metodos e não com o seu set;
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
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
