import java.util.*;
public class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> answer= new ArrayList<String>();
        boolean[] trackingUsed=new boolean[words.length];
        for (int i = 0; i < words.length-1; i++) {
            String current=words[i];
            if (trackingUsed[i]) {
                continue;
            }
            for (int j = i+1; j < words.length; j++) {
                if (trackingUsed[j]) {
                    continue;
                }
                String subString=words[j];
                if (current.length()>=subString.length()) {
                    if (current.contains(subString)) {
                        answer.add(subString);
                        trackingUsed[j]=true;
                    }
                }
                else{
                    if (subString.contains(current)) {
                        answer.add(current);
                        trackingUsed[i]=true;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
