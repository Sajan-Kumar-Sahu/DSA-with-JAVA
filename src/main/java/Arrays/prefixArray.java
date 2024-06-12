package Arrays;

public class prefixArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        findMaxSum(arr);
    }

    public static void findMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int[] prefixArray = new int[arr.length];
        int sum = 0;

        prefixArray[0]=arr[0];
        for (int i = 1; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
               sum = i==0?prefixArray[j]:prefixArray[j]-prefixArray[i-1];
               if(maxSum<sum){
                   maxSum=sum;
               }
            }
        }
        System.out.println("Maximum sum ="+maxSum);
    }
}
