import java.util.Arrays;

class FindDuplicateNumberSorting {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);      //Time Complexity O(nlogn)
        for (int i = 0; i <nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) return nums[i];
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