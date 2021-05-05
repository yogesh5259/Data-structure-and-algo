import java.io.PrintWriter;
import java.util.Scanner;

public class TwoKnights{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 1; i <= n; i++) {
            long t = i * i;
            long totalNumberOfWays = (t * (t - 1) /2);
            long totalAttackingWays = 4 * (i-1) *(i-2);
            pw.println(totalNumberOfWays - totalAttackingWays);
        }
        pw.flush();
    }
}