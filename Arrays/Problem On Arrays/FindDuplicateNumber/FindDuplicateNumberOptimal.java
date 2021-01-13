
class FindDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        int i = nums[0];
        int j = nums[0];
        do{
            i = nums[i];
            j = nums[j];
            if (j < nums.length){
                j = nums[j];
            } else return -1;
            //System.out.println("i: " + i + " " + "j: " + j);
        } while (i != j);
        i = nums[0];
        while(i != j) {
            i = nums[i];
            j = nums[j];
        }
        return i;
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