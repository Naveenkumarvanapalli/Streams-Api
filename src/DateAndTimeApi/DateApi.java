package DateAndTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateApi {
    public static void main(String[] args){
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate: " + date);
        LocalDate customDate = LocalDate.of(1995, 3, 31);
        System.out.println("Custom Date with Of Method: " + customDate);
        LocalDate customDate_1 = LocalDate.parse("1999-06-29");
        System.out.println("Custom Date with Parse Method: " + customDate_1);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + dateTime);
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Tomorrow Date: " + tomorrow);
        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Previous Month Same Day Date: " + previousMonthSameDay);
        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println("Get the week from the Date: " + sunday.toString());
        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println("Get Date from the given text value: " + twelve);
        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("Get Date from the Leap Year is not : " + leapYear);
        boolean notBefore = LocalDate.parse("2025-07-10").isBefore(LocalDate.parse("2025-07-09"));
        System.out.println("Relation between two different dates with isBefore Method : " + notBefore);
        boolean isAfter = LocalDate.parse("2025-07-10").isAfter(LocalDate.parse("2025-07-09"));
        System.out.println("Relation between two different dates with isBAfter Method : " + isAfter);
        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Beginning of Day : " + beginningOfDay);
        System.out.println("First Day of the Month : " + firstDayOfMonth);
        System.out.println("Last Day of the Month : " + lastDayOfMonth);
    }
}
