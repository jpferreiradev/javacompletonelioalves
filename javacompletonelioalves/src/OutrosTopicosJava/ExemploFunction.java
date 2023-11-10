package OutrosTopicosJava;

import java.util.Scanner;

public class ExemploFunction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 números:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

         int maior = max(a,b,c);

         showResult(maior);


    }

    public static int max(int x, int y, int z) {
        int aux; // variavel local
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int x) {
        System.out.println("Maior: " + x);
    }
}

/*
    public static int maiorNumero(int x,int y, int z) {
        int aux;
        if( a > b && a > c){
            System.out.println("O maior numero é: " + a);
        } else if (b > c ) {
            System.out.println("O maior numero é: " + b);
        } else {
            System.out.println("O maior número é: " + c);

        }
    }

 */