import java.util.*;

class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
    
        List<Integer> output = new ArrayList<Integer>();
        
        for (int i = 0; i < height.length; i++) {
            if (height[i]>threshold) {
                if (i+1!=height.length) {
                    output.add(i+1);
                }
            }
        }
        return output;
    }
   
}