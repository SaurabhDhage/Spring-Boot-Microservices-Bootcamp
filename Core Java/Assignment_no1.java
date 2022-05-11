import java.util.Scanner;

public class Assignment_no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer between 1 to 1000");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Sum of Digit: "+sum);
    }
}
