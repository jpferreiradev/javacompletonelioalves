package EstruturaDeDados.Vetores.Atividades;

import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantHomens, quantMulheres;
        double menorAltura,maiorAltura,alturaMediaFemini,alturaTotalFem;

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scan.nextInt();

        double alturas[] = new double[n];
        char generos[] = new char[n];

        for (int i = 0; i < n; i++) { // Pega os valores da alturas e dos generos
            scan.nextLine();
            System.out.print("Altura da " + (i + 1) + "pessoa: ");
            alturas[i] = scan.nextDouble();
            System.out.print("Genero da " + (i + 1) + "pessoa: ");
            generos[i] = scan.next().charAt(0);
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (int i = 0; i < n; i++) { // Compara a maior e a menor altura;
            if(alturas[i] > maiorAltura){
                maiorAltura = alturas[i];
            } if(alturas[i] < menorAltura){
                menorAltura = alturas[i];
            }
        }

        quantHomens = 0;
        quantMulheres = 0;
        alturaTotalFem = 0;

        for(int i = 0;i < n;i++){
            if(generos[i] == 'M'){
                quantHomens++;
            } else {
                quantMulheres++;
                alturaTotalFem = alturaTotalFem + alturas[i];
            }
        }
        alturaMediaFemini = alturaTotalFem / quantMulheres;

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMediaFemini);
        System.out.println("Quantidades de homens: " + quantHomens);
    }
}
