package CourseReview.JavaBasico.EstruturaRepetitiva;

import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe a quantidade de números: ");
        int numero = scan.nextInt();


        int soma = 0;
        for(int i = 0; i < numero; i++){
           int x = scan.nextInt();
           soma = soma + x;

        }
        System.out.println("Soma:  " + soma);
        /*
        System.out.println("Os numeros são esses");
        for(int i = 0; i < numero;i++){
            System.out.println(i);
        }
            */
    }
}
