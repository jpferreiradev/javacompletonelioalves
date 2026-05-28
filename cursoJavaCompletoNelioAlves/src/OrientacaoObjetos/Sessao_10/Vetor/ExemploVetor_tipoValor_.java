package OrientacaoObjetos.Sessao_10.Vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor_tipoValor_ {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int quantidade = scan.nextInt();

        double[] alturas = new double[quantidade];

        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Informe a " + (i + 1) + " altura");
            alturas[i] = scan.nextDouble();
        }

        System.out.println("ALTURAS:");
        for (int i = 0; i < alturas.length; i++) {
            System.out.printf(" " + alturas[i]);
        }

        System.out.println("SOMA DAS ALTURAS");
        double soma = 0.0;
        double mediaAlturas;
        for (int i = 0; i < alturas.length; i++) {
            //soma = soma + alturas[i];
            soma += alturas[i];
        }

        System.out.println("SOMA DAS ALTURAS: " + soma);
        mediaAlturas = soma / alturas.length;
        System.out.printf("MÉDIA ALTURAS: %.2f", mediaAlturas);
    }
}
