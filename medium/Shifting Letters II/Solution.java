class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
    int n = s.length();
    int[] shiftArray = new int[n + 1]; // Use a difference array for efficient range updates
    
    for (int[] shift : shifts) {
        int start = shift[0];
        int end = shift[1];
        int direction = shift[2] == 1 ? 1 : -1; 
        
        shiftArray[start] += direction;
        shiftArray[end + 1] -= direction; // End + 1 marks where the shift ends
    }
    
    int currentShift = 0;
    char[] result = s.toCharArray();
    for (int i = 0; i < n; i++) {
        currentShift += shiftArray[i]; 
        int netShift = (currentShift % 26 + 26) % 26; // Ensure non-negative and within bounds
        result[i] = (char) ('a' + (result[i] - 'a' + netShift) % 26);
    }
    
    return new String(result);
}


}