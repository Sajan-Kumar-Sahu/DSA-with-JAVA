package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10, 10, 14, 16};
        int target = 15;
        int position = search(arr, target);
        if(position>0) {
            System.out.println("Target found at position " + position);
        }else{
            System.out.println("Element does not exists!!");
        }
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i + 1;
            }
        }
        return -1;
    }
}
