import java.util.Arrays;

public class ReverseStringNaive {
    public static void  ReverseString(char[] array){
        char[] temp = new char[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            temp[j] = array[i];
            j++;
        }
        array = temp;
    }
    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e','f','g','e'};
        ReverseString(array);
        System.out.println("Array after reverse: " + Arrays.toString(array));

    }
}