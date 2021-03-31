public class LeetCode1760 {
    public static boolean check(int size, int[] nums, int operation){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > size){
                operation -= (nums[i] / size);
                if(nums[i] % size == 0) operation++;
            }
        }
        return operation >= 0;
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int end = Integer.MAX_VALUE;
        int ans = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(check(mid,nums,maxOperations)){
                ans = mid;
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] input = new int[]{2,4,8,2};
        System.out.println(minimumSize(input, 4));
    }
}