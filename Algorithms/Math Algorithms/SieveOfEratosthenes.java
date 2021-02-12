
import java.util.Scanner;

public class SieveOfEratosthenes {

    public static void findPrime(int n){
        int[] array = new int[n + 1];
        for (int i = 2; i <= n ; i++) {
            if(array[i] == 0){
                for (int j = i * i; j <= n ; j += i) {
                    if (array[j] == 0){
                        array[j] = 1;
                    }
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if(array[i] == 0) System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last number for prime number!: ");
        int n = scanner.nextInt();
        findPrime(n);
    }
}
