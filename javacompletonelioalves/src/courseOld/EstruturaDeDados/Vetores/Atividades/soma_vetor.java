package courseOld.EstruturaDeDados.Vetores.Atividades;

import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



            //Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n;
            double soma, media;

            System.out.print("Quantos numeros voce vai digitar? ");
            n = sc.nextInt();

            double[] vetor = new double[n];

            for (int i = 0; i < n; i++) { // Imprimiu os valores
                System.out.print("Digite um numero: ");
                vetor[i] = sc.nextDouble();
            }

            soma = 0;
            for (int i = 0; i < n; i++) { // Imprimiu a soma dos valores
                soma = soma + vetor[i];
            }

            media = soma / n;

            System.out.print("VALORES = ");

            for (int i = 0; i < n; i++) { // Imprimiu os valores das notas no print
                System.out.printf("%.1f  ", vetor[i]);
            }

            System.out.printf("\nSOMA = %.2f\n", soma);
            System.out.printf("MEDIA = %.2f\n", media);


        }

    }




/*
  System.out.print("Quantos numeros você vai digitar?");
        int n;
        n = scan.nextInt();

        double[] vetor = new double[n];

        for(int i = 0; i < vetor.length;i++){
            System.out.print("Digite um número: ");
            vetor[i] = scan.nextDouble();
            //System.out.println("VALORES: " + vetor. );
 */