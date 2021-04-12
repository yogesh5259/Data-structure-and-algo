public class Leetcode1631 {
   
    private int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}}; 
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length, m = heights[0].length;
        int start = 0;
        int end = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[100][100];
        while(start <= end){
            dp = new int[100][100];
            int mid = start + (end - start) / 2;
            if(longestPath(heights, 0, 0, n, m, mid, dp)){
                ans = Math.min(mid,ans);
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
    private boolean longestPath(int[][] heights, int i, int j, int n, int m, int diff, int[][] dp){
        boolean way = false;
        if(i == n - 1 && j == m - 1) return true;
         dp[i][j] = 1;
        for(int[] d : directions){
            int x = d[0] + i, y = d[1] + j;
            if(x > -1 && y > -1 && x < n && y < m && dp[x][y] != 1 && (Math.abs(heights[x][y] - heights[i][j]) <= diff)){

                way = way || longestPath(heights, x, y, n, m, diff,dp);
            } 
           
     }
     return way;
  }

  public static void main(String[] args) {
      int[][] input = {{1,2,2},{3,8,2},{5,3,5}};
      Leetcode1631 l1631 = new Leetcode1631();
        System.out.println(l1631.minimumEffortPath(input));
  }
        
}
               