package CourseReview.JavaIntermediario.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ExemploAltura {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // O Locale, precisa ficar aqui;
        Scanner scan  = new Scanner(System.in);



        System.out.print("Informe a quantidade de alturas: ");
        int quantidade = scan.nextInt();

        double[] alturas = new double[quantidade];

        for(int i = 0; i < alturas.length; i++) {
            System.out.println("Informe a " + (i+1) + "altura");
            alturas[i] = scan.nextDouble();
        }

        double soma = 0.0;
        for(int i =0; i < alturas.length; i++) {
            soma += alturas[i];
        }

        double media = soma / quantidade;

        System.out.printf("Altura média: " + String.format("%.2f", media));

    }
}
