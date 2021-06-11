import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        if (lists.length == 0) return null;
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                list.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(list);
        ListNode target = list.size() > 0 ?new ListNode(list.get(0)) : null, curr  = target;

        for (int i = 1; i < list.size(); i++) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return target;
    }
}
//22ms 44.7mb
