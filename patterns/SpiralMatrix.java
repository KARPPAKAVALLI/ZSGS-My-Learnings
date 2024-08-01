// https://leetcode.com/problems/spiral-matrix/description/
//54. Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left=0,top=0,right=matrix[0].length,bottom=matrix.length;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left<right && top<bottom){
            for(int i=left;i<right;i++){
                ans.add(matrix[left][i]);
            }
            top++;
            for(int i=top;i<bottom;i++){
                ans.add(matrix[i][right-1]);
            }
            right--;
            if(left>=right || top>=bottom){
                break;
            }
            for(int i=right-1;i>=left;i--){
                ans.add(matrix[bottom-1][i]);
            }
            bottom--;
            for(int i=bottom-1;i>=top;i--){
                ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}
