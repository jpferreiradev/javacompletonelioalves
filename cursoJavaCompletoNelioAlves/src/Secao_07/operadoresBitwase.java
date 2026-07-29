package Secao_07;

import java.util.Scanner;

public class operadoresBitwase {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        int mask = 0b100000; // Numero em formato binario, esse é 32;
        int n = scan.nextInt();

        if(((n & mask) != 0)){
            System.out.println("O 6bit é true!");
        } else{
            System.out.println("O 6bit é false!");
        }


        scan.close();

    }
}
