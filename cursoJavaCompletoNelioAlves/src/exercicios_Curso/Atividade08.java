package exercicios_Curso;

import java.util.Scanner;

public class Atividade08 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int a, b;

        a = scan.nextInt();
        b = scan.nextInt();

        if(a / b == 0 || b / a == 0) {
            System.out.println("São multiplos");
        } else{
            System.out.println("Não são multiplos");
        }


    }
}
