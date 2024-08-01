package strings;

// https://leetcode.com/problems/longest-valid-parentheses/
//32. Longest Valid Parentheses

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int open=0,close=0,maxLen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') open++;
            else close++;

            if(open==close) maxLen=Math.max(maxLen,open*2);
            else if(close>open){
                close=0;
                open=0;
            }
        }
        open=0;
        close=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='(') open++;
            else close++;

            if(open==close) maxLen=Math.max(maxLen,close*2);
            else if(close<open){
                close=0;
                open=0;
            }
        }
        return maxLen;
    }
}
