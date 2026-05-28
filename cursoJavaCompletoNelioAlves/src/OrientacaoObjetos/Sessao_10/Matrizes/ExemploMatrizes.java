package OrientacaoObjetos.Sessao_10.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class ExemploMatrizes {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o tamanho do array: ");
        int tamanho = scan.nextInt();

        String[]nomes = new String[tamanho];

        for(int i = 0; i < nomes.length; i++){
            System.out.println("Informe o " + (i+1) + " nome:");
            nomes[i] = scan.nextLine();

        }

    }

}
