import java.util.Arrays;

class SortArray012 {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            switch(nums[mid]){
                case 0:
                    int temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {0,1,1,2,1,0,2,0,1,2};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }
}