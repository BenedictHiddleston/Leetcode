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

    TreeNode node1 = null ;
    TreeNode node2 = null;
    TreeNode pre = null ;

    public void recoverTree(TreeNode root) {
        searchTree(root) ;
        //swap
        int temp ;
        temp = node1.val ;
        node1.val = node2.val ;               //!!!!!!!!!!!!
        node2.val = temp ;
        return ;

    }

    public void searchTree(TreeNode node){
        if(node == null) return ;

        searchTree(node.left) ;
        if(pre!=null)
       { if(node.val <= pre.val){
                   // store pre info
            if(node1 == null) 
                node1 = pre ;
                                                        // !!!!!!!!!!
                node2 = node ;
            
               }
           }

        
        pre = node ;
        searchTree(node.right) ;
        

    }
}
