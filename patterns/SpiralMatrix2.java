//https://leetcode.com/problems/spiral-matrix-ii/
class Solution {
    public int[][] generateMatrix(int n) {
        int left=0,right=n,top=0,bottom=n;
        int c=1;
        int matrix[][]=new int[n][n];
        while (left<right && top<bottom){
            for (int i = left; i <right ; i++) {
                matrix[top][i]=c++;
            }
            top++;
            for (int i = top; i <bottom ; i++) {
                matrix[i][right-1]= c++;
            }
            if(left>=right || top>=bottom)
                break;
            right--;
            for (int i = right-1; i >=left ; i--) {
                matrix[bottom-1][i]= c++;
            }
            bottom--;
            for (int i = bottom-1; i >=top ; i--) {
                matrix[i][left]= c++;
            }
            left++;
        }
        return matrix;
    }
}
