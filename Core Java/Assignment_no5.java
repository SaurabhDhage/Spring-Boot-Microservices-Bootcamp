public class Assignment_no5 {
    public static void main(String[] args) {
        int[] arr ={10,20,5,7,18,15};
        int secondSmallest=0;
        int secondLargest=0;
        int largest=0;
        int smallest=arr[0];
        for(int ele:arr){
            if(ele>largest) {
                secondLargest = largest;
                largest = ele;
            }else if(ele>secondLargest){
                secondLargest=ele;
            }

          if(ele<smallest)
            {
                secondSmallest = smallest;
                smallest = ele;
            }
          else if(secondSmallest>ele){
              secondSmallest=ele;
          }
        }
        System.out.println("Second Largest:" +secondLargest);
        System.out.println("Second Smallest:" +secondSmallest);
    }
}
