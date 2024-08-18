//https://leetcode.com/problems/spiral-matrix-iv/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int matrix[][]=new int[m][n];
        for(int a[]:matrix){
            Arrays.fill(a,-1);
        }
        int left=0,right=n,top=0,bottom=m;

        ListNode temp=head;

        while(temp!=null){
            for(int i=left;i<right && temp!=null;i++){
                matrix[left][i]=temp.val;
                temp=temp.next;
            }
            top++;
            for(int i=top;i<bottom && temp!=null;i++){
                matrix[i][right-1]=temp.val;
                temp=temp.next;
            }
            right--;
            for(int i=right-1;i>=left && temp!=null;i--){
                matrix[bottom-1][i]=temp.val;
                temp=temp.next;
            }
            bottom--;
            for(int i=bottom-1;i>=top && temp!=null;i--){
                matrix[i][left]=temp.val;
                temp=temp.next;
            }
            left++;
        }
        return matrix;
    }
}
