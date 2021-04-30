
import java.io.*;
import java.util.Scanner;

public class NumberSpiral{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            long y = scan.nextLong();
            long x = scan.nextLong();
            long z = Math.max(x,y);
            long ans = 0;
            if(z % 2 == 0){
                if(z == x){
                    ans = (x - 1) * (x - 1) + y;
                } else {
                    ans = (y * y) - x + 1;
                }
            } else {
                if(z == x){
                    ans = (x * x) - y + 1;
                } else {
                    ans = (y - 1) * (y - 1) + x;
                }
            }
            out.println(ans);
        }
        out.flush();
    }
}