import java.util.Scanner;


public class Permutations{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        int n = scan.nextInt();
    
       if(n == 1) {
           System.out.print(1);
            return;
        }
       if(n == 2 || n == 3){
           System.out.print("NO SOLUTION");
           return;
       }
       
       if(n % 2 == 0) {
            for (int i = 2; i <= n; i+= 2) {
               s.append(i + " ");
            }
            for (int i = 1; i <= n; i+= 2) {
                s.append(i+ " ");
            }
       } else{
           for (int i = n - 1; i > 0; i -= 2) {
               s.append(i + " ");
           }
           for (int i = n; i > 0; i -= 2) {
               s.append(i + " ");
           }
       }
       System.out.println(s.toString());
    }
}


/*
4 
5 2 3 1 4

1 3 5 2 4   
*/