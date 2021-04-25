public class Leetcode190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        boolean flag = false;
        int j = 31;
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            int mask = (1 << i);
            if (flag) {
                if ((n & mask) != 0) {
                    // System.out.print(1);
                    int setmask = (1 << j);
                    rev |= setmask;
                } else {
                    // System.out.print(0);

                }
                j--;
            } else {
                if ((n & mask) != 0) {
                    // System.out.print(1);
                    flag = true;
                    int setmask = (1 << j);
                    rev |= setmask;

                } else {
                    // System.out.print(0);

                }
                j--;
            }
        }
        return rev;
    }
}