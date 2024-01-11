package EstruturasBasicasJava.EstruturaCondicional.Atividades;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de um número inteiro: ");
        int numero = scan.nextInt();

        if(numero < 0){
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero positivo");
        }
    }
}
