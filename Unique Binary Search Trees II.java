/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; left = null; right = null; }
 * }
 */
public class Solution {
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n) ;
    }

    public List<TreeNode> generateTrees(int start, int end){
        List<TreeNode> list = new ArrayList<>() ;
        if (end < start) {
            list.add(null) ;
            return list ;
        }
        for (int i = start; i <=end ;i++ ) {
            List<TreeNode> lefts = generateTrees(start, i-1) ;
            List<TreeNode> rights = generateTrees(i+1, end) ;
        

        for (TreeNode left: lefts) {
            for (TreeNode right: rights) {
                TreeNode root = new TreeNode(i) ;
                root.left = left ;
                root.right = right ;
                list.add(root) ;
            }
        }
        }
        return list ;
    }
}
