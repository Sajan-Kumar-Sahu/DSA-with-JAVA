package Arrays;
/* Given an integer array nums, find a subarray that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:
Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:
Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
*/
public class MaximumProductSubarray {
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println("Maximum Product = "+findProduct(nums));
    }
    public static int findProduct(int[] nums){
        if(nums.length==0){
            return 0;
        }else if(nums.length==1){
            return nums[0];
        }
        double maxProduct = Integer.MIN_VALUE;
        double prefix = 1;
        double suffix = 1;

        for(int i=0;i<nums.length;i++){

            if(prefix==0){
                prefix = 1;
            } else if (suffix == 0) {
                suffix = 1;
            }
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            maxProduct = Math.max(maxProduct,Math.max(prefix,suffix));
        }
        return (int)maxProduct;
    }
}
