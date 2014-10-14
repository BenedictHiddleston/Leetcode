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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    	// len == 0 ?
    	int in_len = inorder.length ;
    	int post_len = postorder.length ;
    	int in_start = 0 ;
    	int in_end = in_len -1 ;
    	int post_start = 0 ;
    	int post_end = post_len -1 ;

    	return buildSubTree(inorder, in_start, in_end, postorder, post_start, post_end) ;
 
        
    }

    public TreeNode buildSubTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd){

    	if(inEnd < inStart || postEnd < postStart) return null ;

    	int rootVal = postorder[postEnd] ;
    	TreeNode root = new TreeNode(rootVal) ;

    	// find k in inorder
    	int k ;
    	for (int i = inStart; i <= inEnd; i++) {
    		if (inorder[i] == rootVal) {
    			k = i ;
    			break ;
    		}
    	}

    	TreeNode root.left = buildSubTree(inorder, inStart, k-1, postorder, postStart, (postStart+k-(inStart+1)));
    	TreeNode root.right = buildSubTree(inorder, k+1, inEnd, postorder, postEnd-inEnd+k , postEnd-1) ;

    	return root ;
    }
}
