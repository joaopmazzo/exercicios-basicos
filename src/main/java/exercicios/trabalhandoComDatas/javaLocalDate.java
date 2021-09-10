package exercicios.trabalhandoComDatas;

import java.time.LocalDateTime;

public class javaLocalDate {

    public static void main(String[] args) {
        LocalDateTime dateSet = LocalDateTime.of(2010, 5, 15, 10, 0, 0);

        LocalDateTime future = dateSet.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(dateSet);
        System.out.println(future);
    }
}
