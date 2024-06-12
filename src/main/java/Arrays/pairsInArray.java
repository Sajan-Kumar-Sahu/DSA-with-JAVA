package Arrays;

public class pairsInArray {
    public static void main(String[] args) {
        int[]numbers = {2,4,6,8,10};
        findPairs(numbers);
    }
    public static void findPairs(int[]arr){
        int totalPairs = (arr.length*(arr.length-1))/2;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
        System.out.println("Total Number of Pairs = "+totalPairs);
    }
}
