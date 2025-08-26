package CourseReview.OrientacaoObjetos.membrosEstatiscos;

import CourseReview.OrientacaoObjetos.membrosEstatiscos.util.Calculator;
import CourseReview.OrientacaoObjetos.membrosEstatiscos.util.CalculatorFinal;

import java.util.Locale;
import java.util.Scanner;


public class primeiroaVersao {

    //public static final double PI = 3.14159; // Aqui é um membro estático, ele é uma CONSTANTE

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        //Calculator calc = new Calculator(); -> Aqui é para a segunda versão

        System.out.print("Entre com o raio: ");
        double raio = scan.nextDouble();

        //double c = calc.valorCincunferencia(raio); // Segunda versão
        double c = CalculatorFinal.valorCincunferencia(raio); // Terceria versão

        //double v = calc.valorVolume(raio); // Segunda versão
        double v = CalculatorFinal.valorVolume(raio); // Terceira versão

        System.out.printf("Cincunferencia: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        //System.out.printf("Valor de PI %.2f\n", calc.PI); // Segunda versão
        System.out.printf("Valor de PI %.2f\n", CalculatorFinal.PI); // Terceira versão


    }


}
