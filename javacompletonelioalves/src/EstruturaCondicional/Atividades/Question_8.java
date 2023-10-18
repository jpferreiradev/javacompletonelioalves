package EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_8 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        double salario;
        double calculoImposto;


        System.out.println("Informe o seu salário");
        salario = scan.nextDouble();

        if(salario <= 2000.0){
            calculoImposto = 0.0;
        } else if (salario <= 3000.0) {
            calculoImposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            calculoImposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            calculoImposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if(calculoImposto == 0.0){
            System.out.println("Isento");
        }
        else{
            System.out.printf("R$ %.2f%n", calculoImposto);
        }
    }
}
