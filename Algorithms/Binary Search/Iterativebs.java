public class Iterativebs{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(array, 0, array.length,9));
    }

    private static int binarySearch(int[] array, int start, int end, int element) {

        while(start <= end ){
            int mid = start + (end - start) /2;
            if(array[mid] == element){
                return mid;
            }
            if(array[mid] > element){
                end = mid - 1;
            }
            if(array[mid] < element){
                start = mid + 1;
            }
        }
        return -1;
    }

    
}