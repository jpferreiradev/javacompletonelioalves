package CourseReview.QuestoesDoCurso.SecaoSeis.While;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantAlcool = 0;
        int quantGasolina = 0;
        int quantDiesel = 0;

        System.out.println("Tipos de combustiveis: ");
        System.out.println("1- Alcool\n2 - Gasolina\n3 - Diesel\n4 - Fim");
        System.out.println();
        System.out.println("Informe qual o tipo de combustível a sua escolha: ");
        int escolha = scan.nextInt();

        while (escolha != 4) {

            if (escolha == 1) {
                quantAlcool = quantAlcool + 1;
            } else if (escolha == 2) {
                quantGasolina = quantGasolina + 1;
            } else if (escolha == 3) {
                quantDiesel = quantDiesel + 1;
            }
            escolha = scan.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + quantAlcool);
        System.out.println("Gasolina: " + quantGasolina);
        System.out.println("Diesel:" + quantDiesel);
    }
}

// Aqui coloquei a soma da quantidade de combustiveis somando a escolha da pessoa, e não é isso, você precisa somar + 1;