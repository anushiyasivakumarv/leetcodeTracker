// Last updated: 09/07/2026, 09:18:48
public class Solution{
    public boolean hasCycle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast) return true;
        }
        return false;
    }
}