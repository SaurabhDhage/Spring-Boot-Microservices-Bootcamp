import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

class assignment10 {
    private static final String DATE_FORMAT = "dd-MM-yyyy hh:mm:ss";
    public static void convertDate(Date date){
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        TimeZone zone = TimeZone.getTimeZone("UTC");
        formatter.setTimeZone(zone);
        System.out.println("TimeZone : " + zone.getID() + " (" + zone.getDisplayName() + ")");
        System.out.println("Date : " + formatter.format(date));
    }
    public static void convertDate(Date date, TimeZone zone){
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        formatter.setTimeZone(zone);
        System.out.println("TimeZone : " + zone.getID() + " (" + zone.getDisplayName() + ")");
        System.out.println("Date : " + formatter.format(date));
    }
    public static void main( String[] args )
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Date and time (dd-MM-yyyy hh:mm:ss): ");
            String datetime = sc.nextLine();
            System.out.print("Enter timezone: ");
            String timezone = sc.nextLine();

            SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
            Date date = formatter.parse(datetime);
            TimeZone zone = TimeZone.getTimeZone(timezone);

            System.out.println("Before conversion: ");
            System.out.println("TimeZone : " + zone.getID() + " (" + zone.getDisplayName() + ")");
            System.out.println("Date : " + formatter.format(date));

            System.out.println("In UTC: ");
            convertDate(date);

            System.out.print("Enter a timezone to convert to: ");
            String zoneInput = sc.nextLine();
            TimeZone timez = TimeZone.getTimeZone(zoneInput);
            System.out.println("In "+timez.getID()+": ");
            convertDate(date, timez);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
