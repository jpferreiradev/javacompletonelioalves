package OutrosTopicosJava;

import java.util.Scanner;

public class exemploBitWase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int mask = 0b100000; // Exemplo de numero binario no java
        int n = scan.nextInt();

        if((n & mask) != 0){
            System.out.println("6 bit is true");
        } else {
            System.out.println("6 bit is false");
        }
    }
}
