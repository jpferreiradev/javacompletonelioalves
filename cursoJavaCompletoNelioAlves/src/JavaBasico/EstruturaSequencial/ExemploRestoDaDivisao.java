package JavaBasico.EstruturaSequencial;

import java.util.Scanner;

public class ExemploRestoDaDivisao {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int valor,valor2,resto;

        System.out.print("Informe o primeiro valor: ");
        valor = scan.nextInt();
        System.out.print("Informe o segundo valor: ");
        valor2 = scan.nextInt();

        resto = valor % valor2;

        System.out.println("O resto da divisão é: " + resto);
        // O resto da divisão se chama MOD;

    }
}
