package JavaBasico.TopicosImportantesJava;

import java.util.Scanner;

public class ExemploMetodos {
    static void main() {

        Scanner scan = new Scanner(System.in);

        //double y = 25.0;
        //double x = Math.sqrt(25.0);

        System.out.println("Entre com os 3 números: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

       int m = maior(a, b, c);

       mostreResultado(m);

        scan.close();
    }

    public static int maior(int x, int y, int z){
        int aux;
        if( x > y && x > z){
             aux = x;
        } else if( y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void mostreResultado(int valor){
        System.out.println("MAIOR: " + valor);
    }
}
