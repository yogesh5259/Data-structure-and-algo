import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum ^= scan.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            sum ^= i;
        }
        System.out.println(sum);
    }
    
}
