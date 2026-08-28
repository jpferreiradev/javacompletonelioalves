package Secao_11.javaAntesVersao_8;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class exemploObtendoUnidadeTempo {
    static void main() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);

        System.out.println("Minutos: " + minutos);
        System.out.println("Mes: " + mes);
    }
}
