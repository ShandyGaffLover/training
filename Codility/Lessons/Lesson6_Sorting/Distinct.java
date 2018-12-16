import java.util.*;

class Solution {
    public int solution(int[] A) {
        if(A.length==0){
            return 0;
        }
        Arrays.sort(A);
        int prev=A[0];
        int dest=1;
        for(int curr: A){
            if(curr!=prev){
                dest+=1;
                prev=curr;
            }
        }
        return dest;
    }
}
