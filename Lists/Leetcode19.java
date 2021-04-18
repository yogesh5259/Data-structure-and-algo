public class Leetcode19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        int counter = 0;
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode travel = head;
        while (travel != null) {
            if (counter == n) {
                break;
            }
            counter++;
            travel = travel.next;
        }

        while (travel != null) {
            temp = temp.next;
            travel = travel.next;
        }

        if (temp.next == head) {
            head = temp.next.next;
        } else {
            temp.next = temp.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode();
        ListNode n2 = new ListNode();
        ListNode n3 = new ListNode();
        ListNode n4 = new ListNode();
        ListNode n5 = new ListNode();
        n1.val = 1;
        n1.next = n2;
        n2.val = 2;
        n2.next = n3;
        n3.val = 3;
        n3.next = n4;
        n4.val = 4;
        n4.next = n5;
        n5.val = 5;
        n5.next = null;
        ListNode ans = removeNthFromEnd(n1, 1);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}

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