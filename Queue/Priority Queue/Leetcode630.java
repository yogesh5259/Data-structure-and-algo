public class Leetcode630{
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a,b) -> a[1] - b[1]);
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
       int total = 0;
       for(int[] a : courses){
           int dur = a[0], expÒ = a[1];
           if(total + dur <= exp){
               total += dur;
               pq.add(dur);
           } else if(pq.size() > 0 && pq.peek() > dur){
               total -= pq.poll() - dur;
               pq.add(dur);
           }
       }
       return pq.size();
   }
}