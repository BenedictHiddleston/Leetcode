public class Solution {
    public int numTrees(int n) {
        int[] result = new int[n+1] ;
        if(n==0){return 1 ;}

        result[0] = 1;
        for(int i = 1; i<=n ; i++){
        	result[i] = 0 ;
        }
        for(int i = 1 ; i <=n ; i++)
        {
        	for(int j = 1; j <= i ;j++)
        	{
        		result[i] +=( result[j-1] * result[i-j]) ;     // tricky !!!
        	}
        }
        return result[n] ;

    }
}
