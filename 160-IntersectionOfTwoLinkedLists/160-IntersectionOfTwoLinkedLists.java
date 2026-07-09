// Last updated: 09/07/2026, 09:18:42

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a= headA, b=headB;
        while(a!=b){
            a=(a==null)? headB : a.next;
            b=(b==null)? headA : b.next;
        }
        return a;
    }
}