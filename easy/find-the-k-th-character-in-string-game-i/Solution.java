class Solution {
    public char kthCharacter(int k) {
        StringBuilder word=new StringBuilder("a");
        while(word.length()<k){
                    StringBuilder tmpWord=new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                if(word.length()>k){
                    break;
                }
                tmpWord.append(word.charAt(i));
                tmpWord.append((char)((word.charAt(i)+1)%'z'));
            }
            word=tmpWord;

        }
        return word.charAt(k-1);
    }
}