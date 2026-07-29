package Secao_07;

import java.util.Scanner;

public class exemploFuncoes_1 {
    static void main() {

       Scanner scan = new Scanner(System.in);


       System.out.println("Entre com os números: ");
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();



       int m =max(a, b, c);

       mostreResultado(m);

       scan.close();
    }

    public static int max(int z, int x,int c){
        int aux;
        if(z > x && z > c){
            aux = z;
        } else if (x > c ) {
            aux = x;
        } else{
            aux = c;
        }
        return aux;
    }

    public static void mostreResultado(int valor){
        System.out.println("Maior = "+ valor);
    }
}
