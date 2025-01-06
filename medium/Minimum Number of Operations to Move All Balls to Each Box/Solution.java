class Solution {
    public int[] minOperations(String boxes) {
        int [] answer = new int[boxes.length()];
        int [] prefixSum= new int[boxes.length()];
        int current=0;
        int right=0;
        int left=0;
        for (int i = 0; i < prefixSum.length-1; i++) {
           if (boxes.charAt(i)=='1') {
               current++;
           }
           right+=current;
           prefixSum[i]=current;
        }
        //handling last index
   
        if (boxes.charAt(prefixSum.length-1)=='1') {
           current++;
        }
        prefixSum[prefixSum.length-1]=current;
   
        for (int i = 0; i < prefixSum.length; i++) {
   
           answer[i]=left+(prefixSum.length-(i+1))*prefixSum[prefixSum.length-1]-right;
           left+=prefixSum[i];
           right-= prefixSum[i];
       }
        return answer;
       }
   }