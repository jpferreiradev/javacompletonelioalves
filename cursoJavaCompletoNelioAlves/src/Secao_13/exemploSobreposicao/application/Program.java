package Secao_13.exemploSobreposicao.application;

import Secao_13.exemploSobreposicao.entities.Conta;
import Secao_13.exemploSobreposicao.entities.ContaEmpresarial;
import Secao_13.exemploSobreposicao.entities.ContaPoupanca;

public class Program {
    static void main() {

       Conta conta1 = new Conta(1001,"Alex",1000.0); // Exemplo class com metodo normal
        conta1.saque(200.0);
        System.out.println("R$ " + conta1.getSaldoDaConta());

       Conta conta2 = new ContaPoupanca(1002,"Maria",1000.0,0.1); // Exemplo sobreposição de metodo na class ContaPoupanca
       conta2.saque(200.0);
        System.out.println("Exemplo de sobreposição: R$ " + conta2.getSaldoDaConta());

        Conta conta3 = new ContaEmpresarial(1003,"Juan",1000.0,500.0);
        conta3.saque(200.0);
        System.out.println("R$ " + conta3.getSaldoDaConta());
    }
}
