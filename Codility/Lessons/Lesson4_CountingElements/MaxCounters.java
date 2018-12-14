import java.util.*;

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int accumulation_of_max_val = 0;
        int max_val = 0;
        int increasing_one = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==N+1){
                accumulation_of_max_val += max_val;
                counters = new int[N];
                max_val = 0;
                continue;
            }
            increasing_one = A[i]-1;
            counters[increasing_one]+=1;
            if(counters[increasing_one]>max_val){
                max_val = counters[increasing_one];
            }
        }
        for(int i=0; i<N; i++){
            counters[i] += accumulation_of_max_val;
        }
        return counters;
    }
}
