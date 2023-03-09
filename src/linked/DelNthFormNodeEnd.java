package linked;

public class DelNthFormNodeEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public ListNode removeNthNodeFromEnd(ListNode head, int n) {
        int length = length(head);
        ListNode previous = head;
        int last = length - n;
        if (last == 0) {
            return previous.next;
        }
        for (int i = 0; i < last - 1; i++) {
            previous = previous.next;
        }
        previous.next = previous.next.next;
        return head;
    }

    private int length(ListNode listNode) {
        int length = 0;
        while (listNode != null) {
            length++;
            listNode = listNode.next;
        }
        return length;
    }

    /**
     * 递归计算链表长度
     *
     * @param listNode
     * @return
     */
    private int len(ListNode listNode) {
        if (listNode == null) {
            return 0;
        }
        return len(listNode.next) + 1;
    }

    public ListNode removeNthFromEndByDummyHead(ListNode node, int n) {
        ListNode dummyHead = new ListNode(0, node);
        ListNode slow = dummyHead;
        ListNode fast = node;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(new DelNthFormNodeEnd().removeNthFromEndByDummyHead(listNode1, 2));
        System.out.println(new DelNthFormNodeEnd().len(listNode1));
        System.out.println(new DelNthFormNodeEnd().removeNthFromEnd(listNode1, 2));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(new DelNthFormNodeEnd().removeNthNodeFromEnd(listNode2, 2));
        ListNode listNode3 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(new DelNthFormNodeEnd().removeNthNodeFromEnd(listNode3, 2));

    }
}
