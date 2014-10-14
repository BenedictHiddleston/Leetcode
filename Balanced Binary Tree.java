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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true ;

        int min = minDepth(root) ;
        int max = maxDepth(root) ;

        return (max - min)<= 1 ;
    }

    public int minDepth(TreeNode node) {

    	if(node == null) return 0 ;

    	return 1 + Math.min(minDepth(node.left), minDepth(node.right)) ;

    }

    public int maxDepth(TreeNode node) {

    	if(node == null) return 0 ;

    	return 1 + Math.max(maxDepth(node.left), maxDepth(node.right)) ;

    }
}
