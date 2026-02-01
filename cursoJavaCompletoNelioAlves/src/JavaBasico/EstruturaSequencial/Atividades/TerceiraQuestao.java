package JavaBasico.EstruturaSequencial.Atividades;

import java.util.Scanner;

public class TerceiraQuestao {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int A,B,C,D, DIFERENCA;

        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        DIFERENCA = (A * B - C * D);
        System.out.println("DIFERENCA =" + DIFERENCA);
    }
}
