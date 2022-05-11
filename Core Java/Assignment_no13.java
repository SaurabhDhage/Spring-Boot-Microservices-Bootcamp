import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment_no13 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss\n");
        System.out.println(now.format(format));
        format = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'\n");
        System.out.println(now.format(format));
        format = DateTimeFormatter.ofPattern("hh:mm a\n");
        System.out.println(now.format(format));
        format = DateTimeFormatter.ofPattern("HH:mm:ss\n");
        System.out.println(now.format(format));
        format = DateTimeFormatter.ofPattern("MMM dd yyyy\n\n");
        System.out.println(now.format(format));

    }
}
