package exercicios_Curso;

import java.util.Scanner;

public class Atividade09 {
    static void main() {

        Scanner scan = new Scanner(System.in);

        int horaInicial, horaFinal, calculoHora, valorDia, HoraFinal;

        horaInicial = scan.nextInt();
        horaFinal = scan.nextInt();

        if (horaInicial == 0 && horaFinal == 0) {
            System.out.println("O jogo durou 24h ");
        } else if (horaInicial < horaFinal) {
            calculoHora = horaFinal - horaInicial;
            System.out.println("O jogo durou:" + calculoHora + "hora(s)");
        } else {
            calculoHora = horaInicial - horaFinal;
            valorDia = 24;
            horaFinal = valorDia - calculoHora;
            System.out.println("O jogo durou:" + horaFinal + "hora(s)");

        }
    }
}
