import java.util.HashSet;
import data_structures.ListNode;

public class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> numHashSet= new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numHashSet.add(nums[i]);
        }
        while (true) {
            if (numHashSet.contains(head.val)) {
                head=head.next;
            }
            else if (head.next==null) {
                return head;
            }
            else{
                break;
            }
        }
        ListNode back=head;
        ListNode front=head.next;
        while (front!=null) {
            if (numHashSet.contains(front.val)) {
                front=front.next;
                back.next=front;
            }
            else{
                back=front;
                front=front.next;
            }
        }
        return head;
    }
}

