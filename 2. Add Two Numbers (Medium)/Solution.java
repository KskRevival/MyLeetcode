class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        short first = (short) l1.val, second = (short) l2.val, mind = 0;
        ListNode answer = new ListNode(), curr = answer;
        while (l1.next != null || l2.next != null){
            curr.val = (mind + first+second)%10;
            curr.next = new ListNode();
            curr = curr.next;
            mind = (short) ((first+ second + mind) / 10);
            first = 0; second = 0;
            if (l1.next != null){
                l1 = l1.next;
                first = (short) l1.val;
            }
            if (l2.next != null) {
                l2 = l2.next;
                second = (short) l2.val;
            }
        }
        curr.val = (mind + first+second)%10;
        if ((mind + first+second)/10 == 1)
            curr.next = new ListNode(1);


        return answer;
    }
}
//2ms 39,5mb
