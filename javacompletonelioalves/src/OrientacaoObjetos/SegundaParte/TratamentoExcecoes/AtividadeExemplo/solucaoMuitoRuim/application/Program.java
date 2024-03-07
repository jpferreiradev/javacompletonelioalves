package OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.solucaoMuitoRuim.application;

import OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.solucaoMuitoRuim.model.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Numero quarto:");
        int numero = scan.nextInt();
        System.out.print("Check-in data (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(scan.next());
        System.out.print("Check-out data (dd/MM/yyyy: ");
        Date checkOut = sdf.parse(scan.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        } else {
            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a data da reserva para atualizar:");
            System.out.print("Check-in data (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out data (dd/MM/yyyy: ");
            checkOut = sdf.parse(scan.next());

            Date agora = new Date();
            if(checkIn.before(agora) || checkOut.before(agora)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            } else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            } else{
                reserva.updateData(checkIn,checkOut);
                System.out.println("Reserva:" + reserva);
            }


        }
    }
}
