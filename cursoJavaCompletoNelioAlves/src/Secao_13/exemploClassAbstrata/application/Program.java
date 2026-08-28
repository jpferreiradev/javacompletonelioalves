package Secao_13.exemploClassAbstrata.application;


import Secao_13.exemploClassAbstrata.entities.Conta;
import Secao_13.exemploClassAbstrata.entities.ContaEmpresarial;
import Secao_13.exemploClassAbstrata.entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        List<Conta> list = new ArrayList<>();
        list.add(new ContaPoupanca(1001, "Alex", 500.00, 0.01));
        list.add(new ContaEmpresarial(1002, "Maria", 1000.0, 400.0));
        list.add(new ContaPoupanca(1004, "Bob", 300.0, 0.01));
        list.add(new ContaEmpresarial(1005, "Anna", 500.0, 500.0));


        double soma = 0.0;
        for (Conta c : list) {
            soma += c.getSaldoDaConta();
        }
        System.out.printf("%.2f", soma);
        System.out.println();

        System.out.println("Lista de contas:");
        for (Conta c : list) {
            System.out.printf("Saldo atualizado para a conta %d: %.2f%n", c.getNumero(), c.getSaldoDaConta());
        }
        System.out.println();
        System.out.println("Contas e saldos atualizados: ");
        for (Conta c : list) {
            c.deposito(10.0);
        }
        for (Conta c : list) {
            System.out.printf("Saldo atualizado para a conta %d: %.2f%n", c.getNumero(), c.getSaldoDaConta());
        }
    }
}
