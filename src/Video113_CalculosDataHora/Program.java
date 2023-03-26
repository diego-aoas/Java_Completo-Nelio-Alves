package Video113_CalculosDataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2023-03-25");
        LocalDateTime d05 = LocalDateTime.parse("2023-03-25T23:30:35");
        Instant d06 = Instant.parse("2023-03-25T01:30:35Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalDate :" + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate :" + nextWeekLocalDate);

        System.out.println("pastWeekLocalDate :" + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDate :" + nextWeekLocalDateTime);

        System.out.println("pastWeekInstant :" + pastWeekInstant);
        System.out.println("nextWeekInstant :" + nextWeekInstant);

//        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("t1 dias " + t1.toDays());
        System.out.println("t2 dias " + t2.toDays());
        System.out.println("t3 dias " + t3.toDays());
        System.out.println("t4 dias " + t4.toDays());

    }
}
