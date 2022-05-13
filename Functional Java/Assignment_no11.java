import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment_no11 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        try {
            FileReader file = new FileReader("C:\\Users\\Saurabh Dhage\\Desktop\\Temp.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext())
                words.add(sc.next());
            String join = String.join("_", words);
            System.out.println(join);
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
