class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head, nList = null;
        while (curr.next != null){
            n--;
            if (n == 0){
                nList = head;
            } else if (n < 0){
                nList = nList.next;
            }
            curr = curr.next;
        }
        if (n == 1) return head.next;
        if (nList != null){
            nList.next = nList.next.next;
        }
        return head;
    }
}
//0ms (100% faster) 37.2mb
