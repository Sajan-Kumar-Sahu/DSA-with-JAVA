package Arrays;

public class subArrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        findSubArrays(arr);
        System.out.println("Total Number of Subarrays = " + arr.length * (arr.length + 1) / 2);
    }

    public static void findSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print("Sum = " + sum);
                System.out.println();
            }
            System.out.println();
        }
    }
}
