package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int valor = scan.nextInt();

        double[] numeros = new double[valor];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < numeros.length; i++) {
            //System.out.print("VALORES = " +  numeros[i]);
            System.out.printf("%.1f", numeros[i]);
            //System.out.println("VALORES = " + numeros[i] + " ");
            //System.out.printf("VALORES = %.2f\n", numeros[i]);
        }

        double soma = 0.0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];

        }

        double media = soma / numeros.length;
        System.out.println("\nSOMA = " + soma);
        System.out.println("MÉDIA= " + media);
    }

    //System.out.print("VALORES = ");

    //for (int i=0; i<n; i++) {
    //System.out.printf("%.1f  ", vetor[i]);
}

