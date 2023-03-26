package Video112_ConvertendoDataHoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-03-25");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-25T23:30:35");
        Instant d06 = Instant.parse("2023-03-25T01:30:35Z");

//        for (String s : ZoneId.getAvailableZoneIds()) {
//            System.out.println(s);
//        }

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);


    }
}
