package Leetcode;

public class Leetcode42 {
    public static int trap(int[] height) {
        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            int currentWater = 0;
            int leftMax = 0;
            int rightMax = 0;
            int left = i,right = i;
            while(left >= 0){
                leftMax = Math.max(leftMax,height[left]);
                left--;
            }
            while(right < height.length){
                rightMax = Math.max(rightMax, height[right]);
                right++;
            }

            currentWater = Math.min(leftMax, rightMax) - height[i];
            System.out.println(currentWater);
            if (currentWater >= 0){
                totalWater += currentWater;
            }
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int[] input =  {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println();
    }
}
