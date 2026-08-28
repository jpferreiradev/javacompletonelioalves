package Secao_12.exemploAtividade_2.application;

import Secao_12.exemploAtividade_2.entities.Cliente;
import Secao_12.exemploAtividade_2.entities.ItemPedido;
import Secao_12.exemploAtividade_2.entities.Ordem;
import Secao_12.exemploAtividade_2.entities.Produto;
import Secao_12.exemploAtividade_2.enums.OrdemEStatus;
import Secao_12.exemploEnum.enums.OrdemStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o cliente: ");
        System.out.print("Nome: ");
        String nome = scan.nextLine();
        System.out.print("Entre com o e-mail: ");
        String email = scan.nextLine();
        System.out.print("Entre com a data do aniversário: (DD/MM/YYYY): ");
        Date dataAniversario = sdf.parse(scan.next()); // Transformar a String em um tipo Date

        Cliente cliente = new Cliente(nome, email, dataAniversario);

        System.out.println("Entre com o dados do pedido: ");
        System.out.print("Status: ");
        OrdemEStatus status = OrdemEStatus.valueOf(scan.next()); // Converter o valor da String para o enum

        Ordem ordem = new Ordem(new Date(),status,cliente); // Ordem assosiado ao cliente


        System.out.print("Quantos itens o pedido vai ter: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entre com o " + (i + 1) + "item: ");
            System.out.print("Nome do produto: ");
            scan.nextLine();
            String nomeProduto = scan.nextLine();
            System.out.print("Preço do produto: ");
            double precoProduto = scan.nextDouble();
            System.out.print("Quantidade: ");
            int quantidade = scan.nextInt();

            Produto produto = new Produto(nomeProduto,precoProduto); // Instanciar o produto
            ItemPedido it = new ItemPedido(quantidade,precoProduto,produto); // Associar/Instanciar, criou na memoria um objeto item associado ao produto
            ordem.adicionarItens(it);
        }

        System.out.println();
        System.out.println(ordem);
        scan.close();
    }
}

// Instanciar o produto, instancia o item assosiado ao produto, e depois inserir esse item de pedido, no pedido

/*


        System.out.println("Entre com a ordem do processo: ");
        System.out.print("Status:");
        String ordemProcesso = scan.nextLine();
        Cliente c1 = new Cliente(nome, email, sdf.parse(dataAniversario));
        Date date = new Date();
        Ordem ordem1 = new Ordem(date, OrdemEStatus.valueOf(scan.nextLine()));

        System.out.println(c1.toString());
        System.out.println(ordem1.toString());

          Produto p1 = new Produto("TV", 1000.0);

        ItemPedido item1 = new ItemPedido(1, 1000.0, p1); // Aqui é uma composição de objetos, p1 é a composição
        Cliente cliente = new Cliente("Maria","maria@gmail.com",sdf.parse("20/10/1995"));
        System.out.println(item1.getProduto().getNome());
        System.out.println(item1);

 */