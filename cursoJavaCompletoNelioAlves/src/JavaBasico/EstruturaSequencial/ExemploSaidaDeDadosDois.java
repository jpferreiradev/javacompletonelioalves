package JavaBasico.EstruturaSequencial;

import java.util.Locale;

public class ExemploSaidaDeDadosDois {
    static void main() {

        Locale.setDefault(Locale.US); // Separador de decimais, em vez da vírgula seria o .


        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        // Caso queria formartar as casas decimais, utilize o printf, o f significa "formatado", o %n é a quebra de linha;
        System.out.printf("%.2f%n",x);

    }
}
