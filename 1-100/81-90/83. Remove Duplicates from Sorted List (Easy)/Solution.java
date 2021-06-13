class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if (curr.val == curr.next.val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;
    }
}
//0ms 100%
//37.9mb 94.8%
