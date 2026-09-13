package Secao_13.exercicioFixacaoPolimorfismo.application;

import Secao_13.exercicioFixacaoPolimorfismo.entities.Produto;
import Secao_13.exercicioFixacaoPolimorfismo.entities.ProdutoImportado;
import Secao_13.exercicioFixacaoPolimorfismo.entities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    static void main() throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Entre com o número de produtos:");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do produto #" + i);
            System.out.print("Comum, usado ou importado (i/c/u)?");
            char r = scan.next().charAt(0);
            if (r == 'i') {
                System.out.print("Nome:");
                String nome = scan.next();
                System.out.print("Preço:");
                double preco = scan.nextDouble();
                System.out.print("Taxa da alfandega: ");
                double taxaAlfa = scan.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, taxaAlfa));
            } else if (r == 'c') {
                System.out.print("Nome:");
                String nome = scan.next();
                System.out.print("Preço:");
                double preco = scan.nextDouble();
                produtos.add(new Produto(nome, preco));
            } else if (r == 'u') {
                System.out.print("Nome:");
                String nome = scan.next();
                System.out.print("Preço:");
                double preco = scan.nextDouble();
                System.out.print("Data da fabricação: (dd/MM/yyyy): ");
                Date dataAniversario = sdf.parse(scan.next());
                produtos.add(new ProdutoUsado(nome,preco,dataAniversario));
            }
        }

        System.out.println();
        System.out.println("Preços: ");
        for(Produto p : produtos){
            System.out.println(p);
        }

    }
}

// Quando você fazer a edição da Data, use o parse e não o format;