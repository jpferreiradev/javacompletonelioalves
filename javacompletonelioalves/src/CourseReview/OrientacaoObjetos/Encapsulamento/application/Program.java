package CourseReview.OrientacaoObjetos.Encapsulamento.application;

import CourseReview.OrientacaoObjetos.Encapsulamento.entities.Produto;

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
        Produto produto = new Produto(nome, preco);



        // Usando o métodos GET/SET para acessar ou atualizar o atributo
        produto.setNome("Computador");
        System.out.println("Novo nome do produto" + produto.getNome());
        produto.setPreco(1200.00);
        System.out.println("Novo preço do produto" + produto.getPreco());


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
