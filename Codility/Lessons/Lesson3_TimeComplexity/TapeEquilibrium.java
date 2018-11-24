// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        int ret = Integer.MAX_VALUE; 
        int diff;
        for(int p=1; p<A.length; p++){
            diff = calc_diff(A, p);
            if(diff<ret){
                ret=diff;
            }
        }
        return ret;
    }
    private int calc_diff(int[] A, int p){
        int former=0;
        for(int i=0; i<p; i++){
            former+=A[i];
        }
        int latter=0;
        for(int j=p; j<A.length; j++){
            latter+=A[j];
        }
        return Math.abs(former-latter);
    }
}