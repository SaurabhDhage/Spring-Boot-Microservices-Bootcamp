import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Assignment_no12 {
    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");
        TimeZone timezone = TimeZone.getTimeZone("America/New_York");
        format.setTimeZone(timezone);
        Date date = new Date();
        System.out.println("New York Time : "+ format.format(date) +" "+ timezone.getDisplayName());
        System.out.println("3 letter format of day and month : " + new SimpleDateFormat("E dd MMM yyyy").format(date) );
        System.out.println("Complete name of day and month : " + new SimpleDateFormat("EEEE dd MMMM yyyy").format(date));
        System.out.println("Epoch Time in milliseconds : " + date.getTime());
    }
}
