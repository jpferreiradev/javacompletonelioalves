package OrientacaoObjetos.Sesao_9.Construtores.entities;

public class Produto {

    public String nome;
    public Double preco;
    public int quantidade;

    public Produto(){ // Construtor padrão

    }

    // Exemplo de SOBERCARGA
    public Produto(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;

    }


    public Double valorTotalProduto() {
        return preco * quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
        //this.quantidade = this.quantidade + quantidade; -> Seria isso aqui;
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
