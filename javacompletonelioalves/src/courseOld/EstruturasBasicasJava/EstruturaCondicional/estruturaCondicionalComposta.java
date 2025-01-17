package courseOld.EstruturasBasicasJava.EstruturaCondicional;

import java.util.Scanner;

public class estruturaCondicionalComposta {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Que horas são? ");
        int hora = scan.nextInt();

        if(hora > 12){
            System.out.println("Boa tarde");
        } else{
            System.out.println("Bom dia");
        }
    }
}
