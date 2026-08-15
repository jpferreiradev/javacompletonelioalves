package exercicios_Curso;

import java.util.Scanner;

public class Atividade07 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
}
