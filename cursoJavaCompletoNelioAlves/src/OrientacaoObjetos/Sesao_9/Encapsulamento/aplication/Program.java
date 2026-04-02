package OrientacaoObjetos.Sesao_9.Encapsulamento.aplication;

import OrientacaoObjetos.Sesao_9.Encapsulamento.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Preço: ");
        double preco = scan.nextDouble();
        System.out.print("Quantidade no estoque: ");
        int quantidade = scan.nextInt();
        Produto produto = new Produto(nome, preco, quantidade);

        produto.setNome( "Computador");
        System.out.println("Nome atualizado:" + produto.getNome());


        System.out.println();
        System.out.println("Data do produto: " + produto);

        System.out.print("Entre com número de produtos para ser adicionado ao estoque: ");

        produto.adicionarQuantidade(scan.nextInt());
        System.out.println("\nData atualizada: " + produto);
        System.out.print("Entre com o número de produto para serem removidos do estoque: ");
        produto.removerQuantidade(scan.nextInt());
        System.out.println("\nData atualizada: " + produto);

        scan.close();
    }

}

//System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);