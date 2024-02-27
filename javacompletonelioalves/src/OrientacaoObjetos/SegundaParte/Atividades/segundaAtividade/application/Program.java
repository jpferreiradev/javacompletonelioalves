package OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.application;

import OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.Produto;
import OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.ProdutoImportado;
import OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.ProdutoUsado;

import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[]args){

        SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
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
                System.out.print(" Data de fabricação: DD/MM/YYYY");
                String data = scan.next();
                Produto produdoUsado = new ProdutoUsado(nome,preco,new Date(sdf.format(data)));
                list.add(produdoUsado);
            }

        }
        System.out.println("Etiqueta de preço");
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