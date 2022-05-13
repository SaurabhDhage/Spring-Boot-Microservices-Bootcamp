import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment_no5 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1, 2, 3, 4, 5, 6, 6, 2, 3, 4, 5, 7, 7, 5);
        int N = 2;
        long count = list.stream().filter(i -> Collections.frequency(list, i) == N).distinct().count();
        System.out.println(count);
    }
}
