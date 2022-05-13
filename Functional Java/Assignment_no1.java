import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Assignment_no1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        OptionalDouble average = IntStream.range(1, 1000000000).average();
        long end = System.currentTimeMillis();
        System.out.println("Average: "+ average + "\nTime with normal streams or serial streams = " + (end - start));

        start = System.currentTimeMillis();
        average = IntStream.range(1, 1000000000).parallel().average();
        end = System.currentTimeMillis();
        System.out.println("Average: "+ average + "\nTime with parallel streams = " + (end - start));
    }
}
