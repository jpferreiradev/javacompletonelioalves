package Secao_14.exemploAtividade.exemploAtividadeBom.VersaoException.application;

import Secao_14.exemploAtividade.exemploAtividadeBom.VersaoException.model.entities.Reserva;
import Secao_14.exemploAtividade.exemploAtividadeBom.VersaoException.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    static void main() {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número do quarto: ");
            int n = scan.nextInt();
            System.out.print("Entre com a data de check-in dd/mm/yyyy: ");
            Date checkIn = sdf.parse(scan.next()); // Transformar String em Date,lembre-se de usar o LocalDate
            System.out.print("Entre com a data de check-out: ");
            Date checkOut = sdf.parse(scan.next());


            Reserva reserva = new Reserva(n, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a data para atualizar a reserva (dd/mm/yyyy): ");
            System.out.print("Entre com a data de check-in :");
            checkIn = sdf.parse(scan.next()); // Transformar String em Date,lembre-se de usar o LocalDate
            System.out.print("Entre com a data de check-out: ");
            checkOut = sdf.parse(scan.next());


            reserva.updateDates(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

        } catch (ParseException e) {
            System.out.println("Data inválida!");
        } catch (DomainException e) {
            System.out.println("Error na reserva:" + e.getMessage());
        }


        scan.close();
    }

}

