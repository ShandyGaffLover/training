// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        
        for(int i = 0; i < K; i++){
            A = rotate(A);
        }
        
        return A;
    }
    
    private int[] rotate(int[] A){
        if(A.length < 2){
            return A;
        }
        int the_last_element = A[A.length-1];
        for(int k = A.length-1; k > 0; k--){
            A[k] = A[k-1];
        }
        A[0] = the_last_element;
        return A;
    }
}