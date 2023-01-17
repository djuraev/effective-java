package chp12;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //
        /*LocalDate localDate = LocalDate.of(2023, 1, 17);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());

        LocalDate today = LocalDate.now();
        int year = today.get(ChronoField.YEAR);
        System.out.println(year);

        LocalTime now = LocalTime.now();
        System.out.println(now.get(ChronoField.NANO_OF_SECOND));

        LocalDate pd = LocalDate.parse("2014-09-01");
        LocalTime pt = LocalTime.parse("12:30:00");
        System.out.println(pd);
        System.out.println(pt);

        LocalDateTime ldc = LocalDateTime.now();
        today = ldc.toLocalDate();
        now = ldc.toLocalTime();


        System.out.println(today);
        System.out.println(now);

        System.out.println(Instant.ofEpochSecond(300_000_000_0L));*/

        Period pr = Period.between(LocalDate.of(1989,1,25), LocalDate.now());
        System.out.println(pr.toString());

        Duration dr = Duration.between(LocalTime.now(), LocalTime.of(0,10,0));
        System.out.println(dr);

        LocalDate today = LocalDate.now();

        LocalDate dob = LocalDate.of(2005,1,17);
        Period period = Period.between(dob, today);

        if (period.getYears() >= 18) {
            System.out.println("Eligible");
        }
        else {
            System.out.println("Not Eligible");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral(". ")
                .appendText(ChronoField.MONTH_OF_YEAR)
                .appendLiteral(" ")
                .appendText(ChronoField.YEAR)
                .parseCaseInsensitive()
                .toFormatter(Locale.US);

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zonedDateTime = LocalDate.of(2014, Month.NOVEMBER, 18).atStartOfDay(zoneId);
        System.out.println(zonedDateTime);

        HijrahDate ramadanDate = HijrahDate.now().with(ChronoField.DAY_OF_MONTH,1)
                                                 .with(ChronoField.MONTH_OF_YEAR, 9);
        System.out.println(ramadanDate);

    }
}
