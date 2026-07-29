package Secao_04;

import java.util.Locale;

public class atividadeSaidaDeDados {
    static void main() {

        //Locale.setDefault(Locale.US);

        String produto1 = "Computer";
        String produto2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s ,witch price is $ %.2f%n",produto1,preco1);
        System.out.printf("%s, witch price is $ %.2f%n%n",produto2,preco2);
        System.out.printf("Record : %d years old, code %d and gender: %c%n%n",age,code,gender);
        System.out.printf("Measue with eight decimal places: %f%n",measure);
        System.out.printf("Rouded (three decimal places): %.3f%n",measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f",measure);
    }
}
