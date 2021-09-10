package exercicios.trabalhandoComDatas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class javaDateFormat {

    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");

        String formatedDate = formatter.format(now);

        System.out.println(formatedDate);
    }
}
