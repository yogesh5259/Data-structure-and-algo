/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Leetcode206 {
    public ListNode reverseList(ListNode head) {
        
        
        //O(n) extra space 
        // if(head == null) return null;
        // ListNode temp = head;
        // head = null;
        // while(temp != null){
        //     ListNode l = new ListNode();
        //     l.next = head;
        //     l.val = temp.val;
        //     head = l;
        //     temp = temp.next;
        // }
        // return head;
        
        
        //In place 
        ListNode newNode = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }
    
}