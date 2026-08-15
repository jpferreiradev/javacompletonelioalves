package exercicios_Curso.secao10.atividadeAprovados.application;

import exercicios_Curso.secao10.atividadeAprovados.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.print("Quantos alunos serão digitados? ");
        int n = scan.nextInt();

        Aluno[] alunos = new Aluno[n];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Digite nome, primeira e segunda do " + (i + 1) + "aluno: ");
            scan.nextLine();
            String nome = scan.nextLine();
            double nota = scan.nextDouble();
            double nota2 = scan.nextDouble();

            alunos[i] = new Aluno(nome, nota, nota2);
        }

        System.out.println("Alunos: ");
        for(int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }

        double somaNota = 0.0;
        double mediaNota = 0.0;
        for(int i = 0; i < alunos.length; i++) {
            somaNota = somaNota + alunos[i].getNota() + alunos[i].getNota2();
            mediaNota = somaNota / alunos.length;
        }
        System.out.println(somaNota);
        System.out.println(mediaNota);

        System.out.println("Alunos aprovados: ");
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i].getNota() > 6.0 || alunos[i].getNota2() > 6.0){
                System.out.println(alunos[i]);
            }
        }


    }
}


