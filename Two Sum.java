public class Solution {

	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>() ;

    public int[] twoSum(int[] numbers, int target) {

    	int len = numbers.length ;
    	int[] result = new int[2] ;

    	for (int i = 0; i< len ; i++) {
    		hm.put(numbers[i] , i) ;
    	}

    	for (int m = 0; m < len; m++) {
    		Integer n = hm.get(target - numbers[m]);
    		if(n != null && n != m){
    			result[0] = Math.min(m,n) ;
    			result[1] = Math.max(m, n) ;
    			result[0]++ ;
    			result[1]++ ;
    			return result ;
    		}
    	}
    	
    	return result ;

        
    }
}
