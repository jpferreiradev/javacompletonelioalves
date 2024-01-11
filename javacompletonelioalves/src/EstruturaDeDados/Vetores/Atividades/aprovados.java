package EstruturaDeDados.Vetores.Atividades;

import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double media;

        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();

        String nomes[] = new String[n];
        double primeiraNota[] = new double[n];
        double segundaNota[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite nome, primeira e segunda nota do" + (i + 1) + "aluno");
            scan.nextLine();
            nomes[i] = scan.nextLine();
            primeiraNota[i] = scan.nextDouble();
            segundaNota[i] = scan.nextDouble();
        }
        System.out.println("Alunos aprovados");


        // Não precisou ser criado um contador, já foi feito direto...
        for (int i = 0; i < n; i++) {
            media = (primeiraNota[i] + segundaNota[i]) / 2;
            if (media >= 6) {
                System.out.println(nomes[i]);
            }
        }


    }
}

