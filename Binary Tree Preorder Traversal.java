import java.util.* ;

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
    
	ArrayList<Integer> result = new ArrayList<Integer>() ;

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        preorderAdd(root) ;
        return result ;

    }

    public void preorderAdd(TreeNode focus) {
    	if(focus != null){
    		result.add(focus.val) ;
    		preorderAdd(focus.left) ;
    		preorderAdd(focus.right) ;
    	}
    }
}
