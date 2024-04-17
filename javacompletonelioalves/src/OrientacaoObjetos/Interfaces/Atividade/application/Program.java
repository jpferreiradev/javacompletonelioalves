package OrientacaoObjetos.Interfaces.Atividade.application;

import OrientacaoObjetos.Interfaces.Atividade.model.entities.Contract;
import OrientacaoObjetos.Interfaces.Atividade.model.entities.Installment;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int numero = scan.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        scan.nextLine();
        LocalDate data = LocalDate.parse(scan.nextLine(), fmt);
        System.out.print("Valor de contrato: ");
        double valorContrato = scan.nextDouble();

        // Instanciar o objeto Contrato
        Contract contrato = new Contract(numero, data, valorContrato, new Installment());

        System.out.print("Entre com o número de parcelas:");
        int parcelas = scan.nextInt();



        scan.close();
    }
}
