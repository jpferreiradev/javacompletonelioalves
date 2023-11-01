package EstruturasRepetitivas;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numeroDigitado;
        int soma = 0;

        System.out.println("Digite um número inteiro:");
        numeroDigitado = scan.nextInt();

        while(numeroDigitado != 0){
            soma += numeroDigitado;
            numeroDigitado = scan.nextInt();
        }
        System.out.println(soma);
    }

}
