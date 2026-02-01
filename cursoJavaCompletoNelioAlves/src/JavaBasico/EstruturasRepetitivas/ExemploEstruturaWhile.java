package JavaBasico.EstruturasRepetitivas;

import java.util.Scanner;

public class ExemploEstruturaWhile {
    static void main() {

       Scanner scan = new Scanner(System.in);

       int x = scan.nextInt();

       int soma = 0;
       while(x != 0){
            //soma += x;
           x = scan.nextInt();
           soma += x;
       }
        System.out.println(soma);

    }
}
