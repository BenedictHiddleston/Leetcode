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
    public ArrayList<Integer> postorderTraversal(TreeNode root) {

    	ArrayList<Integer> res = new ArrayList<Integer>() ;

    	postorderTree(res, root) ;

    	return res ;
        
    }

    public void postorderTree(ArrayList<Integer> resList, TreeNode node ){

    	if(node == null){
    		return ;
    	}else{
    		postorderTree(resList, node.left) ;
    		postorderTree(resList, node.right) ;
    		resList.add(node.val) ;
    		return ;
    	}


    }
}
