package courseOld.OrientacaoObjetos.Atividades.questao01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle width and height: ");
        retangulo.width = scan.nextDouble();
        retangulo.height = scan.nextDouble();

        //retangulo.width = 3.00;
        //retangulo.height = 4.00;

        System.out.println(retangulo.toString());

    }
}
