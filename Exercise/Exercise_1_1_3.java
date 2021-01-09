package Com.Algorithms.Exercise;

import edu.princeton.cs.algs4.StdOut;

public class Exercise_1_1_3 {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        StdOut.print(checkEqual(a,b,c));
    }

    public static boolean checkEqual(int a, int b, int c){
        return a == b && b == c;
    }

    public static boolean checkEqual(double a, double b, double c){
        return a == b && b == c;
    }
}
