package JavaBasico.EstruturaSequencial.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class QuartaQuestao {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valorHora,conversaoSalarioHora;
        int numeroFuncionario,horasTrabalhadas;

        numeroFuncionario = scan.nextInt();
        horasTrabalhadas = scan.nextInt();
        valorHora = scan.nextDouble();


        conversaoSalarioHora = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALÁRIO =R$ %.2f",conversaoSalarioHora);
    }
}
