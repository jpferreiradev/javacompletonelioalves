package OrientacaoObjetos.MembrosEstaticos.Atividade;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double precoDolar = scan.nextDouble();
        System.out.println("How many dollrs will be bought? ");
        double valor = scan.nextDouble();
        double resultado = CurrencyConverter.conversaoDolar(valor,precoDolar);
        System.out.printf("Amount to be paid in reais = %.2f%n", resultado);
    }
}
