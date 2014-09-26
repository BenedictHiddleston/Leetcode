public class Solution {
    public int searchInsert(int[] A, int target) {
        int len =  A.length ;
        int result = 0 ;
        if (len == 0) return 0;
        if (target < A[0]) return 0;
        if (target > A[len - 1]) {
            return len ;
        }
        for (int i = 0; i < len ; i++ ) {
            if (target == A[i]) {
                result = i ;
                break;
            }else if (target > A[i] && target < A[i+1]) {
                result = i+1 ;
                break ;
            }
        }
          return result ;  
        }
    }
