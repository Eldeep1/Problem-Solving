class Solution {
    func isPowerOfFour(_ n: Int) -> Bool {
        var tmp:Double = Double(n)

        while tmp>1 {
            tmp=tmp/4.0
        }
        if tmp==1 {
            return true
        }
        return false
    }
}