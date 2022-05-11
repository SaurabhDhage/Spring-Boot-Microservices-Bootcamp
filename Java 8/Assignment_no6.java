import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment_no6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String sub=sc.next();
        Pattern ptr=Pattern.compile(sub);
        Matcher m=ptr.matcher(str);
        int count=0;
        while(m.find()){
            count++;
        }
        System.out.println("Occurrence of given substring : "+count);
    }
}
