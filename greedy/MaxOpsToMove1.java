// https://leetcode.com/problems/maximum-number-of-operations-to-move-ones-to-the-end/description/
//3228. Maximum Number of Operations to Move Ones to the End
class Solution {
    public int maxOperations(String s) {
        int prevOne=0,count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                count+=prevOne;
                while(i<s.length() && s.charAt(i)!='1'){
                    i++;
                }
            }
            prevOne++;
        }
        return count;
    }
}
