package EstruturaDeDados.Matrizes;

import java.util.Scanner;

public class Matriz {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas dimensões vão ser essa matriz?");
        int matriz = scan.nextInt();

        int[] myArrays = new int[matriz];
        myArrays[0] = 0;
        myArrays[1] = 1;
        myArrays[2] = 2;
        //myArrays[3] = 3;
        //myArrays[3] = 3;
        //myArrays[4] = 4;
        for(int i = 0; i < myArrays.length;i++){
            System.out.print(" " + myArrays[i]);
        }




    }
}
