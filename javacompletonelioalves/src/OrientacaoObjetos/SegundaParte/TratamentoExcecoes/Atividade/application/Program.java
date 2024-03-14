package OrientacaoObjetos.SegundaParte.TratamentoExcecoes.Atividade.application;

import OrientacaoObjetos.SegundaParte.TratamentoExcecoes.Atividade.model.entities.Conta;
import OrientacaoObjetos.SegundaParte.TratamentoExcecoes.Atividade.model.exceptions.ExceptionNumero;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        System.out.println("Insira os dados da conta:");
        System.out.print("Número:");
        int numero = scan.nextInt();
        System.out.print("Nome:");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.print("Saldo inicial:");
        double saldo = scan.nextDouble();
        System.out.print("Limite de retirada:");
        double limiteRetirada = scan.nextDouble();
        Conta conta = new Conta(numero, nome, saldo, limiteRetirada);

        System.out.println();
        System.out.print("Insira o novo valor de saque:");
        limiteRetirada = scan.nextDouble();

        try {
            conta.sacar(limiteRetirada);
        }catch (ExceptionNumero e) {
            System.out.println(e.getMessage());
        }

    }

}

