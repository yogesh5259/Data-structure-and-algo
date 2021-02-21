import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] array = {'a','b','c','d','e','f','g'};
        System.out.println("Array before reverse : " + Arrays.toString(array));
        reverseString(array);
        System.out.println("Array after reverse : " + Arrays.toString(array));
    }
}
