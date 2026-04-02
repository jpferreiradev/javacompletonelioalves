package OrientacaoObjetos.Sessao_10;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor_2 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);



        //alturas[0] = 1.72;
        //alturas[1] = 1.56;
        //alturas[2] = 1.80;

        int valor = scan.nextInt();
        double[] alturas = new double[valor];


        /*
        double media = 0;
        for(int i = 0; i < alturas.length; i++) {
            media = alturas[i] / 3;
            System.out.println(media);
        }

        System.out.println("Altura média é:" + media);
         */
        // Forma para ler um vetor
        for(int i = 0; i < alturas.length; i++) {
            alturas[i] = scan.nextDouble(); //Pegando os valores do vetor;
        }

        double soma = 0.0;
        for(int i = 0; i < alturas.length; i++) {
            soma += alturas[i];
        }

        double media = soma /valor;
        System.out.printf("MÉDIA: %.2f%n ", media);
    }
}
