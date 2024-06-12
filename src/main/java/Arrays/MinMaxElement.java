/* Maximum and minimum of an array using minimum number of comparisons
Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
Maximum element is: 35
=============================================================================================================================================*/

package Arrays;

import java.util.Arrays;

public class MinMaxElement {
    public static void main(String[] args){
        int arr[] = {22, 14, 8, 17, 35, 3};
        findElement(arr);
    }
    public static void findElement(int[]arr){
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=maxValue){
                maxValue = arr[i];
            }else if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Min Element = "+minValue);
        System.out.println("Max Element = "+maxValue);
    }
}

































