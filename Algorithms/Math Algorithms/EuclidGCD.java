class EuclidGCD {
    public static void main(String[] args) {
        System.out.println(gcd(100,26));
    }

    private static int gcd(int i, int j) {
        return j == 0 ? i : gcd(j, i % j); // It takes some space complexity
    }

    /*
    //shorter version
    private static int gcd(int i, int j) {
        while(j != 0){
            int remainder = i % j;
            i = j;
            j = remainder;
        }
        return i;
    }
    */

    /*
    public static int gcd(int a, int b){
        //int dividend = a >= b ? a : b;
        //int divisor = a <= b ? a : b;

        int dividend = a;
        int divisor = b;
        while(divisor != 0){
            int remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return dividend;
    }
    */
}




/**
 * Time complexity
 * In year 1840 proven that O(number of digits in b) where b is smaller number
 * O(logb) where b is the smaller number
 * 
 * 
 * 
 * space complexity 
 * O(1) 
 */
