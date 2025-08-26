package CourseReview.OrientacaoObjetos.ExemploComOOESemOO.Atividades.Exercicio02;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        System.out.print("Nome: ");
        funcionario.nome = scan.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = scan.nextDouble();
        System.out.print("Valor imposto: ");
        funcionario.imposto = scan.nextDouble();

        System.out.println(funcionario.toString());


        System.out.print("Qual a porcentagem de aumento salarial: ");
        double porcetagem = scan.nextDouble();

        funcionario.aumentoSalario(porcetagem);
        System.out.println("Update salário: " + funcionario.toString());

        System.out.println();
        System.out.println("Exemplo de um código Hash: " + funcionario.hashCode());
        System.out.println("Exemplo de código Hash 2" + funcionario2.hashCode());


        System.out.println("Compara se dois objetos são iguais: ");
        System.out.println(funcionario.equals(funcionario2));

    }
}

