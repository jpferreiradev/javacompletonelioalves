package OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.application;

import OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.entities.Contribuinte;
import OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.entities.Fisica;
import OrientacaoObjetos.SegundaParte.MetodosAbstratos.Exemplo.Atividade.entities.Juridica;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Contribuinte contribuinte = new Fisica("Alex",50000.00,2000.00);
        //Contribuinte contribuinte1 = new Juridica("Softech",400000.00,25);
        //Contribuinte contribuinte2 = new Fisica("Bob",120000.00,1000.00);

        //System.out.println(contribuinte.taxa());
        //System.out.println(contribuinte1.taxa());
        //System.out.println(contribuinte2.taxa());

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Dados do contribuinte #" + (i + 1));
            System.out.print("Contribuinte físico ou juridico?");
            char c = scan.next().charAt(0);
            if (c == 'i') {
                System.out.print("Nome:");
                String nome = scan.next();
                System.out.print("Renda Anual:");
                double rendaAnual = scan.nextDouble();
                System.out.print("Despesa de saúde: ");
                double depeSaude = scan.nextDouble();
                list.add(new Fisica(nome, rendaAnual, depeSaude));
            } else {
                System.out.print("Nome:");
                String nome = scan.next();
                System.out.print("Renda Anual:");
                double rendaAnual = scan.nextDouble();
                System.out.print("Numero de funcionarios: ");
                int numeroFuncionario = scan.nextInt();
                list.add(new Juridica(nome, rendaAnual, numeroFuncionario));
            }


        }

        System.out.println();

        System.out.println("Impostos pagos: ");
        for( Contribuinte f : list){
            //System.out.printf(String.format(f.getNome() + ": $" + f.taxa()));
            //System.out.println(f.getNome() + ": $" + f.taxa());
            //System.out.println(String.format("%.2f",f.area()));
            System.out.println(String.format(f.getNome() + ": $ %.2f",f.taxa()));
        }



        System.out.println();


        double cont = 0.0;
        for( Contribuinte f : list){
           cont += f.taxa();


        }
        System.out.println("Total de impostos: $ " + cont);
    }

}

