public class LeetCode371 {
    public static int getSum(int a, int b) {
        while(b != 0){
            int carray = a & b;
            a = a ^ b;
            b = carray<<1;
        }
         return a;
     }
    public static void main(String[] args) {
        System.out.println(getSum(5, 4));
    }
}