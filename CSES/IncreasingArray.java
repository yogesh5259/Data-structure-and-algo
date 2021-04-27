import java.util.Scanner;

public class IncreasingArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }
        long count = 0;
        for (int i = 1; i < n; i++) {
            if(input[i] < input[i - 1]){
                count += input[i - 1] - input[i];
                input[i] += input[i - 1] - input[i];  
            }
        }
        System.out.println(count);
    }
}