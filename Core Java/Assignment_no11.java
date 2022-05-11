
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Assignment_no11 {
    public static void datetime(String str_date, String str_time) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
        Date date = format.parse(str_date + " " + str_time);
        System.out.println(date);
    }

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date in format dd-MM-yyyy");
        String str_date = sc.nextLine();
        System.out.println("Enter time in format hh:mm:ss a");
        String str_time = sc.nextLine();
        datetime(str_date, str_time);
        sc.close();
    }

}