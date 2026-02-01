package JavaBasico.EstruturaSequencial;

import java.util.Locale;

public class ExemploSaidaDeDadosTres {
    static void main() {

        Locale.setDefault(Locale.US);

        double x = 10.35784;

        System.out.println("RESULTADO = " + x + " METROS"); // UTILIZANDO O PRINTLN
        System.out.printf("RESULTADO = %.2f metros%n",x); //UTILIZANDO O PRINTF

        System.out.println();
        System.out.println();
        System.out.println("------ OUTRO EXEMPLO -----");

        String nome = "Maria";
        int idade = 34;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);



    }
}
