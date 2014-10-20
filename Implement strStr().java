public class Solution {
    public String strStr(String haystack, String needle) {
    	// KMP
    	int lenN = needle.length() ;
    	int lenH = haystack.length() ;
    	if(lenH < lenN) return null ;
    	if(lenN == 0) return haystack ;

    	char needle0 = needle.charAt(0) ;

    	for(int i = 0; i <= lenH - lenN; i++) {
    		if(haystack.charAt(i) == needle0) {
    			String subString = haystack.substring(i, i+ lenN) ;
    			if(subString == needle) {
    				return haystack.substring(i) ;
    			}
    		}
    	}
    	return null ;
        
    }
}
