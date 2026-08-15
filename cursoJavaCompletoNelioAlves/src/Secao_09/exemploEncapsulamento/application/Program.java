package Secao_09.exemploEncapsulamento.application;


import Secao_09.exemploEncapsulamento.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto produto;

        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Preço: ");
        double preco = scan.nextDouble();

        produto = new Produto(nome, preco);

        produto.setNome("Computador");
        System.out.println("Nome atualizado:" + produto.getNome());

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
