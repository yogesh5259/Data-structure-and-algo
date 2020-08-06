
import java.util.Scanner;

public class pro12_another {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        findSum(array, size, sum); // Find the given sum in sub array and print index start and end inclusive.
    }

    // Time Complexity is O(n^2)
    private static int findSum(int[] array, int size, int sum) {
        int current_sum = 0;
        for (int i = 0; i < size; i++) {
            current_sum = array[i];
            for (int j = i + 1; j < size; j++) {
                if (current_sum == sum) {
                    System.out.print(i + " " + (j - 1));
                    return 1;
                }
                if (current_sum > sum) {
                    break;
                }
                current_sum += array[j];
            }
        }
        return 0;
    }
}