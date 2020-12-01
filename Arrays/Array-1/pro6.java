

// Efficient way of solving this problem is HEAP data structure
public class pro6 {

    public static void SelectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if(array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,9,6,33,19};
        int k = 3;
        SelectionSort(array);
        System.out.println("Largest: "+ array[array.length - k]);
        System.out.println("Smallest: "+ array[k - 1]);

    }

}