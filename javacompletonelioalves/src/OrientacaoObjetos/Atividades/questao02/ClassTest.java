package OrientacaoObjetos.Atividades.questao02;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double updateValue;
        Funcionario funcionario = new Funcionario();

        System.out.println("Digite o seu nome, salário bruto e imposto");
        funcionario.name = scan.nextLine();
        funcionario.grossSalary = scan.nextDouble();
        funcionario.tax = scan.nextDouble();

        //stem.out.println(funcionario.increaseSalary(10));

        System.out.println("Nome:" + funcionario.name);
        System.out.println("Gross salary: " + funcionario.grossSalary);
        System.out.println("Tax: " + funcionario.tax);
        System.out.println("Employee:" + funcionario.name + ",$ " + funcionario.netSalary());
        System.out.print("Which percentage to increase salary?");
        System.out.println("Update data: " + funcionario.name+ ", $" + funcionario.increaseSalary(scan.nextDouble()));


    }
}

//System.out.println(funcionario.increaseSalary(10.0));
//System.out.println(funcionario.netSalary());