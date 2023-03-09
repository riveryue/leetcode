package linked;

public class DelNode {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null))));
        System.out.println(listNode);
        new DelNode().deleteNode(listNode);
        System.out.println(listNode);
    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
