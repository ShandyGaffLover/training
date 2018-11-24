// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : A){
            map.put(a, a);
        }
        for(int k=1; k< A.length+1; k++){
            if(!map.containsKey(k)){
                return k;
            }
        }
        return A.length+1;

    }
}