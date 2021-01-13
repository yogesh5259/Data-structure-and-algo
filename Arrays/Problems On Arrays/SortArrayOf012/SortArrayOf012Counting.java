import java.util.Arrays;

class SortArray012 {
    public static void sortColors(int[] nums) {
        int numberOf0 = 0;
        int numberOf1 = 0;
        int numberOf2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) numberOf0++;
            if (nums[i] == 1) numberOf1++;
            else numberOf2++;
        }
        int i = 0;
        while (numberOf0 != 0){
            nums[i] = 0;
            numberOf0--;
            i++;
        }
        while(numberOf1 != 1){
            nums[i] = 1;
            numberOf1--;
            i++;
        }
        while(numberOf2 != 2){
            nums[i] = 2;
            numberOf2--;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] array = {0,1,1,2,1,0,2,0,1,2};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}