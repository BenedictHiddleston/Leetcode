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

	int max ;
    public int maxPathSum(TreeNode root) {

    	if(root == null){
    		max = 0;
    	}else {
    		max = root.val ;
    	}

    	findMax(root) ;

    	return max ;
        
    }

    public int findMax(TreeNode node){
    	if(node == null) return 0;

    	int left = Math.max(findMax(node.left), 0) ;
    	int right = Math.max(findMax(node.right), 0) ;

    	// link to my ancestor?
    	max = Math.max(max, node.val + left + right) ;

    	// my path for max
    	return node.val + Math.max(left, right) ;
    }
}
