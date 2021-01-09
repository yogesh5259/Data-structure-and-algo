package Com.Algorithms.Exercise;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_5 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        StdOut.print(checkRange(a, b));
    }
    public static boolean checkRange(double a, double b){
        return (a < 1 && a > 0) && (b < 1 && b > 0);
    }
}
