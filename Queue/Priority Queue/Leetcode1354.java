import java.util.PriorityQueue;
import java.util.Queue;

class Leetcode1354 {
    public boolean isPossible(int[] t) {
         Queue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        int sum = 0;
        for(int i = 0; i < t.length; i++){
            sum += t[i];
            pq.add(t[i]);
        }
        
        while(pq.peek() != 1){
            int n = pq.poll();
            sum -= n;
            if(sum < 1 || n <= sum) return false;
            n %= sum;
            sum += n;
            pq.add(n);
        }
         return true;
    }
}