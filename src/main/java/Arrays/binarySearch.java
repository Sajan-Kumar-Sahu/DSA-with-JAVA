package Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 16;
        int position = search(numbers, target);
        if (position > 0) {
            System.out.println("Target found at position : " + position);
        }else{
            System.out.println("Element does not exists!!");
        }

    }
    public static int search(int[] arr, int key) {
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
