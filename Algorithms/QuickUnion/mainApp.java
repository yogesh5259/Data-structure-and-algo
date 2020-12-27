package Com.Algorithms.QuickUnion;

import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        QuickUnion qf = new QuickUnion(n);
        while (!scanner.hasNext("q")){
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if(qf.connected(p,q))continue;
            qf.union(p,q);
            System.out.println(p+ "..." +q);
        }
        System.out.println(qf.getCount());
    }
}
