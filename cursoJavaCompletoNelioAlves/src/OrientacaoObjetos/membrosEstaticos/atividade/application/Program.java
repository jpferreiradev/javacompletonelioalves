package OrientacaoObjetos.membrosEstaticos.atividade.application;

import OrientacaoObjetos.membrosEstaticos.atividade.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {


    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        System.out.println("Qual é o preço em dólares?");
        double valorDolar = scan.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double valorComprado = scan.nextDouble();

        double resultado = CurrencyConverter.conversaoDolarReal(valorDolar, valorComprado);
        System.out.printf("Valor a ser pago em reais %.2f",resultado);

        // = 657,20
    }


}
