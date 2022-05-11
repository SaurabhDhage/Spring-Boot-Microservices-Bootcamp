import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Assignment_no14 {
    public static void main(String[] args) {

      System.out.println("10 Days Before today");
        DateTimeFormatter format =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter monthFormat =
                DateTimeFormatter.ofPattern("yyyy-MM");
        LocalDateTime now = LocalDateTime.now();

        for(int i=1;i<=10;i++) {
            LocalDateTime then = now.minusDays(i);
            System.out.println("Date = " + then.format(format));
        }
        System.out.println("10 Days After today");
        for(int i=1;i<=10;i++) {
            LocalDateTime then = now.plusDays(i);
            System.out.println("Date = " + then.format(format));
        }

        System.out.println("Months Remaining in the year");
        for(int i=now.getMonthValue();i<Month.DECEMBER.getValue()-1;i++){
            System.out.println(now.plusMonths(i).format(monthFormat));
        }

        Date bdate = Date.from(Instant.from(now.plusDays(10).atZone(ZoneId.systemDefault())));
        Date adate =Date.from(Instant.from(now.minusDays(10).atZone(ZoneId.systemDefault())));
        long get_difference = adate.getTime()-bdate.getTime();
        long minutes = TimeUnit.MILLISECONDS.toMinutes(get_difference);
        System.out.println("The time difference betweenn the 20 days will be"+minutes);

    }
}
