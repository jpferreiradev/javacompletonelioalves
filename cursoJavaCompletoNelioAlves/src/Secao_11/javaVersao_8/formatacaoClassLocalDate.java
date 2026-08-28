package Secao_11.javaVersao_8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class formatacaoClassLocalDate {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-08-19");
        LocalDateTime d02 = LocalDateTime.parse("2026-08-19T01:30:26");
        Instant d03 = Instant.parse("2026-08-19T01:30:26Z");


        // Editar de forma customizada
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Data local, sem fuso horario
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("LD1 = Sem edição:" + d01);
        System.out.println("LD1 = Com edição: " + d01.format(fmt1));
        System.out.println("LD1 = Passando direto pelo DateTimeFormatter: " + fmt1.format(d01));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // outra forma de chamar
        System.out.println();
        System.out.println("LDT2 = " + d02.format(fmt1));
        System.out.println("LDT2 ---- = " + d02.format(fmt2));
        System.out.println("LDT2 = " + d02.format(fmt4));
        System.out.println();
        System.out.println("INS = " + fmt3.format(d03));
        System.out.println("INS = " + fmt5.format(d03));

    }
}

/*
    System.out.println(exemplo);
        System.out.println(exemplo.format(fmt1));
 */