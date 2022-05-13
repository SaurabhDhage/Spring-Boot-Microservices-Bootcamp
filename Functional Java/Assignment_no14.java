import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Assignment_no14 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = rand.ints(10, -100, 100).boxed().collect(Collectors.toList());
        int total = list.stream().reduce(0, Integer::sum);
        list.forEach(System.out::println);
        System.out.println("Total sum of the list is : " + total);
        System.out.println("Element in sorted order is");
        List<Integer> l1 = list.stream().filter(x->x%2!=0).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<Integer> l2 = list.stream().filter(x->x%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        l1.addAll(l2);
        l1.forEach(System.out::println);
    }
}
