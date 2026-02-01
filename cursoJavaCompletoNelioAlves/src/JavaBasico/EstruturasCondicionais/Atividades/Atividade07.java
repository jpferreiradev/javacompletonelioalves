package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double valorX,valorY,valorQuadrante;

        valorX = scan.nextDouble();
        valorY = scan.nextDouble();



        if ( valorX > 0 && valorY > 0) {
            System.out.println("Q1");
        } else if (valorX < 0 && valorY > 0) {
            System.out.println("Q2");
        } else if (valorX < 0 && valorY < 0) {
            System.out.println("Q3");
        } else if (valorX > 0 && valorY < 0) {
            System.out.println("Q4");

        } else {
            System.out.println("Origem");
        }
    }
}
