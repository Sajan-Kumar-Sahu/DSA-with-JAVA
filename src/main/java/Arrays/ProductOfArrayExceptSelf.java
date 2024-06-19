package Arrays;
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
*/
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        findProducts(nums);
    }
    public static void findProducts(int[] nums){
        int n = nums.length;
        int leftProduct[] = new int[n];
        leftProduct[0] = 1;
        for(int i=1;i<n;i++){
            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        int rightProduct[] = new int[n];
        rightProduct[n-1]=1;
        for(int i=n-2;i>=0;i--){
            rightProduct[i] = rightProduct[i+1]*nums[i+1];
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = leftProduct[i]*rightProduct[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
