package OrientacaoObjetos.Atividades.Exercicio01.application;

import OrientacaoObjetos.Atividades.Exercicio01.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com o valor da altura e largura: ");
        retangulo.altura = scan.nextDouble();
        retangulo.largura = scan.nextDouble();


        System.out.println(retangulo.toString());

    }
}
