package exercicios_Curso;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeroFuncioanrio,horasTrabalhadas;
        double valorHora, conversaoSalarioHora;

        numeroFuncioanrio = scan.nextInt();
        horasTrabalhadas = scan.nextInt();
        valorHora = scan.nextDouble();
        conversaoSalarioHora = valorHora * horasTrabalhadas;
        System.out.println("NUMBER: " + numeroFuncioanrio);
        System.out.println("SALÁRIO:  " + conversaoSalarioHora);


    }
}
