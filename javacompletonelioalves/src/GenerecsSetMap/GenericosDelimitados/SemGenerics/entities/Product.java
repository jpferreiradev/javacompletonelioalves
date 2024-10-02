package GenerecsSetMap.GenericosDelimitados.SemGenerics.entities;

import EnumaracaoEComposicao.Atividade.entities.Produto;

public class Product {

    // Atributos
    private String nome;
    private Double preco;

    // Construtores
    public Product(){

    }
    public Product(String nome,Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // Get e Set
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    // Método toString
    @Override
    public String toString() {
        return nome + "," + String.format("%2.f",preco);
    }
}
