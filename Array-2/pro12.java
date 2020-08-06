
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class pro12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findSum(array,size));
    }

    private static boolean findSum(int[] array, int size) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            sum += array[i];
            if(set.contains(sum) || array[i] == 0 || sum == 0){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
}