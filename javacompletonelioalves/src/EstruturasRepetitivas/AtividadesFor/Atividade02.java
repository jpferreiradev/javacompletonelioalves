package EstruturasRepetitivas.AtividadesFor;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Digite um valor para os intervalos:");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();

            if (x >= 10 && x <= 20) {
                in = in + 1;

            } else {
                out = out + 1;

            }
        }

        System.out.println(in + ": in");
        System.out.println(out + ": out");
    }
}




