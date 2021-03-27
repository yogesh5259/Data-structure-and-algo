class MajorityElement {
    public static int majorityElement(int[] nums) {
        int c = 0;
        int v = 0;
        for(int i = 0; i < nums.length; i++){
            if(v == 0){
                c = nums[i];
            }
            if(nums[i] == c){
                v++;
            } else{
                v--;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement(input));
    }
}