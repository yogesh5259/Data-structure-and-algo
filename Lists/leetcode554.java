import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode554{
    public static int leastBricks(List<List<Integer>> wall) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int j = 0; j < wall.size(); j++){
            List<Integer> list = wall.get(j);
            int e = 0;
            for(int i = 0; i < list.size() - 1; i++){
                e += list.get(i);
                map.put(e,map.getOrDefault(e,0) + 1);
                count = Math.max(count, map.get(e));
            }
        }
        return wall.size() - count;
    }
}