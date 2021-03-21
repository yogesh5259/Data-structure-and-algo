public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            freq[nums[i]]++;  
        }
        for(int i = 0; i < 101; i++){
            if(freq[i] > 0) count += (freq[i] - 1) * freq[i] / 2;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] input = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(input));
    }
}