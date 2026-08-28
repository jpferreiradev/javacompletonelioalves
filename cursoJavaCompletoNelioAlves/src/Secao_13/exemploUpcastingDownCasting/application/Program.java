package Secao_13.exemploUpcastingDownCasting.application;

import Secao_13.exemploUpcastingDownCasting.entities.Conta;
import Secao_13.exemploUpcastingDownCasting.entities.ContaEmpresarial;
import Secao_13.exemploUpcastingDownCasting.entities.ContaPoupanca;

public class Program {
    static void main() {

        Conta conta = new Conta(1001, "Alex", 0.0);

        ContaEmpresarial contaEmpresarial = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Conta conta1 = contaEmpresarial; // Usando a class filha
        Conta conta2 = new ContaEmpresarial(1003, "Bob", 0.0, 200.0);
        Conta conta3 = new ContaPoupanca(1004,"Ana",0.0,0.1);

        // DOWNCASTING
        ContaEmpresarial conta4 = (ContaEmpresarial) conta2; // Exemplo de casting de tipos
        conta4.emprestimo(100.0);

        // ContaEmpresarial conta5 = (ContaEmpresarial) conta3; // Aqui vai dar erro em tempo de execuação, CastException

        // InstanOF
        if(conta3 instanceof ContaEmpresarial){ // comparação de classes
            ContaEmpresarial conta5 = (ContaEmpresarial) conta3;
            conta5.emprestimo(200.0);
            System.out.println("Emprestimo!");
        }
        if(conta3 instanceof ContaPoupanca){
            ContaPoupanca conta5 = (ContaPoupanca) conta3;
            conta5.atualizaSaldo();
            System.out.println("Saldo atualizado!");
        }


    }
}
