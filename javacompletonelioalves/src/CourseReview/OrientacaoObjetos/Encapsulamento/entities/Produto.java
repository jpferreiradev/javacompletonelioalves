package CourseReview.OrientacaoObjetos.Encapsulamento.entities;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;


    // Aqui temos 3 construtores
    public Produto(){

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Não foi feito o setQuantidade por uma questão de segurança e intreguidade do valor da quantidade;
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
