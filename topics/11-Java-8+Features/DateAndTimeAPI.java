import java.time.LocalDate;     
import java.time.LocalTime;     
import java.time.LocalDateTime; 

public class DateAndTimeAPI {
    public static void main(String[] args) {
        // Getting the current system date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate); 

        // Getting the current system time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime); 

        // Getting the current system date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime); 
    }
}
