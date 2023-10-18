package Number;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode cur = head;
        int num1, num2, tmp = 0;
        while (l1 != null || l2 != null || tmp == 1) {
            num1 = (l1 != null) ? l1.val : 0;
            num2 = (l2 != null) ? l2.val : 0;
            cur.val = (num1 + num2 + tmp) % 10;
            tmp = (num1 + num2 + tmp) / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (l1 == null && l2 == null && tmp == 0) {
                break;
            } else {
                cur.next = new ListNode();
                cur = cur.next;
            }
        }
        return head;
    }

        public static class ListNode {

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
        }
}
