package exercicios.trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class javaDate {

    public static void main(String[] args) throws ParseException {
        String condition;

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = formato.parse("04/07/2000");
        Date dateToCompare = formato.parse("15/05/2010");

        Long birthTimeMillis = birthDate.getTime();
        System.out.println(birthTimeMillis);

        Date birthTimeDate = new Date(birthTimeMillis);
        System.out.println(birthTimeDate);

        boolean compare = birthTimeDate.before(dateToCompare);

        if (compare) {
            condition = "Anterior a data solicitada para comparação";
        } else {
            condition = "Posterior a data solicitada para compração";
        }

        System.out.println(condition);
    }
}
