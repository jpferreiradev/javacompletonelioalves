package Secao_10.exemploVetorTIposReferencia.application;

import Secao_10.exemploVetorTIposReferencia.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class exemploVetorTipoReferencia {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Produto[] produtos = new Produto[n];


        for (int i = 0; i < produtos.length; i++) {
            scan.nextLine(); // consumir
            String nome = scan.nextLine();
            double preco = scan.nextDouble();
            produtos[i] = new Produto(nome, preco);
        }

        double somaVolores = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            somaVolores = somaVolores + produtos[i].getValor();
        }

        double mediaa = somaVolores / produtos.length;

        System.out.println("Average price = " + mediaa);


        scan.close();
    }
}
 /*
        System.out.println("Itens: ");
        for(int i = 0; i < produtos.length; i++){
            System.out.printf(" -  " + produtos[i].getNome() + produtos[i].getValor());

        }
        */
