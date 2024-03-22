package March;

// Palindrome Linked List
public class Problem_22 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
    
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = reverse(slow);
        ListNode temp = head;
        while(temp != null && rev != null){
            if(temp.val != rev.val){
                return false;
            }
            temp = temp.next;
            rev = rev.next;
        }
        return true;

        
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
