package March;

import java.util.HashMap;
import java.util.Map;

// Remove zero sum consecutive nodes from Linked List
public class Problem_12 {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        Map<Integer,ListNode> freqSum = new HashMap<>();
        int sum = 0;
        ListNode left = dummy;
        
        while(left != null){
            sum += left.val;
            if(freqSum.containsKey(sum)){
                ListNode prev = freqSum.get(sum);
                left = prev.next;
                int csum = sum + left.val;
                while(csum != sum){
                    freqSum.remove(csum);
                    left = left.next;
                    csum += left.val;
                }
                prev.next = left.next;
            }
            else{
                freqSum.put(sum, left);
            }
            left = left.next;
        }
        return dummy.next;
    }
}
