import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        array = sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] sort(int[] array){
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
        left = sort(left);
        right = sort(right);
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