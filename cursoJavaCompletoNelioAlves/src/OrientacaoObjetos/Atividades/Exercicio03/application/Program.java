package OrientacaoObjetos.Atividades.Exercicio03.application;

import OrientacaoObjetos.Atividades.Exercicio03.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        Aluno aluno = new Aluno();

        aluno.nome = scan.nextLine();
        aluno.nota1 = scan.nextDouble();
        aluno.nota2 = scan.nextDouble();
        aluno.nota3 = scan.nextDouble();

        aluno.conversaoMediaPonderada();


    }
}
