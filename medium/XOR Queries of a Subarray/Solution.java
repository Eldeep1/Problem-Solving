class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        int[] output=new int [queries.length];
        
        
        for (int i = 0; i < queries.length; i++) {

            output[i]=arr[queries[i][0]];

            for (int j = queries[i][0]+1; j < queries[i][1]+1; j++) {
                output[i]=arr[j]^output[i];
            
            }
        }

        
        
        return output;
    }   
}