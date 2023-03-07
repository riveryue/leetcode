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

    public boolean hasCycleByFastSLow(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                return true;
            }

        }
        return false;
    }
}
