package Arrays;

import java.util.Arrays;

/*
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.
Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.

Example:
Input:[3 1 2 5 3]

Output:[3, 4]

A = 3, B = 4
*/
public class RepeatAndMissing {
    public static void main(String[] args) {
        int A[] = {3,1,2,5,3};
        int result[] = findRepeatingNumber(A);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] findRepeatingNumber(final int[]A){
        int [] result = new int[2];
        int n = A.length;
        int currentSum =0;
        int originalSum =(n*(n+1))/2;
        if(A.length==0){
            return A;
        }
        Arrays.sort(A);

        for(int i=1;i<=A.length;i++){
            currentSum += A[i-1];
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] == A[i+1]){
                result[0] = A[i];
                break;
            }
        }
        result[1] = originalSum - (currentSum-result[0]);

        return result;
    }
}
