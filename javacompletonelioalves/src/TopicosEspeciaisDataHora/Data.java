package TopicosEspeciaisDataHora;

import java.time.Instant;
import java.time.InstantSource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {

        // Classe DataTimeFormatter
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");



        // Instanciação (Agora)
        LocalDate data01 = LocalDate.now();
        LocalDateTime data02 = LocalDateTime.now();
        Instant data03 = Instant.now(); // Data e hora GNT(HORARIO DE LONDRES)/ Global

        System.out.println(" Data 01 = " + data01);
        System.out.println("Data e hora 02 = " + data02);
        System.out.println("Data e hora 03 = " + data03);

        // Texto ISO 8601

        LocalDate data04 = LocalDate.parse("2024-01-16");
        LocalDateTime data05 = LocalDateTime.parse("2024-01-16T01:30:26");
        Instant data06 = Instant.parse("2024-01-16T01:30:26Z");
        Instant data07 = Instant.parse("2024-01-16T01:30:26-03:00");

        System.out.println("Data e hora 04 = " + data04);
        System.out.println("Data e hora 05 = " + data05);
        System.out.println("Data e hora 06 = " + data06);
        System.out.println("Data e hora 07 = " + data07);

        // Texto formato customizado

        LocalDate data08 = LocalDate.parse("16/01/2024",fmt1); // É preciso customizar
        //LocalDate data08 = LocalDate.parse("16/01/2024",DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime data09 = LocalDateTime.parse("16/01/2024 01:30", fmt2);
        //LocalDateTime data09 = LocalDateTime.parse("16/01/2024 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"););

        System.out.println("Data e hora 08 = " + data08);
        System.out.println("Data e hora 08 = " + data09);

        //dia, mes, ano, horario -> Dados isolados
        LocalDate data10 = LocalDate.of(2024, 1,16);
        LocalDateTime data11 = LocalDateTime.of(2024,01,16,1,30);
        System.out.println("Data e hora 10 = " + data10);
        System.out.println("Data e hora 11 = " + data11);
    }

}
