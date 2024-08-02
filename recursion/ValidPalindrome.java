// https://leetcode.com/problems/valid-palindrome/description/
//125. Valid Palindrome
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z')
            sb.append(s.charAt(i));
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            sb.append(Character.toLowerCase(s.charAt(i)));
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        int i=0,j=sb.length()-1;
        return check(sb.toString(),i,j);
    }
    public boolean check(String s,int i,int j){
        if(i>j)
        return true;
        if(s.charAt(i)!=s.charAt(j))
        return false;
        else
        return check(s,i+1,j-1);
    }
}
