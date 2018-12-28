import java.util.*;

class Solution {
    public int solution(int[] A) {
        // As the reading material says
        int sum = A[0];
        int dest = sum;
        
        for(int i=1; i<A.length; i++){
            sum = Math.max(sum+A[i], A[i]);
            dest = Math.max(dest, sum);
        }
        return dest;
        
    }
}
