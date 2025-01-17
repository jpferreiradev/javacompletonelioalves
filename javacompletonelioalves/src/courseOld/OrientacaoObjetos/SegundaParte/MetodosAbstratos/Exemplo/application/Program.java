package courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.application;

import courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.entities.Circulo;
import courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.entities.Forma;
import courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.entities.Retangulo;
import courseOld.OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.entities.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Retangulo retangulo = new Retangulo(Cor.PRETO,4.0,5.0);
        //Circulo circulo = new Circulo(Cor.VERMELHO,3.0);

        //System.out.println(retangulo.area());
        //System.out.println(circulo.area());

        List<Forma> list = new ArrayList<>();


        System.out.print("Entre com o numero de formas:");
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println("Dados de forma #" + (i + 1));
            System.out.println("Rentangulo ou circulo? (r/c)");
            char letra = scan.next().charAt(0);

            if (letra == 'r') {
                System.out.print(" Cor: (PRETO/AZUL/VERMELHO)");
                Cor cor = Cor.valueOf(scan.next());
                System.out.print(" Largura:");
                double largura = scan.nextDouble();
                System.out.println(" Altura: ");
                double altura = scan.nextDouble();
                list.add(new Retangulo(cor, largura, altura));
            } else if(letra == 'c') {
                System.out.print("Cor");
                Cor cor = Cor.valueOf(scan.next());
                System.out.print("Raio");
                double raio = scan.nextDouble();
                list.add(new Circulo(cor,raio));
            }
        }

        System.out.println();
        System.out.println("Tamanho das areas: ");
        for(Forma f : list){
            System.out.println(String.format("%.2f",f.area()));
            //System.out.print(String.format("%.2f",f));
        }

    }
}
