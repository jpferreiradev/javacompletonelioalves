package OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoBoa.application;


import OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoBoa.model.entities.Reserva;
import OrientacaoObjetos.SegundaParte.TratamentoExcecoes.AtividadeExemplo.SolucaoBoa.model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Numero do quarto:");
            int numero = scan.nextInt();
            System.out.print("Check-in data (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(scan.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(scan.next());


            Reserva reserva = new Reserva(numero, checkIn, checkOut);
            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com a data para atualizar a sua reserva: ");
            System.out.print("Check-in data (dd/MM/yyyy): ");
            checkIn = sdf.parse(scan.next());
            System.out.print("Check-out data (dd/MM/yyyy): ");
            checkOut = sdf.parse(scan.next());


            reserva.updateData(checkIn, checkOut);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e){ // Essa exceção aqui eu sei que pode acontecer
            System.out.println("Formato de dados inválido");
        }
        catch (DomainException e ){ // Essa exceção aqui, é tratada com uma mensagem personalizada
            System.out.println("Error na reserva: " + e.getMessage());
        }
        catch ( RuntimeException e){ // Um tipo de exceção generico, que é feito um Upcasting para o RuntimeException e você dar mensagem generica
            System.out.println("Erro inesperado...");
        }
    }


}


/*
            catch (DomainException e ){
            System.out.println("Error na reserva: " + e.getMessage());
        }
 */