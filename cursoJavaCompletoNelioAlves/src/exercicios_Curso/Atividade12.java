package exercicios_Curso;

import java.util.Scanner;

public class Atividade12 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int x,y;

        x = scan.nextInt();
        y = scan.nextInt();

        if(x > 0 && y > 0){
            System.out.println("Primeiro");
        } else if (x < 0 && y >0 ) {
            System.out.println("segundo");
        } else if (x < 0 && y < 0) {
            System.out.println("terceiro");
        }  else if (x > 0 && y < 0) {
            System.out.println("quarto");
        } else{
            System.out.println();
        }
    }
}
