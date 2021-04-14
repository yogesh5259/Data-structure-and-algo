public class Leetcode86 {

    public ListNode partition(ListNode head, int x) {
        ListNode temphead = new ListNode();
        ListNode secondhead = new ListNode();
        ListNode temp = head;
        ListNode newtemp = temphead;
        ListNode second = secondhead;
        if (head == null)
            return null;
        while (temp != null) {
            if (temp.val < x) {
                newtemp.next = temp;
                newtemp = newtemp.next;
            } else {
                second.next = temp;
                second = second.next;
            }
            temp = temp.next;
        }
        second.next = null;
        newtemp.next = secondhead.next;
        return temphead.next;
    }

    public static void main(String[] args) {
        Leetcode86 l86 = new Leetcode86();
        ListNode ls1 = new ListNode();
        ListNode ls2 = new ListNode();
        ListNode ls3 = new ListNode();
        ListNode ls4 = new ListNode();
        ListNode ls5 = new ListNode();
        ListNode ls6 = new ListNode();
        ls1.val = 1;
        ls2.val = 4;
        ls3.val = 3;
        ls4.val = 2;
        ls5.val = 5;
        ls6.val = 2;
        ls1.next = ls2;
        ls2.next = ls3;
        ls3.next = ls4;
        ls4.next = ls5;
        ls5.next = ls6;
        ls6.next = null;

        ListNode head = l86.partition(ls1, 3);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}

// Definition for singly-linked list.
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