package CourseReview.QuestoesDoCurso.SecaoNove.PrimeiraQuestao.application;

import CourseReview.QuestoesDoCurso.SecaoNove.PrimeiraQuestao.entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com numero da conta: ");
        int numero = scan.nextInt();
        System.out.print("Entre com nome da conta: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.print("Vai ter deposito inicial: (S/N): ");
        char resposta = scan.next().charAt(0);
        if (resposta == 's') {
            System.out.print("Informe o valor do deposito inicial: ");
            double depositoInicial = scan.nextDouble();
            conta = new Conta(numero, nome, depositoInicial);
        } else {
            conta = new Conta(numero, nome);
        }
        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe um valor para deposito: ");
        double valorDeposito = scan.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados atualizados: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com o valor para o saque: ");
        double valorSaque = scan.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Dados atualizados: ");
        System.out.println(conta);




    }
}
