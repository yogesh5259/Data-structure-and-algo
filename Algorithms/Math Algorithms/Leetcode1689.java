class Solution {
    public int minPartitions(String n) {
       int ans = 0;
        for(char c : n.toCharArray()){
            if(Integer.parseInt(String.valueOf(c)) > ans){
                ans = Integer.parseInt(String.valueOf(c));
            }
        }
        return ans;
    }
}