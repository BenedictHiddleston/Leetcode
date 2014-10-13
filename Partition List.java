/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {

    	if(head == null) return null ;

    	ListNode greater = new ListNode(0) ;
    	ListNode less = new ListNode(0) ;
    	ListNode less_copy = new ListNode(0) ;
    	less_copy = less ;
    	ListNode greater_copy = new ListNode(0) ;
    	greater_copy = greater ;

    	while(head != null){
    		if (head.val < x) {
    			less.next = new ListNode(head.val) ;
    			less = less.next ; 			
    		}else{
    			greater.next = new ListNode(head.val) ;
    			greater = greater.next ; 			

    		}
    		head = head.next ;
    	}
    	less.next = greater_copy.next ;
    	return less_copy.next ;
        
    }
}
