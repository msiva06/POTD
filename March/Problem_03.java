package March;

// Remove nth node from end of list
public class Problem_03 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        while(n > 0){
            fast = fast.next;
            n--;
            if(fast == null)
                break;
        }

        if(fast == null){
            return head.next;
        }

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        
        slow.next = slow.next.next;
        return head;
    }
}
