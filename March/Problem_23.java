package March;

// Reorder List
public class Problem_23 {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow);
        ListNode ptr = head;


        while(rev.next != null){
            ListNode temp = ptr.next;
            ptr.next = rev;
            ptr = temp;

            temp = rev.next;
            rev.next = ptr;
            rev = temp;

        }
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
