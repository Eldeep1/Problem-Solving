
public class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        if (mean>6) {
            return new int[]{};
        }
        int temp=0;
        for (int i = 0; i < rolls.length; i++) {
            temp+=rolls[i];
        }
        int wanted=(mean*(rolls.length+n))-temp;
        if (wanted>n*6|| wanted<0||wanted<n) {
            return new int[]{};
        }
        int [] output = new int[n];
        for (int i = 0; i < output.length; i++) {
            output[i]=1;
        }

        
        wanted=wanted-output.length;
        int i=0;
        while (wanted>0) {
            if (wanted+output[output.length-1]<7) {
                output[output.length-1]+=wanted;
                return output;
            }
            output[i]+=5;
            wanted-=5;
            i++;
        }
        return output;
        }
}
