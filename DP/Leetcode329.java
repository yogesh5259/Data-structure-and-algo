public class Leetcode329{
    private int[][] direction = {{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int n = matrix.length, m = matrix[0].length, longestPath = 0;
        int[][] cache = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int longest = longestPath(matrix, cache, n, m, i, j);
                longestPath = Math.max(longest, longestPath);
            }
        }
        return longestPath;
    }
    
    private int longestPath(int[][] matrix,int[][] cache, int n, int m, int i, int j){
        if(cache[i][j] > 0) return cache[i][j];
        int max = 0;
        for(int[] d : direction){
            int x = d[0] + i, y = d[1] + j;
            if(x > -1 && y > -1 && x < n && y < m && matrix[x][y] > matrix[i][j]){
                int longest = longestPath(matrix,cache,n,m,x,y);
                max = Math.max(max,longest);
            }
        }
        cache[i][j] = max + 1;
        return cache[i][j];
    }
    public static void main(String[] args){
        int[][] input = {{9,9,4},{6,6,8},{2,1,1}};
        Leetcode329 l329 = new Leetcode329();
        System.out.println(l329.longestIncreasingPath(input));
    }
}