import java.util.stream.IntStream;

public class Assignment_no9 {
    private static int diff=0,last=0;
     private static boolean isInRange(int i){
     boolean value= i == diff+last;
     if(value) {
             last=diff+last;
             diff++;
     }
      return value;
     }
    public static void main(String[] args) {
       IntStream.range(0,25).filter(Assignment_no9::isInRange).forEach(System.out::println);
    }
}
