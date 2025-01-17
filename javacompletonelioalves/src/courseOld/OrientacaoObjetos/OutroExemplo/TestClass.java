package courseOld.OrientacaoObjetos.OutroExemplo;

import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Product produto = new Product();


        // Leitura dos dados
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produto.nome = scan.nextLine();
        System.out.print("Price: ");
        produto.preco = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        produto.quantidade = scan.nextInt();

        System.out.println();
        System.out.println("Data do produto:" + produto);

        System.out.println();
        System.out.print("Entre com a quantidade para adicionar mais  produtos: ");
        int novaQuantidade = scan.nextInt();
        produto.addProducts(novaQuantidade); // Aqui faz a atualização da quantidade de produtos dentro do objeto

        System.out.println();
        System.out.println("Update da data" + produto);

        System.out.print("Entre com a quantidade para remover o produto");
        novaQuantidade = scan.nextInt();
        produto.removeProducts(novaQuantidade);

        System.out.println();
        System.out.println("Valor do produto removido: " + produto);






        // Impressão provisoria
        //System.out.println(produto1.nome + "," + produto1.preco + "," + produto1.quantidade);



    }
}

/*
        System.out.println("Entre com o nome do produto: ");
        produto1.nome = scan.nextLine();
        System.out.println("Entre com o preço:");
        produto1.preco = scan.nextDouble();
        System.out.println("Entre com a quantidade de stock:");
        produto1.quantidade = scan.nextInt();
 */