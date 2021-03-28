class LeetCode1011 {
    public static boolean helper(int c, int[] weights,int d){
        int cap = c;
        int day = 1;
        for(int a: weights){
            if(cap >= a){
                cap = cap - a;
            } else{
                day++;
                cap = c - a;
            }
        }
        if(day <= d) return true;
        return false;
        
    }
    
    public static int shipWithinDays(int[] weights, int D) {
        int start = 0;
        for(int a : weights) start = Math.max(start,a);
        int end = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(helper(mid,weights,D)){
                ans = Math.min(mid,ans);
                end = mid - 1;
            }else {
                start = mid + 1;
            } 
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(input, 5));
    }
}