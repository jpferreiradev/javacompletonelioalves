package Secao_04;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class exemploSaidaDeDados {
    static void main() {

        Locale.setDefault(Locale.US);

        int y = 32;
        double x = 10.35784;
        String nome = "Maria";
        int idade = 34;
        double renda = 4000.0;

        System.out.println("Olá, mundo");
        System.out.println("Bom dia");


        System.out.println(y);

        System.out.println(x);
        System.out.printf("%.2f%n",x); // Delimitar casas decimais;
        // Concatenção
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n",x);
        System.out.println();


        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n",nome,idade,renda); // Marcador


    }
}
