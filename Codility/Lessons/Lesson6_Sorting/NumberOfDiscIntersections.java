import java.util.*;

class Solution {
    public int solution(int[] A) {
        int dest = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]>=A.length){
                dest += A.length-i;
                continue;
            }
            for(int j=i+1; j<A.length; j++){
                if((A[i]+A[j])>=(j-i)){
                    dest += 1;
                }
            }
        }
        if(dest > 10000000){
            return -1;
        }
        return dest;
    }
}
