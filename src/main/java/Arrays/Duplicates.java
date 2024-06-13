/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true */

package Arrays;

import java.util.Arrays;

public class Duplicates {
    public static void main (String [] args){
        int[] nums = {1,2,3,4};
        System.out.println(findDuplicates(nums));
    }
    public static boolean findDuplicates(int []nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
