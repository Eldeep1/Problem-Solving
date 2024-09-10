import data_structures.ListNode;

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode result = head;

        while (head.next != null) {

            for (int i = Math.min(head.val, head.next.val); i >= 0; i--) {
                System.out.println("iteration: " + i + " head.next.val: " + head.next.val + "head.val :" + head.val);
                if (head.val % i == 0 && head.next.val % i == 0) {
                    System.out.println("we added it !" + i);

                    ListNode tmp = new ListNode(i);

                    tmp.next = head.next;
                    head.next = tmp;
                    head = head.next.next;
                    break;
                }
            }
        }
        return result;
    }
}