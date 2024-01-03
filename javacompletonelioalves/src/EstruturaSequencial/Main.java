package EstruturaSequencial;

import java.util.Locale;

public class Main {
    public static void main(String [] args){

        int i = 10;
        double y = 10.35784;
        String nome = "JP";
        int idade = 31;
        double renda = 4000.0;

        System.out.print("Olá, mundo");
        System.out.println("Bom dia");

        System.out.println(i);
        System.out.printf("%.2f%n",y); // Imprimir com a quantidade de casas decimais;
        //System.out.printf("%.4f%\n",y); // Imprimir com a quantidade de casas decimais, 4; // nesse formato deu erro
        System.out.printf("%.4f%n", y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n",y); // A partir daqui ele imprime com o .(ponto)
        System.out.println("RESULTADO = " + y + " METROS"); // ExemploWhile de concatenação
        System.out.printf("RESULTADO = %.2f metros%n" , y);
        //System.out.println("RESULTADO = %.2f(pra ficar duas casas decimais) metros(variavel)%n( quebra de linha");
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,idade,renda);


    }
}
