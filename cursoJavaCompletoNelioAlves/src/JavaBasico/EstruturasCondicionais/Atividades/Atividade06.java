package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double valorIntervalo;

        valorIntervalo = scan.nextDouble();


        if (valorIntervalo > 0 && valorIntervalo <= 25) {
            System.out.println("Intervalo 0,25)");
        } else if (valorIntervalo > 25 && valorIntervalo <= 50) {
            System.out.println("Intervalo 25,50)");
        } else if (valorIntervalo > 50 && valorIntervalo <= 75) {
            System.out.println("Intervalo 50, 75)");
        } else if (valorIntervalo > 75 && valorIntervalo <= 100) {
            System.out.println("Intervalo 75, 100");

        } else {
            System.out.println("Fora do intervalo!");
        }
    }
}
