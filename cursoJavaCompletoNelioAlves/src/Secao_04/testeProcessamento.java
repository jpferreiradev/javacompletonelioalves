package Secao_04;

public class testeProcessamento {
    static void main() {

        int x, a, b;
        double y, resultado;

        x = 5;
        y = 2 * x;
        a = 5;
        b = 2;
        resultado = (double) a / b; // Exemplo de casting


        System.out.println(x);
        System.out.println(y);
        System.out.println(resultado);

        // Sabendo que vai perder dados

        double m;
        int n;


        m = 5.0;
        n = (int) m; // Casting, sabe
        System.out.println("Casting sabendo que vai perder dados:" + n);


    }
}
