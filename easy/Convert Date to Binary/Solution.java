
public class Solution {
    public String convertDateToBinary(String date) {
        String result ="";
       

        result += convertToBinary(date.substring(0, 4))+"-"+convertToBinary(date.substring(5, 7))+"-"+convertToBinary(date.substring(8, 10));
        
        return result;
    }
    public String convertToBinary(String date){
        String result="";
        int num=Integer.parseInt(date);
        while (num!=0) {
            if (num%2==1) {
                result="1"+result;
            }
            else{
                result="0"+result;
            }
            num=num/2;
        }
        return result;
    }   
}
