package JavaBasico.EstruturasRepetitivas;

import java.util.Scanner;

public class ExemploFor_2 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.print("Informe o tamanho dos números: ");
        valor = scan.nextInt();

        //int[] numero = new int[valor];

        int cont = 0;
        for (int i = 0; i < valor; i++) {
            //i = scan.nextInt();
            int x = scan.nextInt();
            cont = cont + x;
        }

        System.out.println(cont);
    }
}

// LEMBRE-SE VOCÊ USOU UM ARRAY DE VETORES E NÃO ERA PRA TER USADA;