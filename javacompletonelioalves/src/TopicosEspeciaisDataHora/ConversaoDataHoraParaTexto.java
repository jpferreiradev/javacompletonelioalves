package TopicosEspeciaisDataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ConversaoDataHoraParaTexto {
    public static void main(String[]args){

        LocalDate data01 = LocalDate.parse("2024-01-16");
        LocalDateTime data02 = LocalDateTime.parse("2024-01-16T01:30:26");
        Instant data03 = Instant.parse("2024-01-16T01:30:26Z"); // O instant tem o timezone

        // Customização das datas, com a classe DateTimeFormatter;
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Pegar o fuso horario do computador local
        DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;  // Para usar o Instant

        // ---> Pode ser feita das três formas
        System.out.println("Data 01 = " + data01.format(fmt01));
        System.out.println("Data 01 = " + fmt01.format(data01));
        System.out.println("Data 01 = " + data01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("--------------------------");

        System.out.println("Data 02 = " + data02.format(fmt01));
        System.out.println("Data 02 =" + data02.format(fmt02));
        System.out.println("Date 02 =" + data02.format(fmt04));

        System.out.println("------------------------");
        System.out.println("Data 03 = " + data03); // Imprime em formato ISO // O Instante não tem o método format
        System.out.println("Date 03 = " + fmt03.format(data03)); // Aqui foi criado um objeto DateTimeFormatter e pegando o fuso horario do computador local
        System.out.println("Date 03 = " + fmt05.format(data03)); // Com a ISO_INSTANT
        System.out.println("Date 03 = " + data03);


    }
}
