
public class Solution {

    public int[][] construct2DArray(int[] original, int m, int n) {
 
         if (m * n != original.length) {
             return new int[0][0];
         }
 
         int[][] result = new int[m][n];
 
         int row = 0;
 
         for (int i = 0; i < original.length; i++) {
             result[row][i % n] = original[i];
 
             if (m != 1) {
                 if ((i + 1) % n == 0) {
                     row++;
                 }
             }
 
         }
 
         return result;
     }
 }