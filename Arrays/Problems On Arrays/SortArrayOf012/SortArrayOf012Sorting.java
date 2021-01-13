import java.util.Arrays;

class SortArray012 {
    public static void sortColors(int[] nums) {
        Arrays.sort(nums); //Time Complexity O(nlogn)
    }

    public static void main(String[] args) {
        int[] array = {0,1,1,2,1,0,2,0,1,2};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}