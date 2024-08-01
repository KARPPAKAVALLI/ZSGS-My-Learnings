//QUESTION: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
// LC 22 LINK: https://leetcode.com/problems/generate-parentheses/description/ 
class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        generate("(",n-1,n,ans);
        return ans;
    }
    public static void generate(String s,int open,int close,ArrayList<String> ans){
        if(open>close){
            return ;
        }
        else if(open>0 && close>0){
            generate(s+"(",open-1,close,ans);
            generate(s+")",open,close-1,ans);
        }
        else if (close>0){
            generate(s+")",open,close-1,ans);
        }
        else if(open>0){
            generate(s+"(",open-1,close,ans);
        }
        else{
            ans.add(s);
        }
    }
}
