package courseOld.OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.application;

import courseOld.OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.Produto;
import courseOld.OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.ProdutoImportado;
import courseOld.OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.ProdutoUsado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {
    public static void main(String[]args) {

        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); -> Substituido pelo LocalDate
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Produto> list = new ArrayList<>();
        //List<Funcionario> list = new ArrayList<>();
        System.out.print("Insira a quantidade de produtos:");
        int n = scan.nextInt();

        for(int i = 0; i < n;i++){
            System.out.println("Informações do produto #" + (1 +i));
            System.out.println("Produto comum, usado ou importado? (c/u/i)");
            char x = scan.next().charAt(0);
            if( x == 'i' ){
                System.out.print(" Nome:");
                String nome = scan.next();
                System.out.print(" Preço:");
                double preco = scan.nextDouble();
                System.out.print(" Isenção da alfandega:");
                double isencaoAlfandega = scan.nextDouble();
                Produto produtoImportado = new ProdutoImportado(nome,preco,isencaoAlfandega);
                list.add(produtoImportado);
            } else if (x == 'c') {
                System.out.print(" Nome:");
                String nome = scan.next();
                System.out.print(" Preço:");
                double preco = scan.nextDouble();
                Produto produto = new Produto(nome,preco);
                list.add(produto);
            } else if (x == 'u'){
                System.out.print(" Nome:");
                String nome = scan.next();
                System.out.print(" Preço:");
                double preco = scan.nextDouble();
                System.out.print(" Data de fabricação: DD/MM/YYYY: ");
                //String data = scan.next();
                LocalDate date = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Produto produdoUsado = new ProdutoUsado(nome,preco,date);
                list.add(produdoUsado);
            }

        }
        System.out.println();
        System.out.println("Etiqueta de preço:");
        for( Produto p : list){
            System.out.println(p.etiquetaDePreco());
        }


    }
}

/*
 Produto produto = new Produto("Notebook",1100.00);
        ProdutoImportado produtoImportado = new ProdutoImportado("Tablet",280.00,20.00);
        ProdutoUsado produtoUsado = new ProdutoUsado("Iphone",400.00,new Date());

        System.out.println(produtoImportado.etiquetaDePreco());
        System.out.println(produto.etiquetaDePreco());
        System.out.println(produtoUsado.etiquetaDePreco());
 */