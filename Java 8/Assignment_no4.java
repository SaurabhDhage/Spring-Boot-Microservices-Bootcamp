public class Assignment_no4 {
    public static void main(String[] args){
        int n=4;
        System.out.println("----|| Printing Using Recursion ||----");
        printUsingRecursion(1,n,1);
        System.out.println("---|| Printing Using Loop ||------");
        printUsingLoop(n);
    }

    private static void printUsingRecursion(int i,int n,int count) {
       if(i==n+1)  return;
       if(count==0){
           count=i+1;
           System.out.println();
           printUsingRecursion(i+1,n,count);
       }
       else {
           System.out.print("* ");
           printUsingRecursion(i,n,count-1);
       }

    }

    private static void printUsingLoop(int n) {
        int count=1;
        for(int i=1;i<=n;){
            if(count==0){
                count=i+1;
                System.out.println();
                i++;
            }
            else{
                System.out.print("* ");
                count--;
            }
        }
    }
}
