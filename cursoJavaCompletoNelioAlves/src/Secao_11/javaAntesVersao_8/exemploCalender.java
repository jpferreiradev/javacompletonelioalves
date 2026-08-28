package Secao_11.javaAntesVersao_8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class exemploCalender {
    static void main() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        // Acrecentar dia, hora ou minuto em uma data
        Calendar cal = Calendar.getInstance();
        cal.setTime(d); // Uma data instanciada no calendario, aqui você pode acrescentar ou diminior o tempo
        cal.add(Calendar.HOUR_OF_DAY,4); // Acresentando 4 horas no dia
        d = cal.getTime(); // atualizar a nova data

        System.out.println(sdf.format(d));

        System.out.println("OBTENDO UMA UNIDADE DE TEMPO");
        System.out.println();




    }
}
