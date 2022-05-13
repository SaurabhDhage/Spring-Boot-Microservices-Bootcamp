import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Assignment_no3 {
    public static boolean isPerfectSquare(long n){
     long sqrt= (long) Math.sqrt(n);
     return sqrt * sqrt == n;
    }
    public static void main(String[] args) {
       List<Integer> list=new ArrayList<>();
       IntStream.range(0,1000).forEach(list::add);
       long count=list.stream().filter(Assignment_no3::isPerfectSquare).count();
       if(count==0L) System.out.println("Invalid List");
       else System.out.println("valid list : "+count);
    }
}
