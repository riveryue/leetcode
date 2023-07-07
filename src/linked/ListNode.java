package linked;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {

        StringBuffer res = new StringBuffer();
        res.append(val + " > ");
        while (next != null) {
            res.append(next.val);
            if (next.next != null) {
                res.append(" > ");
            }
            next = next.next;
        }
        return res.toString();
    }
}
