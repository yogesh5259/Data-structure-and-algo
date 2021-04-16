public class Leetcode1209 {
    public static String removeDuplicates(String s, int k) {
        String temp = s;
        while (true) {
            boolean flag = false;
            int count = 1;
            s = temp;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    count++;
                } else {
                    count = 1;
                }
                if (count == k) {
                    temp = s.substring(0, i - k + 2) + s.substring(i + 2);
                    count = 1;
                    flag = true;
                }

            }

            if (!flag)
                break;
        }
        return temp;

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa",3));
    }
}