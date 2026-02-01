package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Scanner;

public class Atividade02 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número:");
        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Número par");
        } else{
            System.out.println("Número impar");
        }
    }
}
