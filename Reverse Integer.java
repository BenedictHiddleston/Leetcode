public class Solution {
    public int reverse(int x) {
    	if(x==0) return 0;
        int ab = Math.abs(x) ;
        String str = String.valueOf(ab) ;
        int len = str.length();
        int result = 0 ;
        for (int i = len -1 ; i >= 0; i--)
        {   
        	String temp = str.charAt(i)+"";
        	int this_d = Integer.parseInt(temp);
        	result =result + this_d* (int)Math.pow(10,i) ;
        }
        if(ab!=x){result = 0- result ;}
        
        return result ;
        
    }
