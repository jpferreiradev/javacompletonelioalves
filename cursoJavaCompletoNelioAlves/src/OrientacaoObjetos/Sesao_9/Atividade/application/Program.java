package OrientacaoObjetos.Sesao_9.Atividade.application;

import OrientacaoObjetos.Sesao_9.Atividade.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        /*
        Conta conta = new Conta();
        conta.setNumeroDaConta(8532);
        conta.setTitular("Alex Green");
        conta.setValorDeposito(500.00);

        System.out.println(conta.deposito(200.000));
        System.out.println(conta.saque(300.00));
        //Conta conta2 = new Conta(8532,"Maria",500.00);

        //System.out.println(conta2.deposito(200.00));
        //System.out.println(conta2.saque(300.00));


        */

        char escolha;
        Conta conta2;


        System.out.print("Entre com o número da conta: ");
        int numeroConta = scan.nextInt(); // Variavel temporaria
        scan.nextLine();
        System.out.print("Entre com o nome: ");
        String nome = scan.nextLine();
        System.out.print("Vai ter um deposito inicial?");
        escolha = scan.next().charAt(0);
        if (escolha == 's') {
            System.out.println("Entre com o valor do deposito inicial: ");
            double valorDeposito = scan.nextDouble();
            conta2 = new Conta(numeroConta, nome, valorDeposito);
        } else {
            conta2 = new Conta(numeroConta, nome);
        }
        System.out.println("Dados da conta: ");
        System.out.println(conta2.toString());

        System.out.print("Entre com o valor do deposito:  ");
        double deposito = scan.nextDouble();
        conta2.deposito(deposito);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta2.toString());

        System.out.print("Entre com o valor do saque:  ");
        double valorSaque = scan.nextDouble();
        conta2.saque(valorSaque);

        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta2.toString());


    }
}
