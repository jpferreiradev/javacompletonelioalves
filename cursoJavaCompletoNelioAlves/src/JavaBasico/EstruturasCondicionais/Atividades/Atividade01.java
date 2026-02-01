package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Scanner;

public class Atividade01 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = scan.nextInt();

        if(numero < 0){
            System.out.println("Esse número é negativo!");
        } else{
            System.out.println("Esse número é positivo!");
        }
    }
}
