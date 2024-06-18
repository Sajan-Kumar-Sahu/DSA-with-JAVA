package Arrays;

import java.util.Arrays;


/*
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
*/
public class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        findElement(nums,k);
    }
    public static void findElement(int[] nums,int k){
        Arrays.sort(nums);
        int largest = 0;
        largest = nums[nums.length-k];
        System.out.println("Kth largest element = "+largest);
    }
}
