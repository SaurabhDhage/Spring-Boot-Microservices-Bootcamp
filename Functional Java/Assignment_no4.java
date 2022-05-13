import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment_no4 {
    public static void main(String[] args) {
        String str="Bolder Future. Designed And Engineered.";
        List<Character> vowels =Arrays.asList('a', 'e', 'i', 'o', 'u');

        System.out.println(str.toLowerCase().chars().filter(x -> vowels.contains((char) x)).mapToObj(p -> (char)
                (p)).collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1))));
    }
}
