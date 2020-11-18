public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(array, 0, array.length,6));
    }

    public static int binarySearch(int[] array,int start, int end, int element){
    
        int mid = start + (end - start) / 2;

        if(array[mid] == element){
            return mid;
        }

        if(array[mid] > element){
            end = mid - 1;
            return binarySearch(array, start, end, element);
        }
        if(array[mid] < element){
            start = mid + 1;
            return binarySearch(array, start, end, element);
        }

        return -1;
         
    }  
}
