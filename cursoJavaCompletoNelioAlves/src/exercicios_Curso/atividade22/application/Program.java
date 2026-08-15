package exercicios_Curso.atividade22.application;

import exercicios_Curso.atividade22.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o número da conta:");
        int numeroConta = scan.nextInt();
        System.out.print("Entre com nome do titular: ");
        scan.nextLine();
        String nomeTitular = scan.nextLine();
        System.out.print("Irá ter um deposito inicial? (s/n) ");
        char resposta = scan.next().charAt(0);
        if(resposta == 's'){
            System.out.print("Entre com o valor do deposito: ");
            double deposito = scan.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, deposito);
        } else{
           conta = new Conta(numeroConta, nomeTitular);
        }
        System.out.println();
        System.out.println("Atualização da conta: ");
        System.out.println(conta);

        System.out.println("Entre com o valor do deposito:");
        double deposito = scan.nextDouble();
        conta.depositar(deposito);

        System.out.println("Atualização: ");
        System.out.println(conta);

        System.out.println("Entre com o valor do saque: ");
        double saque = scan.nextDouble();
        conta.sacar(saque);

        System.out.println("Atualização: ");
        System.out.println(conta);
    }
}
