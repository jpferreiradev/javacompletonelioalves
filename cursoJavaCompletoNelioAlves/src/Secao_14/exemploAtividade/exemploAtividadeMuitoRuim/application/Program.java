package Secao_14.exemploAtividade.exemploAtividadeMuitoRuim.application;

import Secao_14.exemploAtividade.exemploAtividadeMuitoRuim.model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    static void main() throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número do quarto: ");
        int n = scan.nextInt();
        System.out.print("Entre com a data de check-in dd/mm/yyyy: ");
        Date checkIn = sdf.parse(scan.next()); // Transformar String em Date,lembre-se de usar o LocalDate
        System.out.print("Entre com a data de check-out: ");
        Date checkOut = sdf.parse(scan.next());

        if (!checkOut.after(checkIn)) { // after, uma data é depois da outra, usa o ! negando tudo;
            System.out.println("Erro na reserva: O check-out não pode ser depois do check-in!");
        } else {
            Reserva reserva = new Reserva(n, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a data para atualizar a reserva: ");
            System.out.print("Entre com a data de check-in dd/mm/yyyy: ");
            checkIn = sdf.parse(scan.next()); // Transformar String em Date,lembre-se de usar o LocalDate
            System.out.print("Entre com a data de check-out: ");
            checkOut = sdf.parse(scan.next());

            Date agora = new Date();
            if (checkIn.before(agora) || checkOut.before(agora)) {
                System.out.println("As datas de reserva para a atualização devem ser datas futuras.");
            } else if (!checkOut.after(checkIn)) {
                System.out.println("A data de check-out deve ser posterior à data de check-in.");
            } else {
                reserva.updateDatas(checkIn, checkOut);
                System.out.println("Reserva: " + reserva);
            }


        }

    }
}
