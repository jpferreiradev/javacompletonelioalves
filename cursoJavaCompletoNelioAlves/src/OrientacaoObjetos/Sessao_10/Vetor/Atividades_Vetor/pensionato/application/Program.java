package OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor.pensionato.application;

import OrientacaoObjetos.Sessao_10.Vetor.Atividades_Vetor.pensionato.entities.Aluguel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Aluguel[] quartos = new Aluguel[10];

        System.out.print("Quantos quartos serão alugados?");
        int valor = scan.nextInt();


        // Ler os dados
        for (int i = 1; i <= valor; i++) { // O erro que estava dando em relação as posições era o <=, estava colocando <
            System.out.println();
            System.out.println("Quarto #" + i + ":");
            System.out.print("Nome:");
            scan.nextLine();
            String nome = scan.nextLine();
            System.out.print("Email:");
            String email = scan.next();
            System.out.print("Quarto: ");
            int quarto = scan.nextInt();
            //Aluguel aluguel = new Aluguel(nome,email); // Ele instanciou outro vetor
            quartos[quarto] = new Aluguel(nome, email); // -> Não entendi essa parte; Aqui ele colocou porque você quer determinar uma posição do no vetor quartos; Aqui vocÊ está instancioando uma objeto e atribuindo a referencia dele para o vetor na posição quarto que o usuario informou;

        }

        //-> Percorrer o vetor já preenchido!

        System.out.println();
        System.out.println("Quartos ocupados: ");
        for (int i = 0; i < 10; i++) {
            if(quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }

        }


    }
}
