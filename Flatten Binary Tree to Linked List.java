// pre-order

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
    public void flatten(TreeNode root) {
        if(root == null) return ;

        TreeNode root_copy = root ;
        TreeNode root_copy2 = root ;

        ArrayList<Integer> vals = new ArrayList<Integer>() ;

        getVals(vals, root) ;

        int len = vals.size() ;

        for(int i = 0 ; i < len; i++){
        	root_copy.right = new TreeNode(vals.get(i)) ;
        	root_copy = root_copy.right ;
        }

        root = root_copy2.right ;

        return ; 
    }

    public void getVals(ArrayList<Integer> vals, TreeNode node) {
    	if(node == null) return ;

    	vals.add(node.val) ;
    	getVals(vals, node.left) ;
    	getVals(vals, node.right) ;

    	return ;
    }
}
