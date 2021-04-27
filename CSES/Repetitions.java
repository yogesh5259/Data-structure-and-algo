import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int max = 1;
        int temp = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)){
                temp++;
            } else {
                temp = 1;
            }
            max = Math.max(temp, max);
        }
        System.out.println(max);
    }
}
