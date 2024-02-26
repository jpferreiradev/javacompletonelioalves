package OrientacaoObjetos.SegundaParte.Atividades.application;

import OrientacaoObjetos.SegundaParte.Atividades.entities.Funcionario;
import OrientacaoObjetos.SegundaParte.Atividades.entities.FuncionarioTerceiro;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US); // Classe para mudar a região, usar o . em vez da ,
        Scanner scan = new Scanner(System.in);

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        //List<Funcionario> list = new ArrayList<>(); -> Ele fez dessa maneira;

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
                //FuncionarioTerceiro funcionarioTerceiro = // Outra forma de fazer, adicionando na lista;
                funcionarios.add(new FuncionarioTerceiro(nome, hora, valorHora, valorAdicional));
            } else {
                System.out.print("Nome: ");
                String nome = scan.next();
                System.out.print("Horas: ");
                Integer hora = scan.nextInt();
                System.out.print("Valor por hora: ");
                Double valorHora = scan.nextDouble();
                //Funcionario funcionario = // Outra forma de fazer adicionando na lista;
                funcionarios.add(new Funcionario(nome, hora, valorHora));
            }


        }


        System.out.println("PAGAMENTOS:");
        for (Funcionario f : funcionarios){
            System.out.println(f.getNome() + " - $" + f.pagamento());

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


