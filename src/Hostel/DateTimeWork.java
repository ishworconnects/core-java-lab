package Hostel;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;


public class DateTimeWork {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("LocalDate: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime: " + time);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime: " + ldt);

        System.out.println("Year: " + date.getYear());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDayOfMonth());




    }
}
