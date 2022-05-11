import java.util.Arrays;
import java.util.Scanner;

public class Assignment_no3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=0;
        while(num!=0){
           int rem=num%10;
            n=n*10+rem;
            num=num/10;
        }
        while(n!=0){
            int rem=n%10;
            System.out.print(rem+" ");
            n=n/10;
        }
        // Alternate way using split method




    }
}
