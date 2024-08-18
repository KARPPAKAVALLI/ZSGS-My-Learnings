//https://leetcode.com/problems/spiral-matrix-iii/
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][]ans=new int[rows*cols][2];
        int i=rStart,j=cStart,k=1;
        int index=0;
        ans[index++]=new int[]{rStart,cStart};
        while(index<rows*cols){
            
            for(int x=j+1;x<=j+k;x++){
                if(i>=0 && i<rows && x<cols && x>=0)
                    ans[index++]=new int[]{i,x};
            }
            j+=k;
            for(int x=i+1;x<=i+k;x++){
                if(x>=0 && x<rows && j<cols && j>=0)
                    ans[index++]=new int[]{x,j};
            }
            i+=k;
            k++;
            for(int x=j-1;x>=j-k;x--){
                if(i>=0 && i<rows && x>=0 && x<cols)
                    ans[index++]=new int[]{i,x};
            }
            j-=k;
            for(int x=i-1;x>=i-k;x--){
                if(j>=0 && j<cols && x>=0 && x<rows)
                    ans[index++]=new int[]{x,j};
            }
            i-=k;
            k++;
        }
        
        return ans;
    }
}
