package JavaBasico.EstruturaSequencial.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class SegundaQuestao {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valor, area;

        valor = scan.nextDouble();
        area = 3.14159 * Math.pow(valor, 2);

        System.out.printf("A = %.4f ", area);

    }
}
