import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Pelindrom {
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp = head;
        while (temp != null) {
            int val = temp.val;
            stack.push(val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.val != stack.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listnode1 = new ListNode();
        ListNode listnode2 = new ListNode();
        ListNode listnode3 = new ListNode();
        listnode1.val = 1;
        listnode1.next = listnode2;
        listnode2.val = 2;
        listnode2.next = listnode3;
        listnode3.val = 1;
        listnode3.next = null;

        System.out.println(isPalindrome(listnode1));
    }
}