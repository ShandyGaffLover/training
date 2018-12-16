import java.util.*;

class Solution {
    public int solution(int[] A) {
        if(A.length==0){
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>(100001,1);
        for(int curr: A){
            map.put(curr, 1);
        }
        return map.size();
    }
}
