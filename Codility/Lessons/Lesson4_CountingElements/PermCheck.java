import java.util.*;

class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<A.length; i++){
            map.put(A[i], i);
        }
        for(int i=1; i<=A.length; i++){
            if(!map.containsKey(i)){
                return 0;
            }
        }
        return 1;
    }
}
