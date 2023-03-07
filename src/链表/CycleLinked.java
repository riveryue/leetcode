package 链表;

import java.util.HashSet;
import java.util.Set;

public class CycleLinked {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            ListNode next = head.next;
            if (!set.add(next)) {
                return true;
            }
            head = next;
        }
        return false;
    }
}
