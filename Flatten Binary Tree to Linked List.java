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

// test version on Eclipse

/*
import java.util.ArrayList;

public class Solution {
    public static void flatten(TreeNode root) {
        if(root == null) return ;

        TreeNode root_copy = root ;
        TreeNode root_copy2 = root ;

        ArrayList<Integer> vals = new ArrayList<Integer>() ;

        getVals(vals, root) ;
        
        System.out.println(vals) ;

        int len = vals.size() ;

        for(int i = 0 ; i < len; i++){
        	root_copy.right = new TreeNode(vals.get(i)) ;
        	root_copy = root_copy.right ;
        }

        root = root_copy2.right ;
        
        // System.out.println(root.right.right.val) ;
        
        while(root != null){
        	System.out.println(root.val) ;
        	root = root.right ;
        }

        return ; 
    }

    public static void getVals(ArrayList<Integer> vals, TreeNode node) {
    	if(node == null) return ;

    	vals.add(node.val) ;
    	getVals(vals, node.left) ;
    	getVals(vals, node.right) ;

    	return ;
    }
    
    public static void main(String[] args){
    	
    	TreeNode root = new TreeNode(0) ;
    	flatten(root) ;
    	
    }
}
*/
