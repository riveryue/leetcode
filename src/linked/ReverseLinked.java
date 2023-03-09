package linked;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseLinked {
    public ListNode reverseList(ListNode head) {
        Stack<ListNode> listNodes = new Stack<>();
        while (head != null) {
            listNodes.push(head);
            head = head.next;
        }
        if (listNodes.isEmpty()) {
            return null;
        }
        ListNode node = listNodes.pop();
        ListNode dummy = node;
        while (!listNodes.isEmpty()) {
            node.next = listNodes.pop();
            node = node.next;
        }
        node.next = null;
        return dummy;
    }

    public ListNode reverseListNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(new ListNode(head.val));
            head = head.next;
        }
        if (nodes.isEmpty()) {
            return null;
        }
        ListNode res = new ListNode(nodes.get(nodes.size() - 1).val);
        ListNode node = res;
        for (int i = nodes.size() - 2; i >= 0; i--) {
            res.next = new ListNode(nodes.get(i).val);
            res = res.next;
        }
        res.next = null;
        return node;
    }

    public ListNode reList(ListNode head) {
        ListNode dummyHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = dummyHead;
            dummyHead = head;
            head = next;
        }
        return dummyHead;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(new ReverseLinked().reverseList(listNode));
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(new ReverseLinked().reverseListNode(listNode1));
        ListNode listNode2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(new ReverseLinked().reList(listNode2));
    }
}
