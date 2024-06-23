package Arrays;

public class findMinInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[] = {11,12,13,17};
        System.out.println("Minimum element is = "+findMin(nums));
    }
    public static int findMin(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        int start = 0;
        int end = nums.length - 1;

        while (start != end) {
            int mid = (start + end) / 2;
            if(nums[mid]<nums[end]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        minimum = nums[start];

        return minimum;
    }
}
