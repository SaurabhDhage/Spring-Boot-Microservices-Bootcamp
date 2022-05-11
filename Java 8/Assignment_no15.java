import java.util.*;

public class Assignment_no15 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        System.out.println("How many number do you want to enter:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Numbers");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        HashSet<Integer> hs=new HashSet<>(list);

        for(int ele:hs){
            System.out.printf("Frequency of %d : %d\n",ele, Collections.frequency(list,ele));
        }

        Collections.sort(list);
        System.out.println(list);
        list.sort(Collections.reverseOrder());
        System.out.println(list);

    }

}
