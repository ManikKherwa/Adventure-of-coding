import java.time.*;
import java.time.format.DateTimeFormatter;
public class date {
    public static void main(String[] args) {
        LocalDate myobj=LocalDate.now();
        System.out.println("Today's date");
        System.out.println(myobj);
        LocalTime myobj1=LocalTime.now();
        System.out.println("Time");
        System.out.println(myobj1);
        LocalDateTime myobj2=LocalDateTime.now();
        System.out.println("date and time");
        System.out.println(myobj2);
        DateTimeFormatter myformaterobj=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatteddate=myobj2.format(myformaterobj);
        System.out.println(formatteddate);
        DateTimeFormatter myformaterobj1=DateTimeFormatter.ofPattern("E,dd MMM yyyy HH-mm-ss");
        String formatteddate1=myobj2.format(myformaterobj1);
        System.out.println(formatteddate1);
        DateTimeFormatter myformaterobj2=DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH/mm/ss");
        String formatteddate2=myobj2.format(myformaterobj2);
        System.out.println(formatteddate2);
    }  
}
