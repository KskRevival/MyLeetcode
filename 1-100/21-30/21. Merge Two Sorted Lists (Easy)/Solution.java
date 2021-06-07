class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head, curr;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val){
            head = l1; curr = head;
            l1 = l1.next;
        } else{
            head = l2; curr = head;
            l2 = l2.next;
        }
        
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                curr.next = l1; curr = curr.next;
                l1 = l1.next;
            } else{
                curr.next = l2; curr = curr.next;
                l2 = l2.next;
            }
        }
        while (l2 != null){
            curr.next = l2; curr = curr.next;
            l2 = l2.next;
        }
        while (l1 != null){
            curr.next = l1; curr = curr.next;
            l1 = l1.next;
        }

        return head;
    }
}
//0ms 100%
//38.5mb 39.6%
