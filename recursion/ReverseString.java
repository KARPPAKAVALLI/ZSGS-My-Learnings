//https://leetcode.com/problems/reverse-string/description/
//344. Reverse String
class ReverseString {
    public void reverseString(char[] s) {
        swap(s,0,s.length-1);
    }
    public void swap(char[]s,int i,int j){
        if(i>=j){
            return;
        }
        char t=s[i];
        s[i]=s[j];
        s[j]=t;
        swap(s,i+1,j-1);
    }
}
