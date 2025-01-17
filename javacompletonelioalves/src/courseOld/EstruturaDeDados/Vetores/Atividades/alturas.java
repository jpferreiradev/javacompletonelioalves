package courseOld.EstruturaDeDados.Vetores.Atividades;

import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = scan.nextInt();

        // Ele usou a mesma variavel para ler todos os vetores
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        // Leitura dos dados
        for (int i = 0; i < n; i++) { // Vetor para leitura dos dados das pessoas
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.print("Nome:");
            nomes[i] = scan.next();
            System.out.print("Idade:");
            idades[i] = scan.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scan.nextDouble();
        }

        // 2 parte, a media das alturas
        double soma = 0;
        for (int i = 0; i < n; i++) { // Nesse vetor, você acumula todas as alturas na variavel soma
            soma = soma + alturas[i];
        }
        double mediaAlturas = soma / n;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", mediaAlturas);

        // Saber a contagem de pessoas que o menos 16 anos
        int cont = 0;
        for(int i = 0 ;i < n;i++){
            if(idades[i] < 16){
                cont = cont + 1;
            }
        }
        double percent = cont * 100.0 / n; // regra de 3
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

        for(int i =0; i <n;i++){
            if(idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
    }


}

