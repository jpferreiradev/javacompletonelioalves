package CourseReview.OrientacaoObjetos.membrosEstatiscos.segundVersao.application;

import CourseReview.OrientacaoObjetos.membrosEstatiscos.segundVersao.util.Calculator;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o radio: ");
        double raio = scan.nextDouble();

        double c = calculator.circunferencia(raio);
        double v = calculator.volume(raio);

        System.out.printf("Circuferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.2f%n", calculator.PI);

    }
}


// Aqui nesse caso, foi preciso instanciar a objeto Calculator e em seguida chamou as operações de acordo com o objeto
// uma foma de solucionar os problemas;