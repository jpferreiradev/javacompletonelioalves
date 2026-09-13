package Secao_13.exercicioFixacaoPolimorfismo.entities;

public class Produto {

    private String nome;
    private Double preco;

    public Produto() {

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

    public String etiquetaDePreco() {
        return "Preço: " + preco;
    }

    @Override
    public String toString() {
        return nome + "R$ " + String.format("%.2f",preco);

    }
}
