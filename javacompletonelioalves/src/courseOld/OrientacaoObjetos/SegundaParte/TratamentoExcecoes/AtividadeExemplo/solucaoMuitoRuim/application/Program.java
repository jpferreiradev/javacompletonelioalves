package courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.solucaoMuitoRuim.application;


import courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.solucaoMuitoRuim.model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero do quarto:");
        int numero = scan.nextInt();
        System.out.print("Check-in data (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scan.next());
        System.out.print("Check-out data (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(scan.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: A data de check-out deve ser posterior à data de check-in");
        } else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a data para atualizar a sua reserva: ");
            System.out.print("Check-in data (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());

            Date hoje = new Date();
            if (checkIn.before(hoje) || checkOut.before(hoje)) {
                System.out.println("Erro na reserva: Datas de reserva para a atualização deve ser datas futuras");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: A data de check-out deve ser posterior à data de check-in");
            } else {
                reserva.updateData(checkIn, checkOut);
                System.out.println("Reserva: " + reserva);

            }


        }
    }
}