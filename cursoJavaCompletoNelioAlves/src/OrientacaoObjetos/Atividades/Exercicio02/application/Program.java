package OrientacaoObjetos.Atividades.Exercicio02.application;

import OrientacaoObjetos.Atividades.Exercicio02.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        //funcionario.nome = "Jão";
        //funcionario.salarioBruto = 6000.00;
        //funcionario.taxa = 1000.00;

        //System.out.println(funcionario.salarioLiquido());

        //funcionario.aumentoSalario(10);


        System.out.print("Nome: ");
        funcionario.nome = scan.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = scan.nextDouble();
        System.out.print("Taxa: ");
        funcionario.taxa = scan.nextDouble();

        System.out.println("Funcionario " + funcionario);
        System.out.println("Informe a porcetagem do aumento de salário: ");
        double porcetagem = scan.nextDouble();
        //funcionario.taxa = scan.nextDouble();
        funcionario.aumentoSalario(porcetagem);

        //System.out.println("Update data:" + funcionario.toString());
        System.out.println("Update data:" + funcionario);



    }
}
