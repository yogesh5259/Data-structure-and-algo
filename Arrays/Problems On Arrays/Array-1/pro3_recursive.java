public class pro3_recursive {
    public static int min(int[] array, int i, int size){
        return size == 1 ? array[i] : Math.min(array[i], min(array, i + 1, size -1)); 
    }

    public static int max(int[] array, int i, int size){
        return size == 1 ? array[i] : Math.max(array[i], max(array, i+1,size-1));
    }

    public static void main(String[] args) {
        int[] array = {10,20,30,40,40};
        System.out.println(min(array,0,array.length)); 
        System.out.println(max(array,0,array.length));    
    }
}
