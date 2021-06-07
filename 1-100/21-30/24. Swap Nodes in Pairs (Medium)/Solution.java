class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        ListNode curr = head, prev = null, pprev = null;
        if (head.next != null) head = head.next;
        while (curr.next != null){
            pprev = prev; //before pair
            prev = curr; // first pair element
            curr = curr.next; //second pair element
            prev.next = curr.next;
            curr.next = prev;
            if (pprev != null) pprev.next = curr;
            curr = prev;
            if (curr.next != null){
                curr = curr.next;//move to next pair
            }
        }
        return head;
    }
}
//0ms 100%
//36.5mb 69%
