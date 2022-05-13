import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Assignment_no10 {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        File file= new File("C:\\Users\\Saurabh Dhage\\Desktop\\Temp.txt");
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNext()) data.add(sc.next());

           Map<String, Long> map = data.stream()
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get());
            System.out.println(map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey().length());

            System.out.println(String.join("_", data));
        } catch (FileNotFoundException e) {
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }
}
