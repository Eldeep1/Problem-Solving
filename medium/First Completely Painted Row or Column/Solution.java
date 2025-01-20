import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int count =0;
        int m = mat.length;
        int n = mat[0].length;
        int[] rows= new int[m];
        int[] columns= new int[n];
        Map<Integer,int[]> positions= new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                positions.put(mat[i][j], new int[]{i,j});
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int index=arr[i];
            int[] tmp =positions.get(index);
            rows[tmp[0]]++;
            columns[tmp[1]]++;
            if (rows[tmp[0]]==m || columns[tmp[1]]==n) {
                return i;
            }
        }

        return 0;
    }
}
