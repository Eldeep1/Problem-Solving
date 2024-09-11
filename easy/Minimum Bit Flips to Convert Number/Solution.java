
class Solution {

    public int minBitFlips(int start, int goal) {
        String startAsBinary=convertToBinary(start);
        String goalAsBinary=convertToBinary(goal);
        int counter=0;

        if (startAsBinary.length()!=goalAsBinary.length()) {
            if (startAsBinary.length()>goalAsBinary.length()) {
                while (startAsBinary.length()!=goalAsBinary.length()) {
                    goalAsBinary="0"+goalAsBinary;
                }
            }
            else {
                while (startAsBinary.length()!=goalAsBinary.length()) {
                    startAsBinary="0"+startAsBinary;
                }
            }
        }

        for (int i = 0; i < goalAsBinary.length(); i++) {
            if (goalAsBinary.charAt(i)!= startAsBinary.charAt(i)) {
                counter++;
            }
        }
        return counter;

    }

    private String convertToBinary(int number){
        String result="";
        while (number!=0) {
            if(number%2==1){
                result="1"+result;
            }
            number=number/2;
        }
        
        return result;
    }
}