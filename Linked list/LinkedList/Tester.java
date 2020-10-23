import com.data.structure.LinkedList;
import com.data.structure.List;

public class Tester {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            list.addFirst(i);
        }
        System.out.println(list.getCurrentSize());
    }
}
