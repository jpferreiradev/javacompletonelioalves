package JavaBasico.EstruturasRepetitivas.Atividades.ListaForWhile;

import java.util.Scanner;

public class Atividade03 {
    static void main() {

        Scanner scan = new Scanner(System.in);


        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Informe a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Informe o seu salário: ");
        double salario = scan.nextDouble();
        System.out.println("Informe o seu sexo:  ");
        char sexo = scan.next().charAt(0);
        System.out.println("Informe o seu estado civil: ");
        char estadoCivil = scan.next().charAt(0);
        
    }
}
