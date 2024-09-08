import data_structures.ListNode;

public class Solution {

    public ListNode[] splitListToParts(ListNode head, int k) {
        // Step 1: Calculate the length of the list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Determine the size of each part
        int partSize = length / k;   // Minimum size of each part
        int remainder = length % k;  // Extra nodes to distribute

        // Step 3: Create the output array of parts
        ListNode[] parts = new ListNode[k];
        
        current = head;

        for (int i = 0; i < k; i++) {
            // Step 4: Set the current part
            parts[i] = current;
            int currentPartSize = partSize + (remainder > 0 ? 1 : 0);  // Add extra node to the first `remainder` parts
            remainder--;

            // Step 5: Advance the pointer and disconnect the part from the rest of the list
            for (int j = 0; j < currentPartSize - 1; j++) {
                if (current != null) {
                    current = current.next;
                }
            }

            // Disconnect the current part
            if (current != null) {
                ListNode nextPart = current.next;
                current.next = null;  // Cut off the current part from the rest
                current = nextPart;
            }
        }

        return parts;
    }

   
}
