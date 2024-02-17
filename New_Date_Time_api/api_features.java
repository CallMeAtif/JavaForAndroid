package New_Date_Time_api;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

import static java.time.temporal.TemporalAdjusters.*;

public class api_features {
    public static void main(String[] args) {
        // 1) clock

        System.out.println(LocalTime.now(Clock.systemDefaultZone()));
        Clock clock = Clock.system(ZoneId.of("America/Los_Angeles"));
        System.out.println(LocalTime.now(clock)); //ZoneId.of is used to change zoneid





        // 2) Period and Duration --> Period = date based  --> Duration = time based
        //Period and Duration can also be created static(ly)
        //Period is used for LocalDate
        //Duration is used for LocalTime

        Period p1 = Period.between(LocalDate.now(), LocalDate.of(2024,3,7));
        System.out.println(p1);

        Duration d1 = Duration.between(LocalTime.now(), LocalTime.now().plusMinutes(30));
        System.out.println(LocalTime.now());
        System.out.println(d1);

//        Duration d1 = Duration.ofDays(10);
//        Period p1 = Period.ofDays(10);

        Duration twoHours = Duration.ofHours(2);
        Duration tenMinutes = Duration.ofMinutes(10);
        Duration thirtySecs = Duration.ofSeconds(30);

        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.now().with(next(DayOfWeek.TUESDAY));

        LocalTime time1 = LocalTime.now();
        LocalTime time2 = time1.plus(twoHours);

        Period p = Period.between(date1, date2);
        Duration d = Duration.between(time1, time2);

        System.out.println("Date1 = " + date1);
        System.out.println("Date2 = " + date2);
        System.out.println("Period = " + p);
        System.out.println("Duration = " + d);
        System.out.println("Time1 = " + time1);
        System.out.println("Time2 = " + time2);
        System.out.println("Duration of two hours = " + twoHours);
        System.out.println("Duration of ten minutes = " + tenMinutes);
        System.out.println("Duration of thirty seconds = " + thirtySecs);
        /*
            "P2D" -> Period of 2 days
            "PT2H" -> Time period of 2 hours
            "PT10M" -> Time period of 10 minutes
            "PT30S" -> Time period of 30 seconds
         */




        // 3) Temporal Adjusters

        /*
            useful methods

            firstDayOfMonth()
            firstDayOfNextMonth()
            firstInMonth(DayOfWeek)
            lastDayOfMonth()
            next(DayOfWeek)
            nextOrSame(DayOfWeek)
            previous(DayOfWeek)
            previousOrSame(DayOfWeek)

         */
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth()));
        System.out.println(LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY)));


        // 4) ZoneId

        ZoneId mountainTime = ZoneId.of("America/Denver");
        ZoneId myZone = ZoneId.systemDefault();

        // System.out.println(ZoneId.getAvailableZoneIds()); //--> gets all zone ids
        System.out.println(mountainTime);
        System.out.println(myZone);



        // 5) Instant --> An instantaneous point on the time-line
        // This may be used to record event time-stamps in the application

        Date date = new Date();
        Instant now = date.toInstant();
        ZoneId myZone1 = ZoneId.systemDefault();
//        ZoneId myZone1 = ZoneId.of("America/Denver");
        LocalDateTime dateTime = LocalDateTime.ofInstant(now, myZone1);
        ZonedDateTime zdt = ZonedDateTime.ofInstant(now, myZone1);

        System.out.println("Date = " + date);
        System.out.println("Instant = " + now);
        System.out.println("My Zone = " + myZone1);
        System.out.println("Date-time = " + dateTime);
        System.out.println("Zone-time = " + zdt);

    }
}
