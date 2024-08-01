package easy.number_of_senior_citizens;



class Solution {
    public int countSeniors(String[] details) {
        // first we initialize sum to the number of people that exissts on the array 
        // then we substract 1 to each person that's age is equals or less than 60
        int sum = details.length;
        for (String element : details) {
            if (element.charAt(11) == '6') {
                if (element.charAt(12) == '0') {
                    sum--;
                }
            } else if (element.charAt(11) < '6') {
                sum--;
            }

        }

        return sum;
    }
}