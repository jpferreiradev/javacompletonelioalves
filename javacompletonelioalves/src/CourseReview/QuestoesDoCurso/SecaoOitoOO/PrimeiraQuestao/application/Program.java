package CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.application;

import CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto produto = new Produto();
        System.out.println("Entre com os dados do produto:");
        System.out.print("Nome: ");
        produto.nome = scan.nextLine();
        System.out.print("Preço: ");
        produto.preco = scan.nextDouble();
        System.out.print("Quantidade no stock: ");
        produto.quantidade = scan.nextInt();

        System.out.println();
        System.out.println("Data do produto: " + produto);

        System.out.print("Entre com o número de produtos para ser adicionado ao stock: ");
        int quantidade = scan.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.print("Entre com o numero de produto para serem removidos do stock: ");
        quantidade = scan.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Produtos atualizados: " + produto);




    }
}

//System.out.println(produto); // Implicitamente ele já chama o toString nesse caso aqui
