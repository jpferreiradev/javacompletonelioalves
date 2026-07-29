package Secao_06;

import java.util.Scanner;

public class exemploWhile {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int x, cont = 0;

        System.out.print("Informe um valor: ");
        x = scan.nextInt();

        while(x != 0){
            cont += x; // Aqui está certo
            x = scan.nextInt(); // Errou aqui, faltou;

        }
        System.out.println(cont); // Somando todos os números;

        scan.close();
    }
}
