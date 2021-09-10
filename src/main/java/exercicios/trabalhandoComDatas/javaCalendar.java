package exercicios.trabalhandoComDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class javaCalendar {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataVencimento = formato.parse("10/09/2021");

        Calendar vencimento = Calendar.getInstance();
        vencimento.setTime(dataVencimento);

        vencimento.add(Calendar.DATE, 10);
        int dayWeekVencimento = vencimento.get(Calendar.DAY_OF_WEEK);

        if (dayWeekVencimento == 7) {
            vencimento.add(Calendar.DATE, 2);
            System.out.println("A data limite para pagamento é até: " + vencimento.getTime());
        } else if (dayWeekVencimento == 1) {
            vencimento.add(Calendar.DATE, 1);
            System.out.println("A data limite para pagamento é até: " + vencimento.getTime());
        } else {
            System.out.println("A data limite para pagamento é até: " + vencimento.getTime());
        }
    }
}
