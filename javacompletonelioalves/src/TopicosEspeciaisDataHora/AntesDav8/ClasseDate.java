package TopicosEspeciaisDataHora.AntesDav8;

import TopicosEspeciaisDataHora.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ClasseDate {
    public static void main(String[] args) throws ParseException {


        // Instanciação do meu objeto do tipo SimpleDateFormart
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // Padrão no formato UTC
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));


        Date x1 = new Date(); // Data de agora
        Date x2 = new Date(System.currentTimeMillis()); // Outra forma para pegar a data de agora, ele pega o instante do sistema, converte para milesegundos e cria a data
        Date x3 = new Date(0L); // Aqui ele está passando 0 milissegundos
        Date x4 = new Date(1000L * 60L * 60L * 5L); // Calculo que define a data as 5:00 AM do dia 1 de janeiro 1970

        Date d1 = sdf1.parse("18/01/2024");
        Date d2 = sdf2.parse("18/01/2024 15:42:07");
        Date d3 = Date.from(Instant.parse("2024-01-18T15:42:07Z")); // Data no formato ISO 8601, no padrão UTZ


        System.out.println("Horario do BR ");
        System.out.println("x1 = " + sdf2.format(x1));
        System.out.println("x2 = " + sdf2.format(x2));
        System.out.println("x3 = " + sdf2.format(x3));
        System.out.println("x4 = " + sdf2.format(x4));
        System.out.println("dia 01 = " + sdf2.format(d1));
        System.out.println("dia 02 = " + sdf2.format(d2));

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Horario no formato UTC ");
        System.out.println("x1 = " + sdf3.format(x1));
        System.out.println("x2 = " + sdf3.format(x2));
        System.out.println("x3 = " + sdf3.format(x3));
        System.out.println("x4 = " + sdf3.format(x4));
        System.out.println("dia 01 = " + sdf3.format(d1));
        System.out.println("dia 02 = " + sdf3.format(d2));
        System.out.println("Dia 03 - IS0 8601 = " + sdf3.format(d3));

        System.out.println("--------------------");
        System.out.println("Sem a formatação do format");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("x3 = " + x3);
        System.out.println("x4 = " + x4);
        System.out.println("dia 01 = " + d1);
        System.out.println("dia 02 = " + d2);




    }
}
