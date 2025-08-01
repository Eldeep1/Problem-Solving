class Solution {
                public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> results = new ArrayList<>();  
            for (int i = 0; i < numRows; i++) {        
                List<Integer> row = new ArrayList<>();
                for (int j = 0; j <= i; j++) {
                    if (j==0||j==i) {
                        row.add(1);
                    }
                    else{
                        Integer sum = results.get(i-1 ).get(j)+results.get(i - 1).get(j - 1);
                        row.add(sum);
                    }
                }
                results.add(row);
            }
            return results;
    }
}