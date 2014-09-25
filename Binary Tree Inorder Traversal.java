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

    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        inorderAdd(root) ;
        return result ;

    }

    public void inorderAdd(TreeNode focus) {
    	if(focus != null){
    		
    		inorderAdd(focus.left) ;
    		result.add(focus.val) ;
    		inorderAdd(focus.right) ;
    	}
    }
}
