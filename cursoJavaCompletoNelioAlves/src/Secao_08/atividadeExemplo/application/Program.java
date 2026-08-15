package Secao_08.atividadeExemplo.application;


import Secao_08.atividadeExemplo.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        produto.nome = scan.nextLine();
        System.out.print("Preço: ");
        produto.preco = scan.nextDouble();
        System.out.print("Quantidade em stock: ");
        produto.quantidade = scan.nextInt();

        System.out.println();
        System.out.println("Data do produto" + produto);

        System.out.print("Entre com o número de produtos para ser adicionado ao estoque: ");
        int valor = scan.nextInt();
        produto.adicionarProduto(valor); //

        System.out.println();
        System.out.println("Atualização do produto" + produto);

        System.out.print("Entre com o número para remover os produtos ao estoque: ");
        valor = scan.nextInt();
        produto.removeProduto(valor);
        System.out.println("Atualização do produto" + produto);


    }
}
