import data_structures.ListNode;

public class FasterSolution {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode result = head;

        while (head.next != null) {

            ListNode tmp = new ListNode(gcd(head.val, head.next.val));

            tmp.next = head.next;
            head.next = tmp;
            head = head.next.next;

        }

        return result;
    }

    private int gcd(int a, int b) {
        if (a == 1 || b == 1) {
            return 1;
        }
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
