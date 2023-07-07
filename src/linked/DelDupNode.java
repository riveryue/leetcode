package linked;

import java.util.HashSet;

public class DelDupNode {

    public static ListNode deleteDupNode(ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            if (set.contains(cur.val)) {
                prev.next = cur.next;
            } else {
                set.add(cur.val);
                prev = cur;
            }
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(2, null)))));
        ListNode node = deleteDupNode(listNode);
        ListNode listNode1 = new ListNode();
        System.out.println(node);
    }
}
