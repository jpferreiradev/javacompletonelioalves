package OrientacaoObjetos.This;

public class Exemple {

    public String nome;
    public double preco;
    public int quantidade;


    public Exemple(){ // Exemplo de construtor padrão, porém ele já é automatico

        }

    public Exemple(String nome,double preco,int quantidade){ // Exemplo de construtor com parametro e uso do this
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}
