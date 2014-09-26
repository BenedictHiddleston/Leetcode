public class Solution {
    public int singleNumber(int[] A) {
        int len = A.length ;
        HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

        for (int i = 0; i < len ; i++ ) {
            int key = A[i] ;
            if (cache.containsKey(key)) {
                int value = cache.get(key) ;
                cache.put(key, value +1) ;
            }else{
                cache.put(key, 1) ;
            }
            
        }
        int tar = 0 ;
        int tar_val = 1;
        for (int o: cache.keySet() ) {
            if(cache.get(o).equals(tar_val)){
                tar += o ;
                break ;
            }
        }
        return tar ;
    }
}
