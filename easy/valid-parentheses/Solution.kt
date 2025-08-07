
class Solution {
    fun isValid(s: String): Boolean {
        val stack= ArrayDeque<Char>()
        for (char in s){
            if(!stack.isNotEmpty() && (char==')'||char==']'|| char =='}')){
                return false
            }
            if(char==')'){
                if(stack.removeLast()=='(' ){
                    continue
                }
                return false
            }
            else if (char == '}' ){
                if(stack.removeLast()=='{'){
                    continue
                }
                return false
            }
            else if (char == ']' ){

                if(stack.removeLast()=='['){
                    continue
                }
                return false
            }
            else{
                stack.add(char)
            }
        }
        return !stack.isNotEmpty()
    }
}
