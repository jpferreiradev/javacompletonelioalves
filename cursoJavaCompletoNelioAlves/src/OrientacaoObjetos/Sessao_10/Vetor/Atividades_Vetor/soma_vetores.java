package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?");
        int valor = scan.nextInt();


        int[] vetorA = new int[valor];
        int[] vetorB = new int[valor];

        /*
        System.out.println("Digite os valores do vetoe A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }
        System.out.println("Digite os valores do vetoe B: ");

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();

        }
        */
        System.out.println("Digite os valores do vetoe A: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = scan.nextInt();
        }
        System.out.println("Digite os valores do vetoe B: ");

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = scan.nextInt();

        }

        int soma = 0;
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetorA.length; i++) {
            soma = vetorA[i] + vetorB[i];
            System.out.println(soma);
        }
    }

}
