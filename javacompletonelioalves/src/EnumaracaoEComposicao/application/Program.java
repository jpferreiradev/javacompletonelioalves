package EnumaracaoEComposicao.application;

import EnumaracaoEComposicao.entities.Pedido;
import EnumaracaoEComposicao.etities.enums.OrdemEstatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080,new Date(), OrdemEstatus.AGUARDANDO_PAGAMENTO);
        Pedido pedidoDois = new Pedido(1050,new Date(),OrdemEstatus.PROCESSANDO);
        System.out.println(pedido);

        OrdemEstatus os1 = OrdemEstatus.ENVIADO;
        //OrdemEstatus os2 = OrdemEstatus.valueOf("Não enviado"); // Conversão de String para enum
        OrdemEstatus os2 = OrdemEstatus.valueOf("ENVIADO"); // Conversão de String para enum

        System.out.println(os1);
        System.out.println(os2);

    }
}
