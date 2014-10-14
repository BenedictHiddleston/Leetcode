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

	int dep ;

    public int minDepth(TreeNode root) {
        if(root == null) return 0 ;

        if (root.right == null && root.left == null) {
        	return 1 ;
        }else if (root.right == null) {
        	return minDepth(root.left) + 1 ;	
        }else if(root.left == null){
        	return minDepth(root.right) + 1 ;
        }else{
        	return 1 + Math.min(minDepth(root.left), minDepth(root.right)) ;
        }

    }

}
