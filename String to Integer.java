import java.io.*;

public class Solution {
    public int atoi(String str) {

    	int res ;
    	int len = str.length() ;

    	String[] res_raw = new String[len] ;
    	int raw_count = 0 ;
        
        if(len == 0 ) return 0 ;
        // first convert: effective characters
        for(int i = 0 ; i < len ; i++){
        	char mychar = str.charAt(i) ;
        	String char_str = mychar+"" ;
        	if(char_str.matches("[0-9]")){
        		res_raw[raw_count] = char_str ;
        		raw_count++ ;
        	}
        }
        // why output "44nullnull"?

        // second convert
        int len_raw = res_raw.length ;
        if(len_raw == 0) return 0;
        String raw_str = "";
        for (int i = 0; i< len_raw; i++ ) {
        	if(res_raw[i] != null){
        	raw_str = raw_str+res_raw[i] ;
        }
        }
        res = Integer.parseInt(raw_str) ;
        return res ;

    }
}
