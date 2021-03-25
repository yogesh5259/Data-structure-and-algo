import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        for (int i = 1; i < newDigits.length; i++) {
            newDigits[i] = 0;
        }
        return newDigits;
    }

    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(input)));
    }
}