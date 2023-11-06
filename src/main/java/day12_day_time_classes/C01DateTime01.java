package day12_day_time_classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01DateTime01 {

    public static void main(String[] args) {

        //How to get local date from Java
        LocalDate myDate = LocalDate.now(); // now() method: Obtains the current date from the system clock in the default time-zone.
        System.out.println(myDate); // 2023-09-06

        //How to go future and past
        LocalDate yourDate = myDate.plusMonths(3).plusDays(11).plusYears(5); // Method Chain
        System.out.println(yourDate); // 2028-12-17

        LocalDate ourDate = myDate.minusYears(15).minusMonths(10).minusDays(3);
        System.out.println(ourDate); // 2007-11-03

        //How to format Date
        //Example 1:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedMyDate = dtf.format(myDate);
        System.out.println(formattedMyDate);

        //Example 2:
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd MMM yyyy");
        String myDateFormatted = dt.format(myDate);
        System.out.println(myDateFormatted); // 06 Eyl 2023

        //Example 3:
        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd MMMM yy");
        String myDateFormat = d.format(myDate.minusMonths(1));
        System.out.println(myDateFormat); // 06 Ağustos 23

        //How to see date in another time zone
        LocalDate dateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInJapan);

        //How to get Local Time from Java
        LocalTime myTime = LocalTime.now(); // Obtains the current time from the system clock in the default time-zone.
        System.out.println(myTime); // 10:29:20.330364800 ==> hour, minute, second, nanosecond

        //How to go future
        LocalTime yourTime = myTime.plusHours(1).plusMinutes(25).plusSeconds(13);
        System.out.println(yourTime); // 11:54:33.330364800

        //How to fo past
        LocalTime ourTime = myTime.minusNanos(2000);
        System.out.println(ourTime); // 10:29:20.330362800

        //How to format time
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm a"); // HH for 24 hours system, hh for 12 hours system.
        String t1 = f1.format(myTime);                                 // a stands for am or pm if you use 12 hours system.
        System.out.println(t1); // 10:33 ÖÖ


        //How to get time in another time zone
        LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInJapan); // 16:35:46.262699300

        //How to get date and time together
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime); // 2023-09-06T10:37:24.843340500

        System.out.println(myDateTime.getMonthValue()); // 9
        System.out.println(myDateTime.getMonth()); // SEPTEMBER

        System.out.println(myDateTime.getDayOfWeek()); // WEDNESDAY


        //Example 4: Type code to if the given date before the current date give message to user "Invalid Date"
        //           If the given date equal the current date give message to user like "Give the time"
        //           If the time is before current time tell to user "No Ticket" otherwise tell to user "There is just 1 ticket"
        //           If the given date after the current date give message to user "Buy the ticket"

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year, month and day please");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        System.out.println("Enter the time please");
        int hour = input.nextInt();
        int minute = input.nextInt();

        LocalDate currentDate = LocalDate.now();
        LocalDate givenDate = LocalDate.of(year, month, day);
        LocalTime currentTime = LocalTime.now();
        LocalTime givenTime = LocalTime.of(hour, minute);

        if (givenDate.isBefore(currentDate)){
            System.out.println("Invalid Date");
        } else if (givenDate.isEqual(currentDate)) {
            if (givenTime.isBefore(currentTime)){
                System.out.println("No Ticket");
            }else {
                System.out.println("There is just 1 ticket");
            }
        } else if (givenDate.isAfter(currentDate)) {
            System.out.println("Buy the ticket");
        }





    }

}
