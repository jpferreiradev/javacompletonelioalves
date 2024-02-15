package EnumaracaoEComposicao.AtividadeCorrigida.application;

import EnumaracaoEComposicao.Atividade.entities.OrdemPedido;
import EnumaracaoEComposicao.AtividadeCorrigida.entities.Cliente;
import EnumaracaoEComposicao.AtividadeCorrigida.entities.ItemPedido;
import EnumaracaoEComposicao.AtividadeCorrigida.entities.Ordem;
import EnumaracaoEComposicao.AtividadeCorrigida.entities.Produto;
import EnumaracaoEComposicao.AtividadeCorrigida.entities.entitiesEnum.OrdemStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente:");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.next();
        System.out.println("Data de aniversario: (DD/MM/YYYY): ");
        Date dataAniversario = sdf.parse(scan.next()); // Parse, para transformar o String que é digitado para o tipo Date

        Cliente cliente = new Cliente(nome, email, dataAniversario);

        System.out.println("Insira os dados do pedido:");
        System.out.println("Status: ");
        OrdemStatus status = OrdemStatus.valueOf(scan.next()); // valueOf converter a String para o valor correspondente ao Enum
        Ordem ordem = new Ordem(new Date(),status,cliente);


        System.out.println("Quantos itens o pedido vai ter: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Insira os dados do item" + (i + 1));
            System.out.print("Nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Preço do produto: ");
            double valorProduto = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            Produto produto = new Produto(nomeProduto, valorProduto);
            //Ordem it = new Ordem()
            ItemPedido it = new ItemPedido(quantidade, valorProduto, produto); // Instanciou um objeto ItemPedido associado a um objeto Produto
            ordem.adicionarItem(it);

        }
        System.out.println();
        System.out.println(ordem);

    }
}

/*
Produto p = new Produto("TV",1000.0);
ItemPedido oi1 = new ItemPedido(1,1000.0,p);

//System.out.println(oi1.getProduto().getNome());
 Cliente cliente = new Cliente("Maria","maria@gmail.com", sdf.parse("20/10/1995"));
 */