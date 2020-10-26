import com.data.LinkedList.LinkedList;
import com.data.LinkedList.List;

public class LinkedListTester {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            list.addLast(i);
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}
