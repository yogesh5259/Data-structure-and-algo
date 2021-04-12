public class Leetcode42{
    public static int trap(int[] heights) {
        int maxLeft = 0;
         int left = 0;
         int right = heights.length - 1;
         int maxRight = 0;
         int maxValue = 0;
         int i = 0;
         while(left < right){
             if(heights[left] <= heights[right]){
                 if(maxLeft <= heights[left]) maxLeft = heights[left];
                 maxValue += maxLeft - heights[left];
                 left++;
             } else{
                 if (maxRight <= heights[right]) maxRight = heights[right];
                 maxValue += maxRight - heights[right];
                 right--;
             }
         }
         return maxValue;
     }
    public static void main(String[] args) {
        int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(input));
    }
}