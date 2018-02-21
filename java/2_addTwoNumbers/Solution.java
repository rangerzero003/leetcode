public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode resultNode = null;
        ListNode pointer = null;
        while(l1 != null || l2 != null){
            int l1Val = (l1 != null) ? l1.val : 0;
            int l2Val = (l2 != null) ? l2.val : 0;
            int result = l1Val + l2Val + carry;
            if(result >= 10){
                carry = 1;
                result -= 10;
                if(pointer == null){
                    resultNode = new ListNode(result);
                    pointer = resultNode;
                } else {
                    pointer.next = new ListNode(result);
                    pointer = pointer.next;
                }
            } else {
                carry = 0;
                if(pointer == null) {
                    resultNode = new ListNode(result);
                    pointer = resultNode;
                } else {
                    pointer.next = new ListNode(result);
                    pointer = pointer.next;
                }
            }
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        if(carry == 1)
            pointer.next = new ListNode(carry);
        return resultNode;
    }
}
