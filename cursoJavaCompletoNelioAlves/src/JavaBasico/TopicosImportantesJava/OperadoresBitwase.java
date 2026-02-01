package JavaBasico.TopicosImportantesJava;

import java.util.Scanner;

public class OperadoresBitwase {
    static void main() {

        Scanner scan = new Scanner(System.in);
        /*
        int n1 = 89;
        int n2 = 60;
        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);
        */
        int mask = 0b100000;
        int n = scan.nextInt();
        if( (n & mask) != 0){
            System.out.println("O sexto bit é verdadeiro!");
        } else{
            System.out.println("O sexto bit é falso! ");
        }
    }
}
