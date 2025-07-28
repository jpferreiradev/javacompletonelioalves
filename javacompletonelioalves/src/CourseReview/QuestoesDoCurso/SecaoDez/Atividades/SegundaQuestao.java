package CourseReview.QuestoesDoCurso.SecaoDez.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class SegundaQuestao {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int numero = scan.nextInt();

        double[] notas = new double[numero];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite um número: ");
            notas[i] = scan.nextDouble();

        }

        System.out.print("VALORES =  ");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf(" " + notas[i]);
        }

        double soma = 0.0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = soma / notas.length;


        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
    }
}

/*
/*
        for (double n : notas) {
            System.out.printf(" " + n);
        }
        */
