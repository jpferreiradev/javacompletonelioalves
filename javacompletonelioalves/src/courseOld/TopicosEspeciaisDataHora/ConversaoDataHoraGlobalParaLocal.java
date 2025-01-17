package courseOld.TopicosEspeciaisDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConversaoDataHoraGlobalParaLocal {
    public static void main(String[] args) {

        LocalDate data01 = LocalDate.parse("2024-01-17");
        LocalDateTime data02 = LocalDateTime.parse("2024-01-17T01:30:26");
        Instant data03 = Instant.parse("2024-01-17T01:30:26Z"); // Ele tem o timeZone do GMT, final Z


        // Converter data-hora global para local
        // Converter o meu Instant para uma data local, considerando o fuso horario do computador;
        LocalDate r1 = LocalDate.ofInstant(data03, ZoneId.systemDefault()); // Conversao
        LocalDate r2 = LocalDate.ofInstant(data03, ZoneId.of("Japan")); // Conversao para um time zone de um pais
        LocalDateTime r3 = LocalDateTime.ofInstant(data03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data03, ZoneId.of("Japan"));


        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 =" + r4);

        System.out.println("-----------------------------");
        // Obter dados de uma data-hora local

        System.out.println("Data 01 dia = " + data01.getDayOfMonth()); // Pegar o dia de uma data local;
        System.out.println("Data 01 mês = " + data01.getMonthValue()); // Mostra o número do mês atual;
        System.out.println("Data 01 mês numero=" + data01.getMonth()); // Mostra o mês atual;
        System.out.println("Data 01 ano = " + data01.getYear());

        System.out.println("------ Hora ------");
        System.out.println("Data 02 hora = " + data02.getHour());
        System.out.println("Data 02 minutos = " + data02.getMinute());
        System.out.println("Data 02 segundos = " + data02.getSecond());


    }
}

/*
        LocalDate dataLocalDate = LocalDate.now();
        LocalDateTime dataLocalDateTime = LocalDateTime.now();
        Instant dataInstant = Instant.now();

        for(String s :ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }

 */