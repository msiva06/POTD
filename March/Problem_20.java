package March;

// Merge in between linked list
public class Problem_20 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = null;
        ListNode curr = list1;
        int idx = 0;
        while(idx < a){
            prev = curr;
            curr = curr.next;
            idx++;
        }

        ListNode next = null;
        while(idx <= b){
            curr = curr.next;
            next = curr;
            idx++;
        }

        ListNode l2 = list2;
        prev.next = l2;
        while(l2.next != null){
            l2 =l2.next;
        }
        l2.next = next;
        return list1;
    }
}
