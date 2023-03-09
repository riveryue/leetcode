package linked;

import java.util.Stack;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        int length = length(head);
        if (length == 1) {
            return true;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }
        ListNode next = head;
        for (int i = 0; i < length; i++) {
            ListNode pop = stack.pop();
            if (pop.val != next.val) {
                return false;
            }
            next = next.next;
        }
        return true;
    }

    private int length(ListNode head) {
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(0, new ListNode(1)));
        boolean palindrome = new Palindrome().isPalindrome(node);
        System.out.println(palindrome);
    }
}
