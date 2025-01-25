package CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.entities;

import org.w3c.dom.ls.LSOutput;

public class Produto {

    public String nome;
    public Double preco;
    public Integer quantidade;



    public double valorTotalStock(){
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){
        // O uso do this
        this.quantidade += quantidade;
    }
    public void removerProduto(int quantidade){
         this.quantidade -= quantidade;
    }

   public String toString(){
        return nome +
                ", R$" +
                String.format("%.2f",preco) +
                ", "+
                quantidade +
                " unidades, TOTAL: R$" +
                 String.format("%.2f", valorTotalStock());



   }
}
