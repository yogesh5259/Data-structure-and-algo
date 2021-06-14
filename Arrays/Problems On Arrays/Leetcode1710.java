class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int ans  = 0;
        for(int[] a : boxTypes){
            int count = Math.min(a[0],truckSize);
            ans += count * a[1];
            truckSize -= count;
        }
        return ans;
    }
}