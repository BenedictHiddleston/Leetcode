/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {

        int len = num.length ;
        int start = 0 ;
        int end = len -1 ;

        return subTree(num, start, end) ;       
    }

    public TreeNode subTree(int[]num, int start, int end){
        if(end < start) return null ;

        int mid = start + (end - start)/2 ;

        TreeNode root = new TreeNode(num[mid]) ;

        root.left = subTree(num, start, mid -1) ;
        root.right = subTree(num, mid +1, end) ;
        return root ;
    }
}
