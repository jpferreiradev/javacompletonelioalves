package JavaBasico.EstruturaSequencial.Atividades;

import java.util.Scanner;

public class PrimeiraQuestao {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int numeroUm, numeroDois,soma;

        numeroUm = scan.nextInt();
        numeroDois = scan.nextInt();

        soma = numeroUm+numeroDois;

        System.out.println("SOMA =" + soma);

    }
}
