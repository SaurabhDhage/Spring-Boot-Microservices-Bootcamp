public class Assignment_no8 {
    public static void main(String[] args) {
        String str = "Hello/:*Java ”Programmer <> |";
        str = str.replaceAll("[/:*?”<>| ]", "_");
        System.out.println(str);
    }
}
