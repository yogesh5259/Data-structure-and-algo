class Leetcode905 {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j){
           if((nums[i] & 1) != 0){
               int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
           } 
            while ( nums.length - 1 >= i && nums[i] % 2 == 0){
                i++;
            }
        }
        return nums;
    }
}