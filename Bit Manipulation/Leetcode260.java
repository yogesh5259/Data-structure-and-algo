public class Leetcode260 {
    public int[] singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        int count = 0;
        // find the right most set bit
        for (int i = 0; i < 32; i++) {
            int mask = 1 << i;
            if ((result & mask) != 0) {
                count = i;
                break;
            }
        }
        //create two different list
        List<Integer> l = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            int mask = 1 << count;
            if ((mask & nums[i]) != 0) {
                l.add(nums[i]);
            }
        }
        int temp = result;
        
        //find one number 
        for (int i : l) {
            result ^= i;
        }
        return new int[] { result, (temp ^ result) };
    }
}
