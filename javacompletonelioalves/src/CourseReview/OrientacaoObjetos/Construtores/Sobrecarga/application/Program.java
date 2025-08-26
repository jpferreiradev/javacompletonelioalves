package CourseReview.OrientacaoObjetos.Construtores.Sobrecarga.application;

import CourseReview.OrientacaoObjetos.Construtores.Sobrecarga.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine(); // Variavel temporario, ou auxiliar;
        System.out.print("Preço: ");
        double preco = scan.nextDouble();
        //System.out.print("Quantidade no stock:");
        //int quantidadeStock = scan.nextInt();

        Produto produto = new Produto(nome, preco);

        System.out.println();
        System.out.println("Datas do produto:" + produto);

        System.out.println("Entre com o número de produtos para ser adicionada ao stock: ");
        int quantidade = scan.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println("Entre com o número do produto para serem removidos ao stock: ");
        quantidade = scan.nextInt();
        produto.removerProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados " + produto);

    }
}
