import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Assignment_no16 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println("How many number do you want to enter:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Numbers");
        for(int i=0;i<n;i++){
           list.add(sc.nextInt());
        }
        System.out.println("Enter Number to search:");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(list.get(i)==key)
            {
                System.out.printf("First occurrence at %d th index\n",i);
                break;
            }
        }

        List list2=new ArrayList<>();
        System.out.println("How many number do you want to enter:");
        int n2=sc.nextInt();
        for(int i=0;i<n2;i++){
            list2.add(sc.nextInt());
        }
        list.addAll(list2);
        System.out.println(list);





    }
}
