package exercicios_Curso;

import java.util.Scanner;

public class Atividade18_estudar {
    static void main() {


        Scanner scan = new Scanner(System.in);
        // Exemplo for
        // Exemplo while
        // Exemplo do usuario

        int numero = scan.nextInt();
        int numeroDois = scan.nextInt();
        long fatorial = 1;
        long fatorialDois = 1;

        for(int i = 1; i <= numero; i++) {
            fatorial *= i;

        }
        System.out.println("Fatorial com for: " + fatorial);

        int i = 1;
        while(i <= numeroDois){
            fatorialDois *= i;
            i++;
        }
        System.out.println("Fazendo o fatorial com while:" + fatorialDois);

        scan.close();
    }
}
