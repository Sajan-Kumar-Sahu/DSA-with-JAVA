/*
Given an array (or string), the task is to reverse the array/string.

Examples:

Input: original_array[] = {1, 2, 3} Output: array_reversed[] = {3, 2, 1}
*/
package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        System.out.print("Original Array : ");
        printArray(numbers);
        reverse(numbers);
        System.out.print("\nReverse Array: ");
        printArray(numbers);
    }

    public static void reverse(int[] arr) {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
