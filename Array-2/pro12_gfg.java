
import java.util.Scanner;

public class pro12_gfg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        findSum(array, size); // Find the sum is = 0 or not in sub array and print index Start and end
                              // inclusive.
    }

    // Time Complexity is O(n^2)
    private static int findSum(int[] array, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = array[i];
            for (int j = i + 1; j < size; j++) {
                if (sum == 0) {
                    System.out.print(i + " " + (j - 1));
                    return 1;
                }
                sum += array[j];
            }
        }
        return 0;
    }
}