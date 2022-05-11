import java.util.*;

public class Assignment_no18 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        System.out.println("How many element do you wanna enter");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            lhs.add(sc.nextInt());
        }
        int i=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer it:lhs){
            hm.put(i,it);
            i++;
        }
        while (true){
            System.out.println("" +
                    "a.List all key and corresponding values.\n" +
                    "b.List all available Values keys only in sorted order.\n" +
                    "c.Delete a provided value.\n" +
                    "d.Check whether provided value is available.\n" +
                    "e.Check for empty collections.\n" +
                    "f.Exit\n");
            System.out.println("Enter Choice:");
            String ch=sc.next();
            switch (ch){
                case "a":
                    System.out.println(hm);
                    break;
                case "b":
                    hm.keySet().stream().sorted().forEach(System.out::println);
                    break;
                case "c":
                    System.out.println("Enter value to delete");
                     hm.values().remove(sc.nextInt());
                    break;
                case "d":
                    System.out.println("Enter value:");

                    System.out.println(hm.containsValue( sc.nextInt()));
                    break;
                case "e":
                    System.out.println(hm.isEmpty());
                    break;

                case "f":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }




    }


}
