package OrientacaoObjetos.Sesao_9.Construtores.aplication;

import OrientacaoObjetos.Sesao_9.Construtores.entities.Produto;

import java.util.Locale;
import java.util.Scanner;


public class Program2 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Preço: ");
        double preco = scan.nextDouble();

        Produto produto = new Produto(nome,preco);
        System.out.println();
        System.out.println("Data do produto: " + produto);

        System.out.print("Entre com número de produtos para ser adicionado ao estoque: ");
        int valor = scan.nextInt();
       produto.adicionarQuantidade(valor);//Atualização da quantidade em estoque
        System.out.println("\nData atualizada: " + produto);

        System.out.print("Entre com o número de produto para serem removidos do estoque: ");
        valor = scan.nextInt();
        produto.removerQuantidade(valor);// Atualização da remoção da quantidade de estoque!
        System.out.println("\nData atualizada: " + produto);

        scan.close();
    }


}

