
public class BetterSolution {

    public int countConsistentStrings(String allowed, String[] words) {
        // Use a boolean array to mark allowed characters
        // the array is intialized so that all values is false
        boolean[] allowedChars = new boolean[26];
        
        // Populate the boolean array for allowed characters
        for (char c : allowed.toCharArray()) {
            allowedChars[c - 'a'] = true;
        }
        
        int counter = 0;
        
        // Iterate through each word
        for (String word : words) {
            boolean isConsistent = true;
            
            // Check each character of the word
            for (char c : word.toCharArray()) {
                if (!allowedChars[c - 'a']) {
                    isConsistent = false;
                    break;  // Early exit if a non-allowed character is found
                }
            }
            
            // If the word is consistent, increment the counter
            if (isConsistent) {
                counter++;
            }
        }
        
        return counter;
    }
}
