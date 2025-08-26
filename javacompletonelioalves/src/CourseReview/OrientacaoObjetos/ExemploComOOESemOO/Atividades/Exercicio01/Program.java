package CourseReview.OrientacaoObjetos.ExemploComOOESemOO.Atividades.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe a altura do retangulo: ");
        double altura = scan.nextDouble();
        System.out.print("Informe a largura do retangulo: ");
        double largura = scan.nextDouble();

        Retangulo retangulo = new Retangulo(altura, largura);

        System.out.println("O valor da área é de: " + retangulo.area());
        System.out.println("O valor do perimetro é de: " + retangulo.perimetro());
        System.out.println("O valor da diagonal é de: " + retangulo.diagonal());


    }
}
