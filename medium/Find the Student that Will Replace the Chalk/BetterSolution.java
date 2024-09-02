
public class BetterSolution {

    public int chalkReplacer(int[] chalk, int k) {

        int sum=0;
        
        while (true) {
        
            for (int i = 0; i < chalk.length; i++) {
        
                sum+=chalk[i];
        
            if (sum>k) {
                return i;
            }
            
        
        }
            k=k%sum;
            sum=0;
        }
        
    }
}
