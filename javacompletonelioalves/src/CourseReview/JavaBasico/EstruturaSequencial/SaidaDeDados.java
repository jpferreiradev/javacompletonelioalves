package CourseReview.JavaBasico.EstruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para tirar a virgula e colocar o ponto, coloque antes;

        // Sem quebrar a linha
        System.out.print("Bom dia!");
        // Quebrando a linha
        System.out.println("Bom dia!");

        System.out.println();

        // Escrever um tipo primitivo de uma variavel Java, tipo int
        int y = 32;
        System.out.println(y);
        // Escrever um tipo primitivo, tipo double, ponto flutuante
        double x = 10.35784;
        System.out.println(x);

        // Controlar a quantidade de casas decimais
         // Utilize o printf, que significa "formatado", utilize o %.2fn" para determinar quantas casas decimais você quer
        System.out.printf("%.2f", x);
        System.out.println();
        // Concaternar ( Somar os elementos)
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f  metros%n", x);

        // Utilizando a concatenação de vários elementos em um mesmo comando de escrita

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);



    }
}
