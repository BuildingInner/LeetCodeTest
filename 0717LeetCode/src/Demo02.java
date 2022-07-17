public class Demo02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return getSumOfTwoNode(l1, l2, 0);
    }

    public ListNode getSumOfTwoNode(ListNode l1, ListNode l2, int bit) {
        if (l1 == null && l2 == null && bit == 0) {
            return null;
        }
        int value = bit;
        if (l1 != null) {
            value += l1.val;
            l1 = l1.next;
        }

        if (l2 != null) {
            value += l2.val;
            l2 = l2.next;
        }
        ListNode node = new ListNode(value % 10);
        node.next = getSumOfTwoNode(l1, l2, value / 10);
        return node;
    }

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
