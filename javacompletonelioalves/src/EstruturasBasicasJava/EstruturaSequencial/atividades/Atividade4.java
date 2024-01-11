package EstruturasBasicasJava.EstruturaSequencial.atividades;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numeroFuncionario;
        double horasTrabalhas;
        double valorSalario;
        double conversaoHoraTrabalhada;

        System.out.println("Informe o seu número: ");
        numeroFuncionario = scan.nextInt();
        System.out.println("Informe o seu salário: ");
        valorSalario = scan.nextDouble();
        System.out.println("Informe quantas horas foram trabalhadas: ");
        horasTrabalhas = scan.nextDouble();

        conversaoHoraTrabalhada = horasTrabalhas * valorSalario;

        System.out.println("NUMBER:" + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", conversaoHoraTrabalhada);
        System.out.println("SALARY = U$ " + conversaoHoraTrabalhada);


    }
}
