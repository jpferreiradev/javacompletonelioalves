package courseOld.OrientacaoObjetos.Interfaces.Atividade.application;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Locale.setDefault(Locale.US);

        System.out.println("Informe o porcemtagem");
        double porcetagem = scan.nextDouble();
        System.out.println("Informe o valor:");
        int valor = scan.nextInt();

        double calculoPorcetagem = valor * porcetagem;
        System.out.println(calculoPorcetagem);


    }
}
