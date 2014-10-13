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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null ;
        if (l1 == null) return l2 ;
        if (l2 == null) return l1 ;

        ListNode res = new ListNode(0) ;
        ListNode res_copy = res ;

        while(l1 != null || l2 != null){
        	if(l2 ==null){
        		while(l1 != null){
        			res.next = new ListNode(l1.val) ;
        			l1 = l1.next ;
        			res = res.next ;  
        		}
        	}else if(l1 == null){
        		while(l2 != null){
        			res.next = new ListNode(l2.val) ;
        			l2 = l2.next ;
        			res = res.next ;  
        		}        	
        	}else{
        		if(l1.val <= l2.val){
        			res.next = new ListNode(l1.val) ;
        			l1 = l1.next ;
        			res = res.next ;  
        		}else{
        			res.next = new ListNode(l2.val) ;
        			l2 = l2.next ;
        			res = res.next ;  
        		}
        	}

        	  
    }

    return res_copy.next ;
        }
}
