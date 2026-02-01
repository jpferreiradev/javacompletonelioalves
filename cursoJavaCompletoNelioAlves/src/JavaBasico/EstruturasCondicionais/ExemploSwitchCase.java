package JavaBasico.EstruturasCondicionais;

import java.util.Scanner;

public class ExemploSwitchCase {
    static void main() {

        Scanner scan = new Scanner(System.in);
        int diaSemana;

        System.out.print("Informe o valor do dia da semana: ");
        diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje é segunda");
                break;
            case 3:
                System.out.println("Hoje é terça");
                break;
            case 4:
                System.out.println("Hoje é quarta");
                break;
            case 5:
                System.out.println("Hoje é quinta");
                break;
            case 6:
                System.out.println("Hoje é sexta");
                break;
            case 7:
                System.out.println("Hoje é sábado");
                break;
            default:
                System.out.println("Informe novamente o valor....");

        }
        scan.close();
    }
}
