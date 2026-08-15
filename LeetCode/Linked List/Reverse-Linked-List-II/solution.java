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
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        while(left<right){
            ListNode l = findKth(head,left-1);
            ListNode r = findKth(head,right-1);
            int t = l.val;
            l.val = r.val;
            r.val = t;
            left++;
            right--;
        }
        return head;
    }
    public ListNode findKth(ListNode head, int k){
        ListNode temp = head;
        while(k-- > 0){
            temp = temp.next;
        }
        return temp;
    }
}