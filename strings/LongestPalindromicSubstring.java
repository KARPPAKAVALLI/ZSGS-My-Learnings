package strings;

// https://leetcode.com/problems/longest-palindromic-substring/
// 5. Longest Palindromic Substring

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int left=0, right=0, maxLen=0;

        int ansL=0,ansR=0;
        for(int i=0;i<s.length();i++){
            //odd length palindrome checking
            left=i;
            right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxLen){
                    maxLen=right-left+1;
                    ansL=left;
                    ansR=right;
                }
                left--;
                right++;
            }

            //even length palindrome checking
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxLen){
                    maxLen=right-left+1;
                    ansL=left;
                    ansR=right;
                }
                left--;
                right++;
            }
        }
        return s.substring(ansL,ansR+1);
    }
}
