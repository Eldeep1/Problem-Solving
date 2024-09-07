import data_structures.ListNode;
import data_structures.TreeNode;
public class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        
        return exploration(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean exploration(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }
        
        if (root == null) {
            return false;
        }
        
        if (head.val != root.val) {
            return false;
        }
        
        return exploration(head.next, root.left) || exploration(head.next, root.right);
    }
}