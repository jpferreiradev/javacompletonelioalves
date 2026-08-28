package Secao_11.javaVersao_8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciacaoClasseLocalDate {
    static void main() {

        // Formatar a data
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Instanciação data hora em Java
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        // texto ISO 8601
        LocalDate d04 = LocalDate.parse("2026-08-19");
        LocalDateTime d05 = LocalDateTime.parse("2026-08-19T01:30:26");
        Instant d06 = Instant.parse("2026-08-19T01:30:26Z");
        Instant d07 = Instant.parse("2026-08-19T01:30:26-03:00");
        // texto customizado
        LocalDate d08 = LocalDate.parse("19/08/2026",fmt01);
        //LocalDate d08 = LocalDate.parse("19/08/2026",DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Pode ser feito assim também
        LocalDateTime d09 = LocalDateTime.parse("19/08/2026 01:30",fmt02);
        // Instanciar dados isolados como dia, mes, ano, horario
        LocalDate d10 = LocalDate.of(2026,8,19);
        LocalDateTime d11 = LocalDateTime.of(2026,8,19,1,30);



        System.out.println("Data atual - " + d01);
        System.out.println("Data-hora atual horario local - " + d02);
        System.out.println("Data-hora global - DataHora GNT " + d03);
        System.out.println("--------texto ISO 8601 ------\n");
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
        System.out.println("--------TEXTO CUSTOMIZADO------\n");
        System.out.println(d08);
        System.out.println(d09);
        System.out.println("--------DADOS ISOLADOS POR DIA, MES ANO E HORAS------\n");
        System.out.println(d10);
        System.out.println(d11);

    }
}
