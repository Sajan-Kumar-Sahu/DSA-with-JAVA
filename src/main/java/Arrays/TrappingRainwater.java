package Arrays;

public class TrappingRainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println("Total Trapped Water = "+findTrappedWater(height));
    }
    public static int findTrappedWater(int[]height){
        int size = height.length;

        //Left Boundary
        int leftBound[] = new int[size];
        leftBound[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftBound[i] = Math.max(leftBound[i-1], height[i]);
        }

        //Right Boundary
        int rightBound[] = new int[size];
        rightBound[size-1] = height[size-1];
        for (int i = size-2; i >=0 ; i--) {
            rightBound[i] = Math.max(rightBound[i+1],height[i]);
        }

        //Trapped Water Calculation
        int trappedWater = 0;
        for (int i = 0; i < size; i++) {
            int waterLevel = Math.min(leftBound[i],rightBound[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
}
