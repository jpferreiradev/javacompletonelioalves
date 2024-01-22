package EnumaracaoEComposicao.application;

import EnumaracaoEComposicao.entities.OrderStatus;
import EnumaracaoEComposicao.entities.Pedido;

import java.util.Date;

public class Program {
    public static void main(String[]args){

        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PROCESSANDO_PAGAMENTO);
        Pedido pedido2 = new Pedido(1090,new Date(), OrderStatus.ENTREGUE);

        System.out.println(pedido);
        System.out.println(pedido2);

        // CONVERSÃO DE STRING PARA UNUM
        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE"); // Meotdo valueOf faz a conversão

        System.out.println(os1);
        System.out.println(os2);

    }
}
