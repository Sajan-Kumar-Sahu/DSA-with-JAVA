package Arrays;


public class largestNumber {
    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("The largest Number is :"+findLargest(numbers));
    }
    public static int findLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
