//https://leetcode.com/problems/pascals-triangle/
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            long curr=1;
            ArrayList<Integer> elems=new ArrayList<>();
            elems.add(1);
            for(int j=1;j<=i;j++){
                curr*=(i-j+1);
                curr/=j;
                elems.add((int)curr);
            }
            ans.add(elems);
        }
        return ans;
    }
}
