package CourseReview.OrientacaoObjetos.Construtores.Exemplo.Sobrecarga.entities;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;


    // Exemplo de construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    // AQUI É UM EXEMPLO DE SOBRECARGA
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public double totalValorStock(){
        return quantidade * preco;
    }
    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome +
                "R$"+
                String.format("%.2f",preco)+
                quantidade+
                "unidades , total: $"+
                String.format("%.2f",totalValorStock());
    }
}
