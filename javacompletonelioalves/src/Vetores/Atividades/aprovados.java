package Vetores.Atividades;

import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

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

        double cont = 0;
        for(int i = 0; i < n;i++){
            cont = cont + primeiraNota[i] + segundaNota[i];
        }
        double media = cont / 2;
        System.out.println(n);
    }
}
