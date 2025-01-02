package CourseReview.JavaBasico.EstruturaRepetitiva;

import java.util.Scanner;

public class ExemploWhileDois {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();



        int soma = 0;
        while(numero != 0){
            //System.out.println("Informe novamente outro número: "); Aqui eu coloquei e não precisava
            soma  = soma += numero;
            numero = scan.nextInt();
        }
        System.out.println("SOMA: " + soma);
    }
}
