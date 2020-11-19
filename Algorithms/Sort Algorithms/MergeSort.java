import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] array = {6,5,4,3,2,1};
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] mergeSort(int[] array){
        if(array.length <= 1){
            return array;
        }
        int mid = array.length / 2; 
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[i+mid];
        }
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left,right);
        return result;
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];
        int i, j, k;
        i = j = k =0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                result[k] = left[i];
                k++;
                i++; 
            } else {
                result[k] = right[j];
                k++;
                j++;
            }
        }

        while(i < left.length){
            result[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length){
            result[k] = right[j];
            k++;
            j++;
        }
        return result;
    }
}

/**
 * MergeSort Analysis
 * 
 * Algorithmic Paradigm
 * -> Divide and Conquer
 * 
 * Time Complexity
 * -> O(nlogn) in best, worst, Average case
 * 
 * Space Complexity
 * -> O(n) 
 * 
 * Stability
 * -> Yes
 * 
 * Sorting in place 
 * -> No
 */