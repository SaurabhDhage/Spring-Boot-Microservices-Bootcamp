import java.util.stream.IntStream;

public class Assignment_no2 {
    public static void main(String[] args) {
        System.out.println("Normal Stream");
        IntStream.range(1, 10).forEach(System.out::println);
        System.out.println("Parallel Stream Stream");
        IntStream.range(1, 10).parallel().forEach(System.out::println);
    }
}
