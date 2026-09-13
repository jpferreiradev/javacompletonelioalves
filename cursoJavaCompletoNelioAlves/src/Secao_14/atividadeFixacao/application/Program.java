package Secao_14.atividadeFixacao.application;

import Secao_14.atividadeFixacao.entities.Conta;
import Secao_14.atividadeFixacao.exceptions.RegraNegocioException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o número da conta: ");
        System.out.print("Número: ");
        int numero = scan.nextInt();
        System.out.print("Nome:");
        scan.nextLine();
        String nomeTitular = scan.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoInicial = scan.nextDouble();
        System.out.print("Limite de saque: ");
        double limiteSaque = scan.nextDouble();
        Conta conta = new Conta(numero, nomeTitular, saldoInicial, limiteSaque);

        System.out.print("Insira o valor do saque: ");
        double valorSaque = scan.nextDouble();


        try {
            conta.sacar(valorSaque);
            System.out.printf("Novo saldo: %.2f%n", conta.getSaldo());
        } catch (RegraNegocioException e) { // Exceção personalizada

            System.out.println(e.getMessage()); // Aqui pega a String armazenada na exceção
        }


        scan.close();
    }
}
