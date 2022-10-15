package 链表;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseLinked {
    public ListNode reverseList(ListNode head) {
//        List<ListNode> nodes = new ArrayList<>();
//        while (head != null) {
//            nodes.add(new ListNode(head.val));
//            head = head.next;
//        }
//        ListNode res = new ListNode(nodes.get(nodes.size() - 1).val);
//        for (int i = nodes.size() - 2; i >= 0; i--) {
//            ListNode temp = new ListNode(nodes.get(i).val);
//            System.out.println("1 " + temp);
//            res.next = temp;
//            res = res.next;
//        }
//        return res;
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

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(new ReverseLinked().reverseList(listNode));
    }
}
