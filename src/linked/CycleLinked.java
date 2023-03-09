package linked;

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

    /**
     * 链表若有环 快慢指针就一定会进入环内 也一定会相遇
     *
     * @param head
     * @return
     */
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

    public boolean hasCycleByDel(ListNode head) {
        //如果head为空，或者他的next指向为空，直接返回false
        if (head == null || head.next == null) {
            return false;
        }
        //如果出现head.next = head表示有环
        if (head.next == head) {
            return true;
        }
        ListNode nextNode = head.next;
        //当前节点的next指向他自己，相当于把它删除了
        head.next = head;
        //然后递归，查看下一个节点
        return hasCycleByDel(nextNode);
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(2, null)))));
        CycleLinked cycleLinked = new CycleLinked();
        boolean res = cycleLinked.hasCycleByDel(listNode);
        System.out.println(res);
    }
}
