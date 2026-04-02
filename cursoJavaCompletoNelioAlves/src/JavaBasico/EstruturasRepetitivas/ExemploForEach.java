package JavaBasico.EstruturasRepetitivas;

import java.sql.SQLOutput;

public class ExemploForEach {
    static void main() {

        String nomes[] = new String[2];

        nomes[0] = "João";
        nomes[1] = "Paulo";

        System.out.println("NOMES: ");
        for(String nome : nomes) {
            System.out.println(nome);
        }

        int idades[] = new int[2];


        idades[0] = 33;
        idades[1] = 34;

        System.out.println();
        System.out.println("IDADES: ");
        for(int idade : idades){
            System.out.println(idade);
        }
    }
}
