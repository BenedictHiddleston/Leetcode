import java.io.*;

public class Solution {
    public int atoi(String str) {
    	str = str.trim() ;
    	int len = str.length() ;
    	if(len == 0) return 0 ;
    	String newstr = str ;
    	int factor =1 ;
    	if(str.charAt(0) == '-') {
    		factor = -1 ;
    		newstr = str.substring(1) ;
    	}else if(str.charAt(0) == '+') {
    		newstr = str.substring(1) ;
    	}
    	ArrayList<Integer> num = new ArrayList<Integer>() ;
    	int newlen = newstr.length() ;
    	if(newlen == 0) return 0 ;
    	int i = 0 ;
    	while(i < newlen){
    		char mychar = newstr.charAt(i) ;
    		String charstr = mychar + "" ;
    		if(!charstr.matches("[0-9]")) {
    			break ;
    		}else {
    			int digit = Integer.parseInt(charstr) ;
    			num.add(digit) ;
    		}
    		i++ ;
    	}
    	int numLen = num.size() ;
    	long result = 0 ;
    	for(int j = 0; j < numLen; j++) {
    		result += (num.get(j))*Math.pow(10,(numLen - j -1)) ;
    	}
    	result = result * factor ;
    	if(result > Integer.MAX_VALUE) {
    		return Integer.MAX_VALUE ;
    	}else if (result < Integer.MIN_VALUE) {
    		return Integer.MIN_VALUE ;   		
    	}else {
    		return (int)result ;
    	}
    	
    }
}    
