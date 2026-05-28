package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar?");
        int valor = scan.nextInt();

        String[] nomes = new String[valor];
        int[] idades = new int[valor];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome:");
            nomes[i] = scan.next();
            System.out.print("Idade:");
            idades[i] = scan.nextInt();
        }

        int idadeMaior = 0;
        for(int i = 0; i < idades.length; i++) {
            if(idadeMaior < 0){
                idadeMaior++;
            }
        }

    }
}
