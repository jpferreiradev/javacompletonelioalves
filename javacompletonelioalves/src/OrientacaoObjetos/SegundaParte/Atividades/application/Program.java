package OrientacaoObjetos.SegundaParte.Atividades.application;

import OrientacaoObjetos.SegundaParte.Atividades.entities.Funcionario;
import OrientacaoObjetos.SegundaParte.Atividades.entities.FuncionarioTerceiro;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        //ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        //funcionarios.addAll(funcionarios);

        System.out.print("Informe a quantidade de funcionarios: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Dados do funcionario #" + (i + 1));
            System.out.print(" Terceirizado? (s/n)" );
            char terceiro = scan.next().charAt(0);
            if (terceiro == 's') {
                System.out.print("Nome: ");
                String nome = scan.next();
                System.out.print("Horas: ");
                Integer hora = scan.nextInt();
                System.out.print("Valor por hora: ");
                Double valorHora = scan.nextDouble();
                System.out.print("Valor adicional: ");
                Double valorAdicional = scan.nextDouble();
                FuncionarioTerceiro funcionarioTerceiro = new FuncionarioTerceiro(nome, hora, valorHora, valorAdicional);
            } else {
                System.out.print("Nome: ");
                String nome = scan.next();
                System.out.print("Horas: ");
                Integer hora = scan.nextInt();
                System.out.print("Valor por hora: ");
                Double valorHora = scan.nextDouble();
                Funcionario funcionario = new Funcionario(nome, hora, valorHora);
            }


        }
        System.out.println("PAGAMENTOS:");
        for (Funcionario f : funcionarios){
            
        }

    }
}


/*

Funcionario funcionario = new Funcionario("Alex",50,20.00);
FuncionarioTerceiro funcionarioTerceiro = new FuncionarioTerceiro("Bob",100,15.00,200.00);
Funcionario funcionarioDois = new Funcionario("Maria", 60,20.00);



        System.out.println(funcionario.pagamento());
        System.out.println(funcionarioTerceiro.pagamento());
        System.out.println(funcionarioDois.pagamento());
        */


