import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Assignment_no12 {

    public static void main(String[] args) {
        Random randomNum = new Random();

        List<Integer> list =randomNum.ints(10,0,25).boxed().collect(Collectors.toList());
        System.out.println(list);

        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <= list.size() - 2; i++) {
            int currentSum = list.stream().skip(i).limit(2).mapToInt(Integer::intValue).sum();
            maxSum=Math.max(maxSum,currentSum);
        }
        System.out.println("Max sum using 2 consecutive integers :" + maxSum);
    }
    }

