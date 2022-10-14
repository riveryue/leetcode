package 链表;

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
        if (previous.next != null) {
            previous.next = previous.next.next;
        }
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

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(new DelNthFormNodeEnd().removeNthFromEnd(listNode1, 2));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(new DelNthFormNodeEnd().removeNthNodeFromEnd(listNode2, 2));
        ListNode listNode3 = new ListNode(1, null);
        System.out.println(new DelNthFormNodeEnd().removeNthNodeFromEnd(listNode3, 2));

    }
}
