package EnumaracaoEComposicao.Atividade.application;

import EnumaracaoEComposicao.Atividade.entities.Cliente;
import EnumaracaoEComposicao.Atividade.entities.Ordem;
import EnumaracaoEComposicao.Atividade.entities.OrdemPedido;
import EnumaracaoEComposicao.Atividade.entities.Produto;
import EnumaracaoEComposicao.Atividade.entitites.enums.OrdemEStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[]args) throws ParseException {

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
        Cliente cliente = new Cliente(nomeCliente,emailCliente,sd.parse(dataNascimento));
        System.out.println("Insira os dados do pedido: ");
        Ordem ordem = new Ordem(new Date(), OrdemEStatus.PROCESSAMENTO);

        System.out.println("Quantos itens para este pedido?");
        int numeroPedidos = scan.nextInt();
        for(int i = 0; i < numeroPedidos;i++){
            System.out.println("Insira os dados do item nº" + i );
            System.out.println("Nome do produto: ");
            String nomeProduto = scan.next();
            System.out.println("Preço do produto: ");
            double precoProduto = scan.nextDouble();
            System.out.println("Quantidade: ");
            int quantidadeProduto = scan.nextInt();
            Produto produto = new Produto(nomeProduto,precoProduto);
            OrdemPedido ordemPedido = new OrdemPedido(quantidadeProduto,produto.getPreco());
        }
        

    }
}
