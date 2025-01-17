package courseOld.OrientacaoObjetos.Atividades.questao04;

import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Conta conta;

        System.out.print("Enter account number: ");
        int numeroConta = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.print("Is there na initial deposit(y/n)?");
        char resposta = scan.next().charAt(0);
        if( resposta == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            conta = new Conta(numeroConta,nome,initialDeposit); // Aqui está a sua duvida sobre como criar o objeto nessa situação;
        }
        else{
            conta = new Conta(numeroConta,nome);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double valorDeposito = scan.nextDouble();
        conta.desposito(valorDeposito);
        System.out.println("Update account data: ");
        System.out.println(conta);


        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double valorSaque = scan.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Update account data: ");
        System.out.println(conta);

    }
}

/*


        System.out.println("Account: " + numeroConta + ", Holder: " + nome + ", Balance:" + primeiraConta.getValorDeposito());
            System.out.println("Is there na initical deposit (y/n)? ");
            primeiraConta.desposito(200.00);
        primeiraConta.saque(300.00);

 */