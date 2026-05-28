package OrientacaoObjetos.Sessao_10.Vetor.ExemploVetor_Referencia.application;

import OrientacaoObjetos.Sessao_10.Vetor.ExemploVetor_Referencia.entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor_TiposReferencia {
    static void main() {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos: ");
        int valor = scan.nextInt();

        Produto[] produtos = new Produto[valor];

        for (int i = 0; i < produtos.length; i++) {
            scan.nextLine();
            String nomeProduto = scan.next();
            double valorProduto = scan.nextDouble();
            produtos[i] = new Produto(nomeProduto, valorProduto); // Instanciar o novo produto e apontar para esse objeto;

        }
        double soma = 0.0;
        double media = 0.0;
        for (int i = 0; i < produtos.length; i++) {
            //soma = soma + produtos[i].getPrecoProduto();
            soma += produtos[i].getPrecoProduto();
        }
        media = soma / produtos.length;

        System.out.printf("MÉDIA DOS PREÇOS: %.2f ",media);
    }
}
