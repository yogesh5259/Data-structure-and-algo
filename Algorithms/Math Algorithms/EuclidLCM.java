public class EuclidLCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,29));
    }

    private static int lcm(int a ,int b){
        return a / gcd(a,b) * b;  // To avoid integer overflow 
    }
    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}



/**
 *  LCM =-> least common multiple
 * 
 * Time Complexity for LCM 
 *  -> In year 1840 proven that O(number of digits in b) where b is smaller number
 *  -> O(logb) where b is the smaller number
 * 
 * 
 * Space Complexity
 * O(1)
 */