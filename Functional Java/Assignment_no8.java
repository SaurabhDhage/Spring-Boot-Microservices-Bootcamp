import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment_no8 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,9,3,4);
        boolean increasing = arr.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).equals(arr);
        boolean decreasing = arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).equals(arr);
        if (increasing || decreasing) {
            System.out.println("Array is monotonic ");
        } else {
            System.out.println("Array is not monotonic ");
        }
    }
}
