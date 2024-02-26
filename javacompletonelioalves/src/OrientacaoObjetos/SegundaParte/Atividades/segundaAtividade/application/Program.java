package OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.application;

import OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.Produto;
import OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.ProdutoImportado;
import OrientacaoObjetos.SegundaParte.Atividades.segundaAtividade.entities.ProdutoUsado;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Produto produto = new Produto("Notebook",1100.00);
        ProdutoImportado produtoImportado = new ProdutoImportado("Tablet",280.00,20.00);
        ProdutoUsado produtoUsado = new ProdutoUsado("Iphone",400.00,new Date());

        System.out.println(produto.etiquetaDePreco());
        System.out.println(produtoImportado.etiquetaDePreco());
        System.out.println(produtoUsado.etiquetaDePreco());


    }
}
