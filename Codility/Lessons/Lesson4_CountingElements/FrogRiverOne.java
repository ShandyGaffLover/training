import java.util.*;

class Solution {
    public int solution(int X, int[] A) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                continue;
            }
            map.put(A[i], i);
        }
        
        if(map.size()<X){
            return -1;
        }
        
        int dest = 0;
        for(int i=1; i<=X; i++){
            if(map.get(i)>dest){
                dest = map.get(i);
            }
        }
        
        return dest;
    }
}
