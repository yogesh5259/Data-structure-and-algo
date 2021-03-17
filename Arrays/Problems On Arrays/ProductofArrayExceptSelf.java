import java.util.Arrays;

class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        int left = 1;
        int right = 1;
        for(int i = 0; i < n; i++){
            result[i] = left;
            left = left * nums[i];
        }
        
        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] inputarray = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(inputarray)));
    }
}