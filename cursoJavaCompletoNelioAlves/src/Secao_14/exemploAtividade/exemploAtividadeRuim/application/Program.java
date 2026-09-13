package Secao_14.exemploAtividade.exemploAtividadeRuim.application;

import Secao_14.exemploAtividade.exemploAtividadeRuim.model.entities.Reserva;

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
            System.out.println("Entre com a data para atualizar a reserva (dd/mm/yyyy): ");
            System.out.print("Entre com a data de check-in :");
            checkIn = sdf.parse(scan.next()); // Transformar String em Date,lembre-se de usar o LocalDate
            System.out.print("Entre com a data de check-out: ");
            checkOut = sdf.parse(scan.next());


            String error = reserva.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Erro na reserva: " + error);
            } else {
                System.out.println("Reserva: " + reserva);
            }

        }


    }

}

