package EnumaracaoEComposicao.Atividade.application;

import EnumaracaoEComposicao.Atividade.entities.Cliente;
import EnumaracaoEComposicao.Atividade.entities.Ordem;
import EnumaracaoEComposicao.Atividade.entities.OrdemPedido;
import EnumaracaoEComposicao.Atividade.entities.Produto;
import EnumaracaoEComposicao.Atividade.entitites.enums.OrdemEStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);

        SimpleDateFormat sd = new SimpleDateFormat("DD/mm/YYYY");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


        System.out.println("Insira os dados do cliente: ");
        System.out.print("Nome: ");
        String nomeCliente = scan.nextLine();
        System.out.print("Email: ");
        String emailCliente = scan.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = scan.next();
        Cliente cliente = new Cliente(nomeCliente, emailCliente, sd.parse(dataNascimento));

        System.out.println("Insira os dados do pedido: ");
        System.out.print("Status: ");
        String statusPedido = scan.next();
        //System.out.println("Status:" + OrdemEStatus.valueOf(statusPedido));


        System.out.print("Quantos itens para este pedido?");
        int numeroPedidos = scan.nextInt();
        for (int i = 0; i < numeroPedidos; i++) {
            System.out.println("Insira os dados do item nº" + (i + 1));
            System.out.print("Nome do produto: ");
            String nomeProduto = scan.next();
            System.out.print("Preço do produto: ");
            double precoProduto = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidadeProduto = scan.nextInt();
            Produto produto = new Produto(nomeProduto, precoProduto);
            OrdemPedido ordemPedido = new OrdemPedido(quantidadeProduto, produto.getPreco());
        }

        Ordem ordem = new Ordem(sdf.parse("20/04/2018 11:25:09"), OrdemEStatus.valueOf(statusPedido));
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println("Momento do pedido: " + ordem.getMomento());
        System.out.println("Status do pedido: " + statusPedido);
        System.out.println(cliente.toString());
        System.out.println("Lista de ordem dos itens: ");
        System.out.println();

        System.out.println("Preço total: ");





    }
}

/*
System.out.println("Cliente: " + cliente.getNome() +  cliente.getDataAniversario() + cliente.getEmail() );
        System.out.println("Itens em ordem: ");
 */