package Secao_05;

public class exeploOperadorTernario {
    static void main() {

       double preco = 34.5;
       double desconto;

       // exemplo Operador Ternario
        desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
    }
}
