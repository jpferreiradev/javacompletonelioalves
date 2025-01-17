package courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoRuim.application;


import courseOld.OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoRuim.model.entities.Reserva;

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



            // Solução menos ruim
            String error = reserva.updateData(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error na reserva:" + error);
            } else {
                System.out.println("Reserva: " + reserva);

            }


        }
    }
}
