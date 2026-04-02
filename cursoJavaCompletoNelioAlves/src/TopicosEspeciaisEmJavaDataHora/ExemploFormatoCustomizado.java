package TopicosEspeciaisEmJavaDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExemploFormatoCustomizado {
    static void main() {

        Scanner scan = new Scanner(System.in);

        /*
        LocalDate D04 = LocalDate.parse("2026-02-28");
        LocalDateTime D05 = LocalDateTime.parse("2026-02-28T10:30:25");
        Instant D06 = Instant.parse("2026-02-28T10:30:25Z");

        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("D04 = " + D04);
        System.out.println(D04.format(fmt01));

        System.out.println("Informe um data:");
        LocalDate teste = LocalDate.parse(scan.nextLine(), fmt01);
        System.out.println(teste.format(fmt01));
        */

        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

    }
}
