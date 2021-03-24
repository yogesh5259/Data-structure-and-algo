import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i;
        for (i = nums1.length - 1; i >= 0; i--) {
            if (m > 0 && n > 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[i] = nums1[m - 1];
                    m--;
                } else {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            } else {
                break;
            }
        }

        while (m > 0) {
            nums1[i] = nums1[m - 1];
            m--;
            i--;
        }

        while (n > 0) {
            nums1[i] = nums2[n - 1];
            n--;
            i--;
        }

    }

    public static void main(String[] args) {
        int[] input1 = new int[]{1,2,3,0,0,0};
        int[] input2 = new int[]{2,5,6};

        merge(input1, 3, input2, 3);
        System.out.println(Arrays.toString(input1));
    }
}