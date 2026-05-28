package OrientacaoObjetos.Sessao_10.Matrizes;

import java.util.Scanner;

public class Exemplo_2 {
    static void main() {

        Scanner scan= new Scanner(System.in);

        int vetor[] = new int[3];
        int vetorr[] = {1,2,3,4,5};

        for(int i = 0; i < vetor.length; i++){
            System.out.printf(" " + vetor[i]);
        }
        System.out.println();
        for (int i = 0; i < vetorr.length; i++) {
            System.out.printf(" " + vetorr[i]);
        }
        System.out.println();
        System.out.println("Escolha um número: ");
        int numero = scan.nextInt();
        System.out.println("Numero escolhido foi: " + numero);

        System.out.println(); // Aqui pega o número escolhido
        int numeroEscolhdo = 0;
        for(int i = 0; i < vetor.length; i++){
            if(numero == vetor[i]){
                numeroEscolhdo = numeroEscolhdo +  vetor[i];
            }
        }
        System.out.println();
        System.out.println("Numero escolhido foi: " + numeroEscolhdo);
    }
}
