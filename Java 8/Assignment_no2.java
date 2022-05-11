import java.util.Scanner;

public class Assignment_no2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        int hr=sc.nextInt();
        int min=sc.nextInt();
        int sec=sc.nextInt();

        int time=hr*3600+min*60+ sec;
        System.out.printf("%.08f km/hr \n",(distance*3600.0f)/(time*1000.0f));
        System.out.printf("%.08f Meter/Sec \n",1.0f*distance/time);
        System.out.printf("%.08f miles/hr",(distance * 3600.0f)/(time*1000.0f*1.609));
        sc.close();
    }
}
