
class FindDuplicateNumberBruteForce {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return nums[i];
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