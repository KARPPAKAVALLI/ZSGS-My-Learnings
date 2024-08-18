//https://leetcode.com/problems/pascals-triangle-ii/
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ans=new ArrayList<>();
        long curr=1;
        ans.add((int)curr);
        for(int i=1;i<=rowIndex;i++){
            curr*=(rowIndex-i+1);
            curr/=i;
            ans.add((int)curr);
        }
        return ans;
    }
}
