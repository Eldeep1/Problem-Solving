class Solution {
    public int getLucky(String s, int k) {

        String convertedString = new String();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            convertedString += (int) s.charAt(i) - 96;
        }
        for (int i = 0; i < k; i++) {
            sum = 0;

            for (int j = 0; j < convertedString.length(); j++) {
                sum += ((int) convertedString.charAt(j) - 48);

            }
            convertedString = "" + sum;
        }
        return sum;
    }

   
}