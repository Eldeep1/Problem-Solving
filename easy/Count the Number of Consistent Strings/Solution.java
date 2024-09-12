import java.util.*;

public class Solution {
    
    public int countConsistentStrings(String allowed, String[] words) {
     int counter = 0;
     HashSet<Character> wordsHashSet = new HashSet<Character>();
      
        for (int i = 0; i < words.length; i++) {

            wordsHashSet.clear();

            for (int j = 0; j < words[i].length(); j++) {
                wordsHashSet.add(words[i].charAt(j));
            }
            for (int j = 0; j < allowed.length(); j++) {
                wordsHashSet.remove(allowed.charAt(j));
            }

            if (wordsHashSet.size()==0) {
                counter++;
            }
        }

     return counter;
    }
}
