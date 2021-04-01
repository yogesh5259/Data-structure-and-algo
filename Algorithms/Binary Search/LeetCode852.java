public class LeetCode852{
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        int ans = 0;
        while(start < end){
           int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                ans = mid;
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] input = new int[]{0,1,0};
        System.out.println(peakIndexInMountainArray(input));
    }
}