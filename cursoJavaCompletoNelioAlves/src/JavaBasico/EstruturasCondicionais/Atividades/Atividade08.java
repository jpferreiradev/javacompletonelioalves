package JavaBasico.EstruturasCondicionais.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salario,descontoSalario;

        System.out.println("Informe o seu salário: ");
        salario = scan.nextDouble();

        if(salario < 2000.0){
            System.out.println("ISENTO");
        } else if (salario > 2000.01 && salario <= 3000.00) {


        } else if (salario > 3000.01 && salario <= 4500.00) {

        } else{

        }


    }
}
