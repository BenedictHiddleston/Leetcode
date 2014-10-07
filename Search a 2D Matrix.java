public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

    	int column = matrix.length ;
    	int row = matrix[0].length ;

    	int left = 0 ;
       	int right = row*column -1 ;

       	while(left <= right) {
       		int mid = left + (right - left)/2 ;             // !
       		int midval = matrix[mid/row][mid%row] ;

       		if (target < midval) {
       			right = mid -1 ;
       		}else if(target > midval){
       			left = mid + 1 ;
       		}else{
       			return true ;
       		}
       	}

       	return false ;        
    }
}
