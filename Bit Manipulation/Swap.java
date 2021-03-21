
public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println("Before Swap " + a + "..." + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap " + a + "..." + b);

    }
}
