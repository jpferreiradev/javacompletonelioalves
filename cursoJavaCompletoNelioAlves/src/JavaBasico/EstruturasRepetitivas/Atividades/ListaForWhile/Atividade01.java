package JavaBasico.EstruturasRepetitivas.Atividades.ListaForWhile;

import java.util.Scanner;

public class Atividade01 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int nota;
        do {
            System.out.println("Informe uma nota válida de 0 a 10: ");
            nota = scan.nextInt();

            if (nota > 0 && nota <= 10) {
                System.out.println("Nota: " + nota);
            } else {
                System.out.println("Nota não válida, informe novamente: ");
                nota = scan.nextInt();
            }


        } while (nota > 10);


    }
}
