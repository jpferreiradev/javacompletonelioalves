package JavaBasico.EstruturasRepetitivas.Atividades;

import java.util.Scanner;

public class Atividade07 {
    static void main() {

    Scanner scan = new Scanner(System.in);



        System.out.println("Informe o número: ");
        int n = scan.nextInt();

        for(int i = 1; i <= n;i++){

            int numero1 = i;
            int numero2 = i * i;
            int numero3 = i * i * i;

            System.out.printf("%d %d %d%n ",numero1,numero2,numero3);
        }


    }
}

/*
  for (int i=1; i<=n; i++) {

            int primeiro = i;
            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
 */