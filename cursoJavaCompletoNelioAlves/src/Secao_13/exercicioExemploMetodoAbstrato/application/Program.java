package Secao_13.exercicioExemploMetodoAbstrato.application;

import Secao_13.exercicioExemploMetodoAbstrato.entities.Circulo;
import Secao_13.exercicioExemploMetodoAbstrato.entities.Forma;
import Secao_13.exercicioExemploMetodoAbstrato.entities.Retangulo;
import Secao_13.exercicioExemploMetodoAbstrato.entities.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Forma> formas = new ArrayList<>();

        System.out.print("Entre com o número de figuras: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Forma #" + i + " dados");
            System.out.print("Retângulo ou círculo (r/c): ");
            char c = scan.next().charAt(0);
            if (c == 'r') {
                System.out.print("Qual a cor? (BLACK/BLUE/RED)");
                Cor cor = Cor.valueOf(scan.next());
                System.out.print("Largura: ");
                double largura = scan.nextDouble();
                System.out.print("Altura: ");
                double altura = scan.nextDouble();
                //Retangulo retangulo =
                formas.add(new Retangulo(cor, largura, altura));

            } else {
                System.out.print("Qual a cor? (BLACK/BLUE/RED)");
                Cor cor = Cor.valueOf(scan.next());
                System.out.print("Raio: ");
                double r = scan.nextDouble();
                formas.add(new Circulo(cor, r));
            }
        }
        System.out.println();
        System.out.println("Valor das formas: ");
        for (Forma f : formas) {
            System.out.printf("%.2f%n",f.area());
        }

    }
}
