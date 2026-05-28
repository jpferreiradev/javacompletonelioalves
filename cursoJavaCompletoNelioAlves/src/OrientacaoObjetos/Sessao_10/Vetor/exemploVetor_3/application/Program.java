package OrientacaoObjetos.Sessao_10.Vetor.exemploVetor_3.application;

import OrientacaoObjetos.Sessao_10.Vetor.exemploVetor_3.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int valor = scan.nextInt();

        Produto[] produtos = new Produto[valor];

        for (int i = 0; i < produtos.length; i++) {
            scan.nextLine();
            String nome = scan.nextLine();
            double valorPreco = scan.nextDouble();
            produtos[i] = new Produto(nome, valorPreco); //Aqui você vai instanciar um novo produto e apontar para esse objeto;

        }

        double soma = 0.0; // Soma dos valores
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getPreco();
        }

        double media =  soma / produtos.length;

        System.out.println("Média dos produtos: " + media);

    }
}
