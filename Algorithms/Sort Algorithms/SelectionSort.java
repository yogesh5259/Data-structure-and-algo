import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1,5,6,4,3,2,1};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] array){
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}


/**
 * SelectionsSort Analysis 
 * 
 * Time Complexity
 * -> O(n^2) in best, worst, Average case
 * 
 * Space Complexity
 * -> O(1) 
 * 
 * Stability
 * -> The default implimentation is not stable. However it can be made stable.
 * 
 * Sorting in place
 * -> Yes
 */