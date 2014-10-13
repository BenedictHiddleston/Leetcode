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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0) ;
        ListNode result_copy = new ListNode(0) ;
        result_copy = result ;

        if(l1 == null && l2 == null) return null ;
        if(l1 == null) return l2 ;
        if(l2 == null) return l1 ;

        int temp = 0 ;

        while(l1 != null || l2 != null){
        	if(l2 == null){
        		result.next = new ListNode((l1.val + temp)%10) ;
        		temp = (l1.val + temp)/10 ;
        		l1 = l1.next ;
        	}else if(l1 == null){
        		result.next = new ListNode((l2.val + temp)%10) ;
        		temp = (l2.val + temp)/10 ;
        		l2 = l2.next ;
        	}else{
        		result.next = new ListNode((l1.val + l2.val + temp)%10) ;
        		temp = (l1.val + l2.val + temp)/10 ;
        		l1 = l1.next ;
        		l2 = l2.next ;
        	}
        	result = result.next ;
        }
        if(temp == 1) result.next = new ListNode(1) ;

        return result_copy.next ;
    }
}
