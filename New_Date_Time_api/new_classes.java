package New_Date_Time_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class new_classes {
    public static void main(String[] args) {


        // old class
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getTime()); // ----> gets current time
//        c.add(Calendar.HOUR,8); // ----> add or subtracts specified amount of time
//        System.out.println("After 8 Hours: " + c.getTime());



        //new class
//        LocalTime now = LocalTime.now();
//        System.out.println("Current time: "+ now); // ----> gets current time
//
//        LocalTime later = now.plus(8, ChronoUnit.HOURS); // adds specified amount of time
//        System.out.println("After 8 hours: "+ later);



        //methods

        // current date
//        LocalDate date = LocalDate.now();
//        System.out.println("The current date is "+ date);
//
//        //  current time
//        LocalTime now = LocalTime.now();
//        System.out.println("Current time: "+ now);
//
//        // later time
//        LocalTime later = now.plus(8, ChronoUnit.HOURS);
//        System.out.println("Later time: "+ later);
//
//        // current day
//        LocalDate today = LocalDate.now();
//        System.out.println("Today: "+ today);
//
//        // 30 days later
//        LocalDate thirtyDaysFromNow = today.plusDays(30);
//        System.out.println("Thirty days from now: "+ thirtyDaysFromNow);
//
//        // next month
//        LocalDate nextMonth = today.plusMonths(1);
//        System.out.println("Next month: "+ nextMonth);
//
//        // last month
//        LocalDate aMonthAgo = today.minusMonths(1);
//        System.out.println("Last month: "+ aMonthAgo);
//
//


    }
}
