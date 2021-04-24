public class Leetcode696{
    public int countBinarySubstrings(String s) {
        int[] temp = new int[s.length() + 1];
        temp[0] = 1;
        int index = 0;
        for(int i = 1; i < s.length(); i++){
            
            if(s.charAt(i) != s.charAt(i - 1)){
                index++;
                temp[index] = 1;
            } else {
                temp[index]++;
            }
            
        }
        int ans = 0;
        for(int i = 1; i < temp.length; i++){
            ans += Math.min(temp[i - 1], temp[i]);
        }
        return ans;
    }
}