package Arrays;

import java.util.*;

public class maxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        findMaxSum(arr);
    }

    public static void findMaxSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(maxSum<sum){
                    maxSum=sum;
                }
            }
        }
        System.out.println("Maximum sum of subarray = "+maxSum);
    }
}
