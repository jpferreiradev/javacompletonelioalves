package CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.TerceiraQuestao.application;

import CourseReview.QuestoesDoCurso.SecaoOitoOO.PrimeiraQuestao.TerceiraQuestao.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Informe o seu nome:");
        funcionario.nome = scan.nextLine();
        System.out.print("Informe o seu salário bruto: ");
        funcionario.salarioBruto = scan.nextDouble();
        System.out.print("Informe o valor do imposto: ");
        funcionario.taxaImposto = scan.nextDouble();


        System.out.println(funcionario.salarioLiquido());
        System.out.println();
        System.out.println(funcionario);

        System.out.print("Qual percentual para aumentar o salário?: ");
        double percentual = scan.nextInt();

        funcionario.aumentarSalario(percentual);


    }
}
