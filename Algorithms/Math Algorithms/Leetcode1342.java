public class Leetcode1342 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            if ((num & 1) != 1) {
                num /= 2;
            } else {
                num -= 1;
            }
        }
        return count;
    }
}