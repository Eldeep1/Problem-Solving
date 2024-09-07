import data_structures.ListNode;
import data_structures.TreeNode;
public class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        // Base case: if the tree is empty, return false
        if (root == null) {
            return false;
        }
        
        // Start checking from the current node, or move to the left or right subtree
        return exploration(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    // This method checks if the linked list matches the path starting from this tree node
    private boolean exploration(ListNode head, TreeNode root) {
        // If we have reached the end of the linked list, return true (all elements matched)
        if (head == null) {
            return true;
        }
        
        // If we have reached a null node in the tree, return false
        if (root == null) {
            return false;
        }
        
        // If the current node values don't match, return false
        if (head.val != root.val) {
            return false;
        }
        
        // Recursively check left and right subtrees
        return exploration(head.next, root.left) || exploration(head.next, root.right);
    }
}