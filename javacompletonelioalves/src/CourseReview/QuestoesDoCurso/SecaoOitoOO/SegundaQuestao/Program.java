package CourseReview.QuestoesDoCurso.SecaoOitoOO.SegundaQuestao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual preço do dolar?");
        double valorDolar = scan.nextDouble();
        System.out.println("Quantos dolares seram comprados?");
        double valorComprado = scan.nextDouble();

        double resultado = ConversorMoeda.conversorMoeda(valorDolar,valorComprado);
        System.out.printf("Valor a ser pago em reais: %.2f",resultado);

    }
}
