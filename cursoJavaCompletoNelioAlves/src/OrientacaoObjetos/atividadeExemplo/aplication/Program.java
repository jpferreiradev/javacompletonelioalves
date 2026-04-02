package OrientacaoObjetos.atividadeExemplo.aplication;

import OrientacaoObjetos.atividadeExemplo.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto produto = new Produto();
        // Leitura dos dados do produto
        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        produto.nome = scan.nextLine();
        System.out.print("Preço: ");
        produto.preco = scan.nextDouble();
        System.out.print("Quantidade no estoque: ");
        produto.quantidade = scan.nextInt();
        System.out.println();
        System.out.println("Data do produto: " + produto);

        System.out.print("Entre com número de produtos para ser adicionado ao estoque: ");
        //int valor = scan.nextInt();
        produto.adicionarQuantidade(scan.nextInt()); //Atualização da quantidade em estoque
        System.out.println("\nData atualizada: " + produto);
        System.out.print("Entre com o número de produto para serem removidos do estoque: ");
        //valor = scan.nextInt();
        produto.removerQuantidade(scan.nextInt());// Atualização da remoção da quantidade de estoque!
        System.out.println("\nData atualizada: " + produto);

        scan.close();
    }

}

//System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);