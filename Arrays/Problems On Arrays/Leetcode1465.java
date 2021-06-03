class Solution {
    public int maxArea(int h, int w, int[] horizontal, int[] vertical) {
        long maxv = 0;
        long maxh = 0;
       Arrays.sort(horizontal);
    Arrays.sort(vertical);


        maxv = vertical[0] - 0;
        maxh = horizontal[0] - 0;
        
        for(int i = 1; i <horizontal.length; i++){
            int temp = horizontal[i] - horizontal[i - 1];
            maxh = Math.max(temp,maxh);
        }


        maxh = Math.max(maxh,h - horizontal[horizontal.length - 1]);
        
        for(int i = 1; i <vertical.length; i++){
            int temp = vertical[i] - vertical[i - 1];
            maxv = Math.max(temp,maxv);
        }


        maxv = Math.max(maxv,w - vertical[vertical.length - 1]);
        
        return (int)((maxh * maxv) % 1000000007);

    }
}