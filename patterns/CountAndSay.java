package patterns;

// https://leetcode.com/problems/count-and-say/description/
//38. Count and Say
//The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
//  countAndSay(1) = "1"
//  countAndSay(n) is the run-length encoding of countAndSay(n - 1).
//  Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".
//  Given a positive integer n, return the nth element of the count-and-say sequence.

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder prev=new StringBuilder("1");
        StringBuilder curr=new StringBuilder("");
        for(int i = 1; i < n; i++) {
            curr=new StringBuilder("");
            int j=0,k;
            while (j<prev.length()){
                k=j+1;
                int count=1;
                while (k<prev.length() && prev.charAt(j)==prev.charAt(k)){
                    k++;
                    count++;
                }
                curr.append(count);
                curr.append(prev.charAt(j));
                j=k;
            }
            prev=curr;
        }
        return prev.toString();
    }
}
