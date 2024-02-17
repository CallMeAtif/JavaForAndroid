package New_Date_Time_api;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class date_time_objects_and_enums {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2024, Month.JULY,4);
        LocalDate date = LocalDate.now();// todays date
        LocalTime time = LocalTime.of(12,15,0); // setting todays date
        LocalDateTime dateTime = date.atTime(time); // joining both date and time
        System.out.println(dateTime);

        Period twomonths = Period.ofMonths(2); // creating a period of 2 months
        System.out.println(date.plus(twomonths));

        LocalDate untilnextSunday = date.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        // TemporalAdjusters.next is used to find the next occurrence of the day
        System.out.println(untilnextSunday);



        LocalDate date2 = LocalDate.now();
//        System.out.println("today: " + date2);
//        System.out.println("nextDay: " + date2.plus(1,ChronoUnit.DAYS));
//        System.out.println("nextWeek: " + date2.plus(1,ChronoUnit.WEEKS));
//        System.out.println("nextMonth: " + date2.plus(1,ChronoUnit.MONTHS));
//        System.out.println("nextYear: "+ date2.plus(1,ChronoUnit.YEARS));
//        System.out.println("nextDecade: "+ date2.plus(1,ChronoUnit.DECADES));
//        System.out.println("nextCentury: "+ date2.plus(1,ChronoUnit.CENTURIES));

        System.out.println(date2.getMonth());
        System.out.println(date2.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));

    }
}
