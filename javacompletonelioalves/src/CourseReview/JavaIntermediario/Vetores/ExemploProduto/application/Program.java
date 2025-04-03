package CourseReview.JavaIntermediario.Vetores.ExemploProduto.application;

import CourseReview.JavaIntermediario.Vetores.ExemploProduto.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        Produto[] vetor = new Produto[n];

        for(int i = 0; i < vetor.length;i++){
            scan.nextLine(); // Aqui foi porque a quebra de linha ficou pendente no nextInt;
            String nome = scan.next();
            double preco = scan.nextDouble();
            vetor[i] = new Produto(nome, preco); // Instanciar um novo produto e o vetor na posição I vai apontar para o objeto;
        }

        double soma = 0.0;

        // Soma de todos os preços
        for(int i =0; i < vetor.length; i++) {
            soma += vetor[i].getPreco(); // Estudar isso aqui
            //soma = soma + vetor[i].getPreco(); )-> Isso seria isso aqui
        }

        double media = soma / vetor.length;

        System.out.printf("Preço médio: " + String.format("%.2f", media));
    }
}
