import java.util.stream.Collectors;

public class Assignment_no13 {
    public static void main(String[] args) {
        String str = "ATTACK AT DAWN";
        int key=3;

        System.out.println(str.chars().mapToObj(e->(char)e)
                .map(x->{
                    if(x!=' ') {
                        return  Character.isUpperCase(x) ? (char)((((x-'A')+key)%26)+'A')
                                :(char)((((x-'a')+key)%26)+'a');
                    }
                    return ' ';
                }).map(String::valueOf).collect(Collectors.joining()));
    }
}
