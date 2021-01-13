import java.util.Arrays;

class FindDuplicateNumberBetter {
    public static int findDuplicate(int[] nums) {
        int[] hashtable = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
           hashtable[nums[i] - 1] += 1;
        }
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] > 1){
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayone = {1,3,2,4,2,5};
        System.out.println(findDuplicate(arrayone));

        int[] arraytwo = {1,3,2,4,2,2};
        System.out.println(findDuplicate(arraytwo));

        int[] arrayThree = {2,2,2,2,2,2};
        System.out.println(findDuplicate(arrayThree));
    }
}