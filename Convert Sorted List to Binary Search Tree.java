/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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

    public TreeNode sortedListToBST(ListNode head) {
    	if(head == null) return null ;
    	if(head.next == null) {
    	    TreeNode root = new TreeNode(head.val) ;
    	    return root ;
    	}
    	ArrayList<Integer> val_array = new ArrayList<Integer>() ;
    	while(head != null){
    		val_array.add(head.val) ;
    		head = head.next ;
    	}
    	int length = val_array.size() ;


    	int start = 0 ;
    	int end = length -1 ;
    	
    	return addNode(val_array, 0, length -1) ;

           
    }

    public TreeNode addNode(ArrayList<Integer> array, int start, int end){
    	if (end < start) {
    		return null ;
    	}

    	int mid = start + (end - start)/2 ;
    	TreeNode root = new TreeNode(array.get(mid)) ;

    	root.left = addNode(array, start, mid -1);
    	root.right = addNode(array, mid+1, end) ;
    	return root ;
    }

 
     
}
