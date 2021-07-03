class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0, length = 0;
        ListNode curr = head;
        if (head == null) return head;
        while (curr != null){
            length++;
            curr = curr.next;
        }
        k %= length;

        if (k == 0) return head;

        ListNode tmp, end = curr;
        curr = head;
        int cut = length - k;
        for (int i = 0; i < cut - 1; i++) curr = curr.next;
        tmp = curr.next;
        end.next = head;
        curr.next = null;

        return tmp;
    }

}
//0ms 100%
//38.5mb 45.93%
