package TopicosEspeciaisDataHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate); // Manipular datas
        System.out.println(localDateTime); // Manipular data e hora
        System.out.println(localTime); // Manipular as horas;

        // Formatação das datas

        String strLocalDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String strLocalDateTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm"));
        String strLocalTime2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));



        /*
        LocalDate local = LocalDate.now();
        LocalDateTime localHora = LocalDateTime.now();


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("A data de hoje é: " + local);
        System.out.println("A data e a hora hoje é: " + localHora);

        System.out.print("Informe a data que gostaria:");
        LocalDateTime data = LocalDateTime.parse(scan.nextLine(),fmt);
        System.out.println("A data é: " + data);
        */
        scan.close();


    }
}
