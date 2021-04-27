public class Leetcode268{

    //Math approach 
    // public int missingNumber(int[] nums) {
    //     int n = nums.length;
    //     int sum = 0; 
    //     for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //     }
    //     int s = n*(n + 1) / 2;
    //     return (s - sum);
    // }
    
    //Bit manupulation approach
    public int missingNumber(int[] nums) { 
        int sum = 0; 
        for(int i = 0; i < nums.length; i++){
            sum ^= nums[i];
        }
        for(int i = 0; i <= nums.length; i++){
            sum ^= i;
        }
        return sum;
    }
}