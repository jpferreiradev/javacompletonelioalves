package Secao_10.exemploVetorArray;

import java.util.Scanner;

public class exemploVetorTipoValor {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int tamanho = scan.nextInt();

        double[] alturas = new double[tamanho];

        double cont = 0;
        for(int i = 0; i < alturas.length; i++) {
            alturas[i] = scan.nextDouble();
            cont = cont + alturas[i];

        }
        double media = cont / tamanho;
        System.out.printf("Average Height = %.2f",media);

        scan.close();
    }
}
